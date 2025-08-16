package mainpckg.kfc1.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PlaceOrderController
{
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private TextField phoneNoTextField;
    @javafx.fxml.FXML
    private TextField fullNameTextField;
    @javafx.fxml.FXML
    private Label orderConfirmationLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void placeButtonOnAction(ActionEvent actionEvent) {
        String name = fullNameTextField.getText();
        String address= addressTextField.getText();
        String phoneNo= phoneNoTextField.getText();

        Alert alert= new Alert(Alert.AlertType.WARNING);

        if (name.isEmpty()){
            alert.setContentText("Please anter your name!");
            alert.showAndWait();
        }
        else if(address.isEmpty()){
            alert.setContentText("Please anter your address");
            alert.showAndWait();
        }
        else if(phoneNo.isEmpty()){
            alert.setContentText("Please anter your phoneNo");
            alert.showAndWait();
        }
        else{
            orderConfirmationLabel.setText("Order Confirm!");
        }
    }
}