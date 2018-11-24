package CsvExample;


import javafx.print.Collation;
import org.junit.runner.Description;
import org.junit.runner.manipulation.Sorter;

import java.io.*;
import java.util.*;

public class PersonCSVFile {

    private List<Person> persons = new ArrayList<>();


    // 1. Write a method that parses a String with a CSV structure into a object (populeaza lista de persoane)

    public PersonCSVFile parseFile(File f) throws IOException {//folosim un reader
        return parseFile(new FileReader(f));
    }

    public PersonCSVFile parseFile(Reader reader) throws IOException {
        try (BufferedReader br = new BufferedReader(reader)) {
            String line = "";
            String delims = "[,]";
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] personDetails = line.split(delims);

                for (String s : personDetails) {
                    System.out.println(s);

                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        persons.add(parseLine(""));
        return this;
    }


    // 2. method parse that reads the rows of the file, and one by one convert them to objects and store them into a list.
    // (algoritm conversie din string in person)

    public Person parseLine(String line) {


        return new Person();
    }

    // 3. filterBy (filtreaza dupa un atribut; modifica lista de persoane)//putem folosi o functie lambda cu predicat(vezi exemplul cu Lambda Basic)
    public PersonCSVFile filterBy(String filter) {
        List<Person> filterResult = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().equals(filter) || person.getAge().equals(filter) ||
                    person.getSalary().equals(filter) || person.getOccupation().equals(filter) || person.getNationality().equals(filter)) {
                filterResult.add(person);
            }
        }
        return this;
    }


    //4. sortBy
    public PersonCSVFile sortBy(String criteria) {
        for (Person person : persons){
            if (criteria == person.getName()) {
                persons.sort(Comparator.comparing(Person::getName));
            } else if (criteria == person.getAge()) {
                persons.sort(Comparator.comparing(Person :: getAge));
            } else if (criteria == person.getSalary()) {
                persons.sort(Comparator.comparing(Person::getSalary));
            } else if (criteria == person.getOccupation()) {
                persons.sort(Comparator.comparing(Person::getOccupation));
            } else if (criteria == person.getNationality()) {
            persons.sort(Comparator.comparing(Person::getNationality));
        }
        }
        return this;
    }


    // 5.can write the results of calling the filterBy and sortBy methods to a file with the same CSV file structure.//operatia terminala
    public void export(File f) throws IOException {
        export(new FileWriter(f));

    }

    public void export(Writer writer) throws IOException {
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write("Name");
        bw.write("Age");
        bw.write("Salary");
        bw.write("Occupation");
        bw.write("Nationality");
        bw.newLine();
        for (Person person : persons) {
            bw.write(person.getName());
            bw.write(person.getAge());
            bw.write(person.getSalary());
            bw.write(person.getOccupation());
            bw.write(person.getNationality());
            bw.newLine();
        }
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        PersonCSVFile personCSVFile = new PersonCSVFile();
        personCSVFile.parseFile(new File("D:\\Week9\\CSVFile.csv"));
        

    }


}
