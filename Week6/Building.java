
public class Building {
    String name;
    Category category;
    double price;
    String neighborhood;

    public Building(String name, Category category, double price, String neighborhood) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.neighborhood = neighborhood;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", neighborhood='" + neighborhood + '\'' +
                '}';
    }
}
