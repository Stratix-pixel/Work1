package StockExchange;

import java.util.Date;
import java.util.Objects;

public class StockUpdate implements Comparable<StockUpdate> {
    String stockCode;
    Date date;
    double price;

    public StockUpdate(String stockCode, Date date, double price) {
        this.stockCode = stockCode;
        this.date = date;
        this.price = price;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StockUpdate)) return false;
        StockUpdate that = (StockUpdate) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(stockCode, that.stockCode) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockCode, date, price);
    }

    @Override
    public int compareTo(StockUpdate o) {
        return 0;
    }



}
