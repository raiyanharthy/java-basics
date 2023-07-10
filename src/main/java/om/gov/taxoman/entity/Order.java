package om.gov.taxoman.entity;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {

    private int id;
    private Product[] products = new Product[100];
    private double totalDue;
    private LocalDateTime timestamp;
    private User user;
    private OrderStatus status;

    public Order(int id, Product[] products, LocalDateTime timestamp, User user, OrderStatus status) {
        this.id = id;
        this.products = products;
        this.timestamp = timestamp;
        this.user = user;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public double getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(double totalDue) {
        this.totalDue = totalDue;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + Arrays.toString(products) +
                ", totalDue=" + totalDue +
                ", timestamp=" + timestamp +
                ", user=" + user +
                ", status=" + status +
                '}';
    }

}
