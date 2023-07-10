package om.gov.taxoman;

import om.gov.taxoman.entity.OrderStatus;
import om.gov.taxoman.entity.User;
import om.gov.taxoman.entity.Order;
import om.gov.taxoman.entity.Product;

import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[1];
        String[] categories = new String[1];
        categories[0]= "human";
        String[] roles = new String[1];
        roles[0] = "admin";
        User user= new User(111,"manar","meow",roles);
        products[0]= new Product(123, "raiyan", "creature", categories, 99.9);
        Order order = new Order(123, products ,LocalDateTime.now(), user,OrderStatus.DELIVERED);

        System.out.println(order);

    }
}