package week10.HomeworkP1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.function.Function.identity;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;

public class ListOfTransactions {
    public static void main(String[] args) {

        Transaction tr1=new Transaction(new Trader("Trader 1","Milan"),2010,50000);
        Transaction tr2=new Transaction(new Trader("Trader 2","Iasi"),2011,80000);
        Transaction tr3=new Transaction(new Trader("Trader 3","Cambridge"),2012,70000);
        Transaction tr4=new Transaction(new Trader("Trader 4","Bucuresti"),2013,10000);
        Transaction tr5=new Transaction(new Trader("Trader 1","Milan"),2011,70000);
        Transaction tr6=new Transaction(new Trader("Trader 2","Iasi"),2012,90000);
        Transaction tr7=new Transaction(new Trader("Trader 3","Cambridge"),2013,85000);
        Transaction tr8=new Transaction(new Trader("Trader 5","Cambridge"),2015,88000);
        Transaction tr9=new Transaction(new Trader("Trader 6","Milan"),2015,99000);

        List<Transaction> transactions= Arrays.asList(tr1,tr2,tr3,tr4,tr5,tr6,tr7,tr8,tr9);

//        System.out.println(transactions);


        System.out.println("****************************************************************************");
        // Find all transactions from 2011 and sort them by value (small to high)
        List transactionsIn2011=transactions.stream()
                .filter(p->p.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .collect(Collectors.toList());

        System.out.println("All transactions from 2011 sorted by value (A): " + transactionsIn2011);



        System.out.println("****************************************************************************");
        // What are all the unique cities where traders work?
        List <String> uniqueCites=transactions.stream()
                .map(p->p.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("\n" + "All the unique cities where traders work: " + uniqueCites);



        System.out.println("****************************************************************************");
        // Find all traders from “Cambridge” and sort them by name (descending)
        List <Trader> tradersFromCambridge=transactions.stream()
                .map(Transaction::getTrader)
                .filter(p->p.getCity()=="Cambridge")
                .distinct()
                .sorted(comparing(Trader::getName).reversed())
                .collect(Collectors.toList());

        System.out.println("\n" + "All traders from Cambridge sorted by name(D): " + tradersFromCambridge);



        System.out.println("****************************************************************************");
        // Return a string of all traders’ names sorted alphabetically and separated by comma
        String tradersNames=transactions.stream()
                .map(t->t.getTrader().getName())
                .sorted()
                .distinct()
                .reduce("", (t1, t2) -> t1 + ", " + t2);


        System.out.println("\n" + "All traders’names alphabetically: "+ tradersNames);


        System.out.println("****************************************************************************");
        // Determine if there are any traders from Milan
        Boolean tradersFromMilan=transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(t->t.getCity()=="Milan");


        System.out.println("\n" + "Traders from Milan: "+ tradersFromMilan);


        System.out.println("****************************************************************************");
        // Update all transactions so that the traders from Milan are moved to Cambridge
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(tr->tr.getCity()=="Milan")
                .forEach(t->t.setCity("Cambridge"));

        System.out.println("\n" + "Transactions updated:" + "\n" + transactions);



        System.out.println("****************************************************************************");
        // What’s the highest value in all transactions?

        int maxValue=transactions.stream()
                    .map(t->t.getValue())
                    .max((x,y)->Double.compare(x,y)).get();

        System.out.println("\n" + "Highest value of all transactions: " + maxValue);


        System.out.println("****************************************************************************");
        // What’s the transaction with the lowest value?
//        Comparator<Transaction> comparator = Comparator.comparing(Transaction::getValue );
        Transaction transactionWithTheLowestValue=transactions.stream()
                .min(Comparator.comparing(Transaction::getValue )).get();

        System.out.println("\n" + "Transaction with the lowest value: " + transactionWithTheLowestValue);


        //##############################################################################################

//        int minValue=transactions.stream()
//                .map(t->t.getValue())
//                .min((x,y)->Double.compare(x,y)).get();
//
//
//        System.out.println("\n" + "Lowest value of all transactions: " + minValue);
//
//        List transactionWithTheLowestValue2=transactions.stream()
//                .filter(p->p.getValue()==minValue)
//                .collect(Collectors.toList());
//
//        System.out.println("\n" + "Transaction with the lowest value: " + transactionWithTheLowestValue2);



        System.out.println("****************************************************************************");
        // Determine the sum of all transactions for each trader, return a map: Trader name to amount

        Map<Trader, Integer> sumOfAllTransactionsPerTrader = transactions.stream()
                .collect(groupingBy(Transaction::getTrader, Collectors.summingInt(Transaction::getValue)));

        System.out.println("\n" + "Sum of all transactions for each trader: "+ "\n" + sumOfAllTransactionsPerTrader);


        System.out.println("****************************************************************************");
        //2. Given a word, compute the occurences of each letter

        String word=new String("Java   ");

        Map<String, Long> occurencesOfEachLettter =word
                .chars()
                .mapToObj(c -> String.valueOf((char) c).toLowerCase())
                .filter(str -> !str.equals(" "))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println("\n" + "The occurences of each letter: "+ occurencesOfEachLettter);



        System.out.println("****************************************************************************");
        //3. Given a list of sentences, compute the occurences of each letter  //o sa mai revizuiesc aici

        List<String> mySentences=new ArrayList<String>();
        mySentences.add("    Given a list of sentences, compute the occurences of each letter");
        mySentences.add("Given a word, compute the occurences of each letter");

        String myNewSentences=String.join(" ",mySentences);


        Map<String, Long> occurencesOfEachLettterFromAList =myNewSentences
                .chars()
                .mapToObj(c -> String.valueOf((char) c).toLowerCase())
                .filter(str -> !str.equals(" "))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));


        System.out.println("\n" + "The occurences of each letter from a list of sentences: "+ "\n"+ occurencesOfEachLettterFromAList);


    }
}
