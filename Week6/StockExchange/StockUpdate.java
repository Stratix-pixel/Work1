
import java.time.LocalDateTime;
import java.util.Objects;

public class StockUpdate implements Comparable{
    private Code stockCode;
    private LocalDateTime dateTime;
    private double price;

    public StockUpdate(Code stockCode, LocalDateTime dateTime, double price) {
        this.stockCode = stockCode;
        this.dateTime = dateTime;
        this.price = price;
    }

    public StockUpdate(Code stockCode, double price){
        this.stockCode = stockCode;
        this.dateTime = LocalDateTime.now();
        this.price = price;
    }

    public Code getStockCode() {
        return stockCode;
    }

    public LocalDateTime getDate() {
        return dateTime;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StockUpdate)) return false;
        StockUpdate that = (StockUpdate) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(stockCode, that.stockCode) &&
                Objects.equals(dateTime, that.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockCode, dateTime, price);
    }


    @Override
    public String toString() {
        return "StockUpdate{" +
                "stockCode=" + stockCode +
                ", dateTime=" + dateTime +
                ", price=" + price +
                '}' + "\n";
    }

    @Override
    public int compareTo(Object o) {
        StockUpdate s = (StockUpdate) o;
        return this.getDate().compareTo(s.getDate());
    }
}
