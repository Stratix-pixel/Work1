
import java.time.LocalDateTime;
import java.util.*;

public class StockMarket {
    List<StockUpdate> stockUpdateList = new ArrayList<>();

    public void add(StockUpdate update){
        stockUpdateList.add(update);
        if(update.getStockCode() == null) {
            throw new NullPointerException("Stock Code with null code!");
        }
        if(update.getDate().compareTo(LocalDateTime.now()) == 1){
            throw new IllegalArgumentException("Invalid date.");
        }
    }

    public void addStocks(StockUpdate...stocks){
        for(StockUpdate s: stocks){
            stockUpdateList.add(s);
            if(s.getStockCode() == null) {
                throw new NullPointerException("Stock Code with null code!");
            }
        }

    }

    public List<StockUpdate> queryUpdates(LocalDateTime dateFrom, LocalDateTime dateTo){
        if(dateFrom.compareTo(dateTo) == 1){
            throw new IllegalArgumentException("Start date is greater end date ");
        }
        List<StockUpdate> stockUpdates = new ArrayList<>();
        for(StockUpdate s: stockUpdateList){
            if(s.getDate().isAfter(dateFrom) && s.getDate().isBefore(dateTo)){
                stockUpdates.add(s);
            }
        }
        return stockUpdates;
    }

    public List<StockUpdate> queryUpdates(LocalDateTime dateFrom, LocalDateTime dateTo, Code stockCode){
        if(dateFrom.compareTo(dateTo) == 1){
            throw new IllegalArgumentException("Start date is greater end date ");
        }
        if(dateFrom.compareTo(dateTo) == 1){
            throw new IllegalArgumentException("Start date is greater end date ");
        }
        List<StockUpdate> stockUpdates = new ArrayList<>();
        for(StockUpdate s: stockUpdateList){
            if(s.getDate().isAfter(dateFrom) && s.getDate().isBefore(dateTo) && s.getStockCode().equals(stockCode)){
                stockUpdates.add(s);
            }
        }
        return stockUpdates;
    }

    public Double getPrice(LocalDateTime date, Code stockCode){
        Double price = null;
        TreeSet<LocalDateTime> dateForCheck = new TreeSet<>();
        for(StockUpdate stock: stockUpdateList){
            if(stock.getStockCode().equals(stockCode)) {
                dateForCheck.add(stock.getDate());
            }
        }
        date = dateForCheck.ceiling(date);
        for(StockUpdate s: stockUpdateList){
            if(s.getDate().equals(date)) {
                price = s.getPrice();
            }
        }
        return price;
    }

    public Map<Code,Double> getPrices(LocalDateTime date){
        Map<Code, Double> mapOfPrices = new HashMap<>();
        for(StockUpdate s: stockUpdateList) {
            if(getPrice(date,s.getStockCode()) != null) {
                mapOfPrices.put(s.getStockCode(), getPrice(date, s.getStockCode()));
            }
        }
        return mapOfPrices;
    }

    @Override
    public String toString() {
        return "StockMarket{" +
                "stockUpdateList=" + stockUpdateList +
                '}';
    }

    public int countStockUpdates(){
        return stockUpdateList.size();
    }
}
