package mainpckg.kfc1.Customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class PaymentController
{
    ArrayList<Payment> paymentList = new ArrayList<Payment>();

    @FXML
    private TextField cardOrMobileNoTextField;
    @FXML
    private ComboBox<String> paymentMethodCombobox;

    Payment payment;

    @FXML
    public void initialize() {
        paymentMethodCombobox.getItems().addAll("Visa Card","Credit Card","Bkash");
    }

    @FXML
    public void payNowButtonOnAction(ActionEvent actionEvent) {
//        String paymentMethod;
//        int cardNoOrMobileNo;
//        boolean flag = true;
//
//
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//
//
//        paymentMethod = paymentMethodCombobox.getValue();
//        cardNoOrMobileNo = Integer.parseInt(cardOrMobileNoTextField.getText());
//
//        if (paymentMethod.isBlank()){
//            flag = false;
//            alert.setTitle("choose atleast 1 method");
//            alert.setContentText("Payment method can not be blank");
//            alert.showAndWait();
//        }
//        else {
//            alert.setTitle("Congratulations!");
//            alert.setContentText("Payment Successfull");
//            alert.showAndWait();
//
//        }

//        Payment payment = new Payment(paymentMethod,cardNoOrMobileNo);
//        paymentList.add(payment);
//
//
//        cardOrMobileNoTextField.clear();
//        paymentMethodCombobox.setValue(null);


    }
}