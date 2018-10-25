package StockExchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Date myDate = new Date();

        StockUpdate su1 = new StockUpdate("AMZN", myDate,55.44);
        StockUpdate su2= new StockUpdate("MSFT", myDate,36.56);


        List<StockUpdate> listOfPayments = new LinkedList<>();



    }
}
