package carmen.bes5l1.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements Product {
    private String name;
    private double price;
    private List<String> toppings = new ArrayList<>();


    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", toppings=" + toppings +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Pizza " + name + " with: " + String.join(", ", toppings);
    }
}
