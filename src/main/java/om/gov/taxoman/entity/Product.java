package om.gov.taxoman.entity;

import java.util.Arrays;

public class Product {

    private int id;
    private String name;
    private String description;
    private String[] categories = new String[5];
    private double price;

    public Product() {
    }

    public Product(int id, String name, String description, String[] categories, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.categories = categories;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", categories=" + Arrays.toString(categories) +
                ", price=" + price +
                '}';
    }
}