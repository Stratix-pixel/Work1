import math
import os
import random
import re
import sys
import textwrap
import numpy as np
import time
import colors

def add_to_inventory(a,b):
  names=[]
  for i in range(0,len(b)):
    names.append(b[i]["name"])
  for j in range(0,len(a)):
    if a[j]["name"] in names:
      x=names.index(a[j]["name"])
      b[x]["quantity"]=int(b[x]["quantity"])+int(a[j]["quantity"])
    else:
      b.append(a[j])
   
       

  return(b)

def create(file):
    fi=''
    creeps=open(file,'r')
    x=creeps.readlines()
    for i in range(0,len(x)-1):
      fi=fi+x[i]
    choices=[]
    it=re.finditer(r'\{[^\}]*\}',fi,re.S|re.I)
    for i  in it:
        a=eval(i.group(0))
        choices.append(a)
    x=random.choice(choices)
    return(x)
class player:
  def __init__(self,name,hp,mp,ocupation):
    self.name=name
    self.hp=hp
    self.mp=mp
    self.occupation=occupation
    self.xp=0
    self.dmg=1
    self.level=1
    self.inventory=[{'name':'Gold','quantity':'0'}]
  def showstats(self):
    print("Name",self.name,"\n","Occupation: ",self.occupation,"\n","HP: ",self.hp,"\n","MP: ",self.mp,"\n","Damage: ",self.dmg,"\n","Level: ",self.level,"\n","XP: ",self.xp,"/",levelcap[int(self.level)-1])
class item:
    def __init__(self):
      x=create("Items.txt")
      self.name=x["name"]
      self.hpi=x["hpi"]
      self.mpi=x["mpi"]
      self.dmgi=x["dmgi"]
      self.equiped=x["equiped"]
      self.rarity=x["rarity"]
    def showstats(self):
      if self.rarity=="Rare":
        print(colors.cyan(self.name),"\n","HP + ",self.hpi,"\n","MP + ",self.mpi,"\n","Damage + ",self.dmgi,"\n","Rarity: ",self.rarity)
      elif self.rarity=="Common":
        print(colors.yellow(self.name),"\n","HP + ",self.hpi,"\n","MP + ",self.mpi,"\n","Damage + ",self.dmgi,"\n","Rarity: ",self.rarity) 
      elif self.rarity=="Uncommon":
        print(colors.green(self.name),"\n","HP + ",self.hpi,"\n","MP + ",self.mpi,"\n","Damage + ",self.dmgi,"\n","Rarity: ",self.rarity) 
      elif self.rarity=="Epic":
        print(colors.magenta(self.name),"\n","HP + ",self.hpi,"\n","MP + ",self.mpi,"\n","Damage + ",self.dmgi,"\n","Rarity: ",self.rarity) 
      else:
        print(colors.orange(self.name),"\n","HP + ",self.hpi,"\n","MP + ",self.mpi,"\n","Damage + ",self.dmgi,"\n","Rarity: ",self.rarity) 
class mob:
    def __init__(self):
      x=create('Creeps.txt')
      self.name=x["name"]
      self.hp=x["hp"]
      self.damage=x["damage"]
      self.xpdrop=x["xpdrop"]
      self.drop=x["drop"]
    def showstats(self):
      print("Name: ",self.name,"\n","HP: ",self.hp,"\n","Damage: ",self.damage,"\n","XP: ",self.xpdrop)
def drop():
    gold=create('Gold.txt')
    gold["quantity"]=random.randint(2,25)
    l=[]
    l.append(gold)
    itemchance=random.randint(0,100)
    miscchance=random.randint(25,100)
    miscq=random.randint(1,2)
    
    if itemchance>=90:
      dp=create('Items.txt')
      dp["quantity"]=1
      l.append(dp)
    else:
      pass
    if miscchance>=75:
      msc=create('Misc.txt')
      msc["quantity"]=miscq
      l.append(msc)
    else:
      pass
      
    return(l)

    



def fight(ft,creep,player):
  if ft=="y":
    while (int(s.hp) | int(creep.hp) )> 0 :
      time.sleep(0.2)
      crit=random.randint(0,10)
      crit2=random.randint(0,10)
      if crit>7:
        creep.hp=int(creep.hp)-int(s.dmg)*2
        time.sleep(0.2)
        print(creep.name," takes ",colors.cyan(int(s.dmg)*2)," damage")
      else:
        creep.hp=int(creep.hp)-int(s.dmg)
        time.sleep(0.2)
        print(creep.name," takes ",colors.cyan(s.dmg)," damage")
      if int(creep.hp)>=0:
        time.sleep(0.2)
        print(creep.name," HP left: ",creep.hp)
      else:
        break
      time.sleep(0.2)
      if crit2>8:
        print(s.name," takes ",colors.red(int(creep.damage)*2)," damage")
        time.sleep(0.2)
        s.hp=int(s.hp)-int(creep.damage)*2
      else:
        print(s.name," takes ",colors.red(creep.damage)," damage")
        time.sleep(0.2)
        s.hp=int(s.hp)-int(creep.damage)
      time.sleep(0.2)
      print(s.name ," HP left: ",colors.green(s.hp))
    if int(s.hp)>0:
      print("Victory!!","\n","You have gained ",creep.xpdrop," XP")   
      specchance=random.randint(25,100)
      specdrop={"name":"","quantity":""}
      specdrop["name"]=creep.drop
      specdrop["quantity"]=random.randint(1,5)
      drp=[]
      drp=drop()
      if int(specchance) >=50:
       
        drp.append(specdrop)
      
      add_to_inventory(drp,s.inventory)
      for t in range(0,len(drp)):

        if int(drp[t]["quantity"])==1:

          print(colors.yellow("Your loot : "),drp[t]["name"])
        else:
          print(colors.yellow("Your loot : "),drp[t]["quantity"],drp[t]["name"])
      print("Your inventory is :")
      for v in range(len(s.inventory)):
            print(s.inventory[v]["quantity"],s.inventory[v]["name"])

        
      s.xp=int(s.xp)+int(creep.xpdrop)
      if int(s.xp)>=int(levelcap[int(s.level)-1]):       
        s.level=int(s.level)+1
        print("You have gained a level","You are now a level ",s.level," ",s.occupation)
        print("XP: ",colors.cyan(s.xp),colors.cyan("/"),colors.cyan(levelcap[int(s.level)-1]) )  
      else:
        print("XP: ",colors.cyan(s.xp),colors.cyan("/"),colors.cyan(levelcap[int(s.level)-1]) )      
    else:
      print("You have died")
  else:
    print("You change your path to avoid ",creep.name)
levelcap=["10","25","50","100","150"]
occup=["Fighter","Mage"]
name=input("How should this brave warrior be called? ")
i=int(input("Select Occupation: 1 Fighter  2 Mage"))
occupation=occup[i-1]
mp=25*i
hp=(200/i)+50
s=player(name,hp,mp,occupation)
shit=item()
eq=""
s.showstats()
print("In your adventure you find ")
shit.showstats()
print("Would you like to equip? y/n")
eq=input()
if eq=="y":
  s.hp=int(s.hp)+int(shit.hpi)
  s.mp=int(s.mp)+int(shit.mpi)
  s.dmg=int(s.dmg)+int(shit.dmgi)
  shit.equiped=1
  print("You have equiped your ",shit.name)
  s.showstats()
else:
  print("The item has been stored in your inventory")
creep=mob()
print("You see a ",creep.name," in the distance",)
creep.showstats()
print("Do you attack? y/n")
ft=input()
fight(ft,creep,s)
cont=input("Would you like to continue your adventure? y/n ")
while cont !="n" :
  creep=mob()
  print("You see a ",creep.name," in the distance",)
  creep.showstats()
  print("Do you attack? y/n")
  ft=input()
  fight(ft,creep,s)
  cont=input("Would you like to continue your adventure? y/n ")  
