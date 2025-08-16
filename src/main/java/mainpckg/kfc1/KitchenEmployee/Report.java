package mainpckg.kfc1.KitchenEmployee;

public class Report{
    private String orderID,items;
    private int totalAmount;

    public Report(String orderID, String items, int totalAmount) {
        this.orderID = orderID;
        this.items = items;
        this.totalAmount = totalAmount;
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

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Report{" +
                "orderID='" + orderID + '\'' +
                ", items='" + items + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}



