package StockExchange;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class StockMarket {
    List<StockUpdate> update;
    List<StockUpdate> queryUpdates;


    public StockMarket(List<StockUpdate> update, List<StockUpdate> queryUpdates) {
        this.update = update;
        this.queryUpdates = queryUpdates;
    }

    public List<StockUpdate> getUpdate() {
        return update;
    }

    public void setUpdate(List<StockUpdate> update) {
        this.update = update;
    }

    public List<StockUpdate> getQueryUpdates() {
        return queryUpdates;
    }

    public void setQueryUpdates(List<StockUpdate> queryUpdates) {
        this.queryUpdates = queryUpdates;
    }



    public void add(StockUpdate update){
        this.update.add(update);
    }







}
