package mainpckg.kfc1.KitchenEmployee;

public class OrderStatus {
    private String orderID,status;

    public OrderStatus(String orderID, String status) {
        this.orderID = orderID;
        this.status = status;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "orderID='" + orderID + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
