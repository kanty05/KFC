package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class KitchenEmployeeDashboardController
{

    @javafx.fxml.FXML
    private TextArea kitchenEmplyeeInfoTextArea;
    @javafx.fxml.FXML
    private BorderPane KitchenEmployeeBorderPane;

    KitchenEmployee kitchenEmployee ;

    public void setter(KitchenEmployee kitchenEmployee){
        this.kitchenEmployee = kitchenEmployee;
        kitchenEmplyeeInfoTextArea.setText(kitchenEmployee.toString());

    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void manageFoodInventoyButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateOrderStatusButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dailyReportButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void assignDeliveryButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void foodStockButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void newOrderButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void verifyPaymentButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logOutButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void kitchenShiftButtonOnAction(ActionEvent actionEvent) {
    }
}