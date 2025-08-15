package mainpckg.kfc1.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.ArrayList;

public class TrackOrderController
{
    @javafx.fxml.FXML
    private TextField orderIDTextField;
    @javafx.fxml.FXML
    private Label trackOrderStatusLable;

    Customer customer;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void trackButtonOnAction(ActionEvent actionEvent) {
    }
}