

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Date myDate = new Date();
        Date myDate1 = new Date(2018,8,13);

        StockUpdate su1 = new StockUpdate("AMZN", myDate,55.44);
        StockUpdate su2= new StockUpdate("MSFT", myDate1,36.56);


        List<StockUpdate> listOfUpdates = new LinkedList<>();
        List<StockUpdate> listOfQueries = new LinkedList<>();

        StockMarket sm1 = new StockMarket(listOfUpdates,listOfQueries);

        sm1.add(su1);
        sm1.add(su2);

        System.out.println(sm1);


    }
}
