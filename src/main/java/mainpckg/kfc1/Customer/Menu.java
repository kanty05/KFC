package mainpckg.kfc1.Customer;

public class Menu {
    private FoodItem foodItem;
    private Cart cart;
    private int quantity;

    public Menu(FoodItem foodItem, int quantity) {
        this.foodItem = foodItem;
        this.quantity = quantity;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "foodItem=" + foodItem +
                ", quantity=" + quantity +
                '}';
    }
}
