
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Building b1 = new Building("B1", Category.RELIGIOUS, 65000, "West Beach");
        Building b2 = new Building("B2", Category.HOSPITAL, 16000, "Medindie");
        Building b3 = new Building("B3", Category.OFFICE, 15555, "Surrey Downs");
        Building b4 = new Building("B4", Category.RESIDENTIAL, 8700000, "Black Forest");
        Building b5 = new Building("B5", Category.RESIDENTIAL, 87582.25, "Edinburgh");


        List<Building> listOfBuildings = new ArrayList<>();
        listOfBuildings.addAll(Arrays.asList(b1, b2, b3, b4, b5));

        System.out.println("The average price for each building category: ");
        System.out.println(averageByCategory(listOfBuildings)+"\n");

        System.out.println("The average price for each neighborhood: ");
        System.out.println(averageByNeighborhood(listOfBuildings) +"\n");

        System.out.println("The number of categories: ");
        System.out.println(noOfCategories(listOfBuildings)+"\n");

        System.out.println("All the unique neighborhoods: ");
        System.out.println(listOfUniqueNeighborhoods(listOfBuildings)+"\n");

    }

    public static Map<Category, Double> averageByCategory(List<Building> buildingList) {
        Map<Category, Double> totalPriceByType = new HashMap<>();
        Map<Category, Double> noOfCategories = new HashMap<>();
        Map<Category, Double> averageByType = new HashMap<>();
        for (Building b : buildingList) {
            Double price = totalPriceByType.get(b.getCategory());
            if (price == null) {
                price = 0D;
            }
            price += b.getPrice();
            totalPriceByType.put(b.getCategory(), price);
        }
        for (Building b : buildingList) {
            Double number = noOfCategories.get(b.getCategory());
            if (number == null) {
                number = 0D;
            }
            number++;
            noOfCategories.put(b.getCategory(), number);
        }
        for (Category c : totalPriceByType.keySet()) {
            averageByType.put(c, totalPriceByType.get(c) / noOfCategories.get(c));
        }
        return averageByType;
    }

    public static Map<String, Double> averageByNeighborhood(List<Building> buildingList) {
        Map<String, Double> totalPriceByNeighborhoods = new HashMap<>();
        Map<String, Double> noOfNeighborhoods = new HashMap<>();
        Map<String, Double> averageByNeighborhoods = new HashMap<>();
        for (Building b : buildingList) {
            Double price = totalPriceByNeighborhoods.get(b.getNeighborhood());
            if (price == null) {
                price = 0D;
            }
            price += b.getPrice();
            totalPriceByNeighborhoods.put(b.getNeighborhood(), price);
        }
        for (Building b : buildingList) {
            Double number = noOfNeighborhoods.get(b.getNeighborhood());
            if (number == null) {
                number = 0D;
            }
            number++;
            noOfNeighborhoods.put(b.getNeighborhood(), number);
        }
        for (String neighborhood : totalPriceByNeighborhoods.keySet()) {
            averageByNeighborhoods.put(neighborhood, totalPriceByNeighborhoods.get(neighborhood) / noOfNeighborhoods.get(neighborhood));

        }
        return averageByNeighborhoods;
    }

    public static Map<Category, Integer> noOfCategories(List<Building> buildingList) {
        Map<Category, Integer> noOfCategories = new HashMap<>();
        for (Building b : buildingList) {
            Integer number = noOfCategories.get(b.getCategory());
            if (number == null) {
                number = 0;
            }
            number++;
            noOfCategories.put(b.getCategory(), number);
        }
        return noOfCategories;
    }

    public static String listOfUniqueNeighborhoods(List<Building> buildingList) {
        Set<String> neighborhoodSet = new HashSet<>();
        for (Building b : buildingList) {
            neighborhoodSet.add(b.getNeighborhood());
        }
        return neighborhoodSet.toString();
    }

}
