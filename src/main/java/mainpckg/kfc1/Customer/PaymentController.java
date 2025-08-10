package mainpckg.kfc1.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PaymentController
{
    @javafx.fxml.FXML
    private Label showPaymentSuccessorFailure;
    @javafx.fxml.FXML
    private TextField cardOrMobileNoTextField;
    @javafx.fxml.FXML
    private ComboBox paymentMethodCombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void payNowButtonOnAction(ActionEvent actionEvent) {
    }
}