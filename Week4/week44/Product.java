package week44;

public class Product{
    private long id;
    private String name = "";
    private double price;
    private String type = "";
    private String color = "";

    public Product(long id, String name, double price, String type, String color) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}