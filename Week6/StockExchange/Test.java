package StockExchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Date myDate = new Date(2018, 10, 15);

        StockUpdate su1 = new StockUpdate("AMZN", new Date(2018, 8, 15),55.44);
        StockUpdate su2 = new StockUpdate("MSFT", new Date(2018, 9, 15),36.56);
        StockUpdate su3 = new StockUpdate("INTC", new Date(2018, 6, 11),63.29);
        StockUpdate su4 = new StockUpdate("TSLA", new Date(2018, 10, 23),44.19);


        List<StockUpdate> listOfUpdates = new LinkedList<>();
        List<StockUpdate> listOfQueries = new LinkedList<>();

        StockMarket sm1 = new StockMarket(listOfUpdates,listOfQueries);

        sm1.add(su1);
        sm1.add(su2);
        sm1.add(su3);
        sm1.add(su4);

        System.out.println(sm1);




    }
}
