package Traders;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class TransactionTest {
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


    @Test
    public void when_filter_stream_to_find_all_transaction_from_2011_then_get_filtered_stream() {
        List<Transaction> transactions = new ArrayList<>();
        transactions.addAll(Arrays.asList(transaction1, transaction2, transaction3, transaction4,
                transaction5, transaction6, transaction7, transaction8, transaction9, transaction10));

        List<Transaction> transactionsIn2011 = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .collect(Collectors.toList());

        Assert.assertEquals(Arrays.asList(transaction2, transaction4, transaction8), transactionsIn2011);

    }

    @Test
    public void when_sort_by_value_all_transaction_from_2011_then_get_sorted_stream() {
        List<Transaction> transactions = new ArrayList<>();
        transactions.addAll(Arrays.asList(transaction1, transaction2, transaction3, transaction4,
                transaction5, transaction6, transaction7, transaction8, transaction9, transaction10));

        List<Transaction> transactionsIn2011SortedByValue = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(t -> t.getValue()))
                .collect(Collectors.toList());

        Assert.assertEquals(transactionsIn2011SortedByValue.get(0).getValue(), 4000);
        Assert.assertEquals(transactionsIn2011SortedByValue.get(1).getValue(), 4500);
        Assert.assertEquals(transactionsIn2011SortedByValue.get(2).getValue(), 7000);
    }

    @Test
    public void when_apply_distinct_then_get_a_stream_with_unique_cities() {
        List<Transaction> transactions = new ArrayList<>();
        transactions.addAll(Arrays.asList(transaction1, transaction2, transaction3, transaction4,
                transaction5, transaction6, transaction7, transaction8, transaction9, transaction10));

        List<String> cityList = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());

        Assert.assertEquals(Arrays.asList("Milan", "Paris", "Cambridge", "London"), cityList);
    }

    @Test
    public void when_sort_by_name_all_traders_from_Cambridge_then_get_sorted_stream_in_descending_order() {
        List<Transaction> transactions = new ArrayList<>();
        transactions.addAll(Arrays.asList(transaction1, transaction2, transaction3, transaction4,
                transaction5, transaction6, transaction7, transaction8, transaction9, transaction10));
        List<Trader> tradersFromCambridge = transactions.stream()
                .map(t -> t.getTrader())
                .filter(t -> t.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName).reversed())
                .collect(Collectors.toList());

        Assert.assertEquals(tradersFromCambridge.get(0).getName(), "Ionut");
        Assert.assertEquals(tradersFromCambridge.get(1).getName(), "Bogdan");

    }

    @Test
    public void when_apply_reduce_and_sort_on_stream_then_return_a_string_of_all_traders_names_sorted_alphabeticalley_and_separeted_by_comma() {
        List<Transaction> transactions = new ArrayList<>();
        transactions.addAll(Arrays.asList(transaction1, transaction2, transaction3, transaction4,
                transaction5, transaction6, transaction7, transaction8, transaction9, transaction10));
        String traderNames = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce((x, y) -> x + ", " + y).get();
        Assert.assertEquals("Andrei, Bogdan, Dan, Gabi, George, Ionut, Vlad", traderNames);
    }


    @Test
    public void when_apply_any_match_then_should_return_if_there_is_any_trader_from_Milan() {
        List<Transaction> transactions = new ArrayList<>();
        transactions.addAll(Arrays.asList(transaction1, transaction2, transaction3, transaction4,
                transaction5, transaction6, transaction7, transaction8, transaction9, transaction10));
        boolean tradersFromMilan = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));

        Assert.assertEquals(true, tradersFromMilan);
    }

    @Test
    public void when_traders_from_Milan_are_moved_to_Cambridge_then_update_all_transactions() {
        List<Transaction> transactions = new ArrayList<>();
        transactions.addAll(Arrays.asList(transaction1, transaction2, transaction3, transaction4,
                transaction5, transaction6, transaction7, transaction8, transaction9, transaction10));

        transactions.stream()
                .map(t -> t.getTrader())
                .filter(t -> t.getCity().equals("Milan"))
                .forEach(t -> t.setCity("Cambridge"));

        Assert.assertEquals(transactions.get(0).getTrader().getCity(), "Cambridge");
        Assert.assertEquals(transactions.get(1).getTrader().getCity(), "Paris");
        Assert.assertEquals(transactions.get(2).getTrader().getCity(), "Cambridge");
        Assert.assertEquals(transactions.get(3).getTrader().getCity(), "London");
        Assert.assertEquals(transactions.get(4).getTrader().getCity(), "Cambridge");
        Assert.assertEquals(transactions.get(5).getTrader().getCity(), "Cambridge");
        Assert.assertEquals(transactions.get(6).getTrader().getCity(), "Cambridge");
        Assert.assertEquals(transactions.get(7).getTrader().getCity(), "Cambridge");
        Assert.assertEquals(transactions.get(8).getTrader().getCity(), "Paris");
        Assert.assertEquals(transactions.get(9).getTrader().getCity(), "Cambridge");
    }

    @Test
    public void when_search_highest_value_in_all_transaction_then_get_highest_value() {
        List<Transaction> transactions = new ArrayList<>();
        transactions.addAll(Arrays.asList(transaction1, transaction2, transaction3, transaction4,
                transaction5, transaction6, transaction7, transaction8, transaction9, transaction10));

        Integer highestValue = transactions.stream()
                .map(t -> t.getValue())
                .max((x, y) -> Integer.compare(x, y)).get();

        Assert.assertEquals(20000, highestValue);

    }

    @Test
    public void when_search_lowest_value_in_all_transaction_then_get_lowest_value() {
        List<Transaction> transactions = new ArrayList<>();
        transactions.addAll(Arrays.asList(transaction1, transaction2, transaction3, transaction4,
                transaction5, transaction6, transaction7, transaction8, transaction9, transaction10));

        Integer lowestValue = transactions.stream()
                .map(t -> t.getValue())
                .min((x, y) -> Integer.compare(x, y)).get();

        Assert.assertEquals(1500, lowestValue);
    }

    @Test
    public void when_determin_the_sum_of_all_transactions_for_each_trader_then_return_a_map() {
        List<Transaction> transactions = new ArrayList<>();
        transactions.addAll(Arrays.asList(transaction1, transaction2, transaction3, transaction4,
                transaction5, transaction6, transaction7, transaction8, transaction9, transaction10));

        Map<Trader, Integer> amountForEachTrader = transactions.stream()
                .collect(Collectors.groupingBy(t -> t.getTrader(), Collectors.summingInt(t -> t.getValue())));

        Assert.assertEquals(amountForEachTrader.get(trader1), new Integer(7000));
        Assert.assertEquals(amountForEachTrader.get(trader2), new Integer(12000));
        Assert.assertEquals(amountForEachTrader.get(trader3), new Integer(11000));
        Assert.assertEquals(amountForEachTrader.get(trader4), new Integer(7000));
        Assert.assertEquals(amountForEachTrader.get(trader5), new Integer(8000));
        Assert.assertEquals(amountForEachTrader.get(trader6), new Integer(15000));
        Assert.assertEquals(amountForEachTrader.get(trader7), new Integer(20000));
    }

    @Test
    public void when_string_is_empty_then_there_are_no_occurrences () {
        String word = "";
        char ch = 'c';
        Long occurence = word.chars().filter(c -> c == ch).count();

        Assert.assertEquals(0L, occurence);

    }

    @Test
    public void when_string_is_java_then_the_occurrences_of_letter_a_should_be_two(){
        String word = "java";
        char ch ='a';
        Long occurence = word.chars().filter(c -> c == ch).count();

        Assert.assertEquals(2L, occurence);
    }


    @Test
    public void when_string_is_bbbbb_then_the_occurrences_of_letter_b_should_be_five(){
        String word = "bbbbb";
        char ch = 'b';
        Long occurence = word.chars().filter(c -> c == ch).count();

        Assert.assertEquals(5L, occurence);
    }

}




