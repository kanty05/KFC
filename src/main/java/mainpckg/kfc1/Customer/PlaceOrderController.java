package mainpckg.kfc1.Customer;

import javafx.event.ActionEvent;
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
    }
}