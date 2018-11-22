package Traders;

import Transactions.PaymentType;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Transaction {

    private final Trader trader;
    private final int year;
    private final int value;


    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return this.trader;
    }

    public int getYear() {
        return this.year;
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        return "{" + this.trader + ", " +
                "year: " + this.year + ", " +
                "value:" + this.value + "}";
    }

    public static void main(String[] args) {
        Trader trader1 = new Trader("Gabi", "Milan");
        Trader trader2 = new Trader("Vlad", "Paris");
        Trader trader3 = new Trader("Ionut", "Cambridge");
        Trader trader4 = new Trader("Dan", "London");
        Trader trader5 = new Trader("Bogdan", "Cambridge");
        Trader trader6 = new Trader("Andrei", "Milan");
        Trader trader7 = new Trader("George", "Milan");

        Transaction transaction1 = new Transaction(trader1, 2010, 2500);
        Transaction transaction2 = new Transaction(trader2, 2011, 4000);
        Transaction transaction3 = new Transaction(trader3, 2010, 1500);
        Transaction transaction4 = new Transaction(trader4, 2011, 7000);
        Transaction transaction5 = new Transaction(trader5, 2012, 8000);
        Transaction transaction6 = new Transaction(trader6, 2013, 15000);
        Transaction transaction7 = new Transaction(trader7, 2010, 20000);
        Transaction transaction8 = new Transaction(trader1, 2011, 4500);
        Transaction transaction9 = new Transaction(trader2, 2012, 8000);
        Transaction transaction10 = new Transaction(trader3, 2013, 9500);


        List<Transaction> transactions = new ArrayList<>();
        transactions.addAll(Arrays.asList(transaction1, transaction2, transaction3, transaction4,
                transaction5, transaction6, transaction7, transaction8, transaction9, transaction10));


        // 1. Find all transactions from 2011 and sort them by value (small to high)
        List<Transaction> transactionsIn2011sorted = transactions.stream().
                filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(t -> t.value))
                .collect(Collectors.toList());
        System.out.println("List of transactions from 2011 sorted by value : " + transactionsIn2011sorted);

        // 2.What are all the unique cities where traders work?
        List<String> cityList = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("List of cities: " + cityList);

        // 3. Find all traders from “Cambridge” and sort them by name(descending)

        List<Trader> tradersFromCambridge = transactions.stream()
                .map(t -> t.getTrader())
                .filter(t -> t.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName).reversed())
                .collect(Collectors.toList());

        System.out.println("List of traders from Cambridge in descending order: " + tradersFromCambridge);

        // 4. Return a string of all traders’ names sorted alphabetically and separated by comma
        String traderNames = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce((x, y) -> x + ", " + y).get();

        System.out.println("Names of traders sorted alphabetically: " + traderNames);

        // 5. Determine if there are any traders from Milan
        boolean traderFromMilan = transactions.stream().
                anyMatch(t -> t.getTrader().getCity().equals("Milan"));

        System.out.println("There are any traders from Milan? " + traderFromMilan);


        // 6. Update all transactions so that the traders from Milan are moved to Cambridge

        transactions.stream()
                .map(t -> t.getTrader())
                .filter(t -> t.getCity().equals("Milan"))
                .forEach(t -> t.setCity("Cambridge"));

        System.out.println("Update all transactions so that the traders from Milan are moved to Cambridge: " + transactions);


        // 7. What’s the highest value in all transactions?

        Integer highestValue = transactions.stream()
                .map(t -> t.getValue())
                .max((x, y) -> Integer.compare(x, y)).get();

        System.out.println("The highest value in all transactions is: " + highestValue);

        // 8. What’s the transaction with the lowest value?

        Integer lowestValue = transactions.stream()
                .map(t -> t.getValue())
                .min((x, y) -> Integer.compare(x, y)).get();
        System.out.println("The lowest value in all transactions is: " + lowestValue);


        // 9. Determine the sum of all transactions for each trader, return a map: Trader name to amount

        Map<Trader, Integer> amountForEachTrader = transactions.stream().collect(Collectors.groupingBy(t -> t.getTrader(), Collectors.summingInt(t -> t.getValue())));
        System.out.println("Sum of all transactions for each trader: " + amountForEachTrader);

        // Given a word, compute the occurences of each letter

        occuranceLetter("google", 'g');
        occuranceLetter("google", 'o');
        occuranceLetter("google", 'l');
        occuranceLetter("google", 'e');

        //Given a list of sentences, compute the occurences of each letter

        occuranceLetter("good morning", 'g');
        occuranceLetter("good morning", 'o');
        occuranceLetter("good morning", 'd');
        occuranceLetter("good morning", 'm');
        occuranceLetter("good morning", 'r');
        occuranceLetter("good morning", 'n');
        occuranceLetter("good morning", 'i');
    }

    public static void occuranceLetter(String str, char ch) {
        Long occurence = str.chars().filter(c -> c == ch).count();
        System.out.println("Frequency of " + ch + " in word " + str + " = " + occurence);
    }


}
