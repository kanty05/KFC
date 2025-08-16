package mainpckg.kfc1.Customer;

public class Cart {
    private String foodItem;
    private int quantity;
    private double price;

    public Cart(String foodItem, int quantity, double price) {
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.price = price;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "foodItem='" + foodItem + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

