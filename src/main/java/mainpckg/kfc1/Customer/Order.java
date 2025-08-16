package mainpckg.kfc1.Customer;

import mainpckg.kfc1.KitchenEmployee.KitchenEmployee;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private String orderID;
    private String items;
    private int quantity;
    private double totalPrice;
    private String status;
    private LocalDate date;

    public Order(String orderID, String items, int quantity, double totalPrice, String status, LocalDate date) {
        this.orderID = orderID;
        this.items = items;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.status = status;
        this.date = date;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", items='" + items + '\'' +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}

