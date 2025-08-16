package mainpckg.kfc1.Customer;

import mainpckg.kfc1.KitchenEmployee.KitchenEmployee;

public class FoodItem {
    private Customer customer;
    private KitchenEmployee kitchenEmployee;
    private String name,category;
    private double price;
    private String availability;
    private int currentStock;


    public FoodItem(KitchenEmployee kitchenEmployee, String name, String availability, int cuurentStock) {
        this.kitchenEmployee = kitchenEmployee;
        this.name = name;
        this.availability = availability;
        this.currentStock=cuurentStock;

    }

    public FoodItem(Customer customer, String name, double price, String category) {
        this.customer = customer;
        this.name = name;
        this.price = price;
        this.category = category;
    }


    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }

    public KitchenEmployee getKitchenEmployee() {
        return kitchenEmployee;
    }

    public void setKitchenEmployee(KitchenEmployee kitchenEmployee) {
        this.kitchenEmployee = kitchenEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "customer=" + customer +
                ", kitchenEmployee=" + kitchenEmployee +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", availability='" + availability + '\'' +
                '}';
    }
}
