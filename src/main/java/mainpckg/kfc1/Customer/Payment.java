package mainpckg.kfc1.Customer;

import mainpckg.kfc1.KitchenEmployee.KitchenEmployee;

public class Payment {

    private Customer customer;
    private KitchenEmployee kitchenEmployee;
    private String OrderID;
    private String paymentStatus;
    private String paymentMethod;
    private String cardNoOrMobileNo;

    public Payment(Customer customer,String paymentMethod, String cardNoOrMobileNo) {
        this.paymentMethod = paymentMethod;
        this.cardNoOrMobileNo = cardNoOrMobileNo;
    }

    public Payment(KitchenEmployee kitchenEmployee,String orderID, String paymentStatus) {
        this.OrderID = orderID;
        this.paymentStatus = paymentStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public KitchenEmployee getKitchenEmployee() {
        return kitchenEmployee;
    }

    public void setKitchenEmployee(KitchenEmployee kitchenEmployee) {
        this.kitchenEmployee = kitchenEmployee;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getCardNoOrMobileNo() {
        return cardNoOrMobileNo;
    }

    public void setCardNoOrMobileNo(String cardNoOrMobileNo) {
        this.cardNoOrMobileNo = cardNoOrMobileNo;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "customer=" + customer +
                ", kitchenEmployee=" + kitchenEmployee +
                ", OrderID='" + OrderID + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", cardNoOrMobileNo='" + cardNoOrMobileNo + '\'' +
                '}';
    }
}

