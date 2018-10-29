
import java.time.LocalDateTime;

public class TestStocks {
    public static void main(String[] args){
        StockUpdate s1 = new StockUpdate(SSNLF, LocalDateTime.of(2017,2,11,12,18),1234.45);
        StockUpdate s2 = new StockUpdate(MSFT, LocalDateTime.of(2018,8,10,12,2),754.24);
        StockUpdate s3 = new StockUpdate(APPL, LocalDateTime.of(2017,1,19,11,3), 7412.536);
        StockUpdate s4 = new StockUpdate(SSNLF, LocalDateTime.of(2016,6,7,9,25),725.87);


        StockMarket listOfStockUpdates = new StockMarket();
        listOfStockUpdates.add(s1);
        listOfStockUpdates.addStocks(s2,s3,s4);

        LocalDateTime date1 = LocalDateTime.of(2017,1,8,11,30);
        LocalDateTime date2 = LocalDateTime.of(2018,10,18,6,1);
        Code myCode = Code.AMZN;

        System.out.println("All stock updates between " + date1 + " and " + date2 + ": ");
        System.out.println(listOfStockUpdates.queryUpdates(date1,date2).size() != 0  ? listOfStockUpdates.queryUpdates(date1,date2):
                "No stock updates between these dates.");

        String result2= "All stock updates between " + date1 +
                " and " + date2 + " for " + myCode + ": " + "\n" +
                listOfStockUpdates.queryUpdates(date1,date2,myCode);
        System.out.println(listOfStockUpdates.queryUpdates(date1,date2,myCode).size() != 0 ? result2 : "There are no stock updates between " +
                date1 + " and " + date2 + " for " + myCode);

        String result3 = "The price that " + myCode+ " had at/close to date " + date1 +": " + listOfStockUpdates.getPrice(date1,myCode);
        System.out.println(listOfStockUpdates.getPrice(date1,myCode) != null ? result3 : "There is no price for " + myCode
                + " code at/close to date " + date1 + ".");

        System.out.println("The prices for all stocks at " + date1 + ":");
        System.out.println(listOfStockUpdates.getPrices(date1).size() == 0 ? "No prices for this date":
                listOfStockUpdates.getPrices(date1));

    }
}

