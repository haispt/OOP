package bai4;

import java.util.*;

class Product {
    String id;
    String name;
    double price;
    int quantity;

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class Customer {
    String id;
    String name;
    String email;

    public Customer(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

class OrderItem {
    Product product;
    int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getItemTotal() {
        return product.price * quantity;
    }
}

class Order {
    String id;
    Customer customer;
    List<OrderItem> items;

    public Order(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
        product.quantity -= quantity; // Giảm số lượng tồn kho
    }

    public double getTotalAmount() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getItemTotal();
        }
        return total;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + id);
        System.out.println("Customer: " + customer.name);
        System.out.println("Items:");
        for (OrderItem item : items) {
            System.out.println("- " + item.product.name + " x " + item.quantity + " = " + item.getItemTotal());
        }
        System.out.println("Total: " + getTotalAmount());
    }
}

class ShopManager { //Main-class
    public static void main(String[] args) {
        // Tạo sản phẩm
        Product p1 = new Product("P001", "Laptop", 1000, 10);
        Product p2 = new Product("P002", "Mouse", 25, 50);

        // Tạo khách hàng
        Customer c1 = new Customer("C001", "Nguyen Van A", "a@gmail.com");

        // Tạo đơn hàng
        Order order1 = new Order("O001", c1);
        order1.addItem(p1, 1);
        order1.addItem(p2, 2);

        // In chi tiết đơn hàng
        order1.printOrderDetails();
    }
}
