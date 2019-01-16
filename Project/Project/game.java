package Project;

import java.util.Random;
import java.util.Scanner;



public class game {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();


        String[] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;


        int health = 100;
        int attackDamage = 50;
        int numHealthPots = 5;
        int healthPotionHealAmount = 50;
        int healthPotionDropChance = 50;
        int	healAmountWhenUsed = rand.nextInt(healthPotionHealAmount);

        boolean running = true;
        System.out.println("Welcome to the dungeon!");

        GAME:
        while (running){
            System.out.println("------------------------------------------------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " appeared! #\n");

            while (enemyHealth  > 0){
                System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + "'s HP:" + enemyHealth);
                System.out.println("\n\tWhat would you like to do: ");
                System.out.println("\t1. Attack ");
                System.out.println("\t2. Drink Health Potion.");
                System.out.println("\t3. Run away from enemy.");

                String input = in.nextLine();
                if (input.equals("1")){
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;

                    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " Damage!");
                    System.out.println("\t> You receive " + damageTaken + " in retaliation!");

                    if (health < 1){
                        System.out.println("You have taken too much damage!!");
                        break;
                    }
                }
                else if (input.equals("2")){
                    if(numHealthPots > 0){

                        health += healAmountWhenUsed;
                        numHealthPots--;
                        System.out.println("\t You drink a health potion, healing yourself for " + healAmountWhenUsed + " health" + "."
                                + "\n\t You now have " + health + " health."
                                + "\n\t You now have " + numHealthPots + " Health Potions.");
                    }
                    else{
                        System.out.println("You have no Health potions left! \nDefeat enemies for a chance to get one!");
                    }
                }
                else if (input.equals("3")){
                    System.out.println("\tYou run away from " + enemy + "!");
                    continue GAME;
                }
                else{
                    System.out.println("\t ! INVALID COMMAND !");
                }
            }

            if(health < 1){

                System.out.print("You died.");
                break;
            }

            System.out.println("\n------------------------------------------------------------------------");
            System.out.println(" # "  + enemy + " was defeated! # ");
            System.out.println(" # You have " + health + " HP left. # ");

            if(rand.nextInt(100) > healthPotionDropChance){
                numHealthPots++;
                System.out.println("The enemy dropped a health potion");
                System.out.println("You now have " + numHealthPots + " Health Potions.");
            }
            System.out.println("------------------------------------------------------------------------");
            System.out.println("\n\tWhat would you like to do now?");
            System.out.println("\n\t1. Continue fighting?");
            System.out.println("\n\t2. Exit Dungeon?");

            String input = in.nextLine();
            while(!input.equals("1") && (!input.equals("2"))){
                input = in.nextLine();
            }

            if(input.equals("1")){
                System.out.println("You continue your adventure!");
            }
            if(input.equals("2")){
                System.out.println("You exit the dungeon successfully!");
                break;
            }
        }
        System.out.println("\n# #################### #");
        System.out.println("# Thanks for playing!! #");
        System.out.println("# #################### #");
    }
}
