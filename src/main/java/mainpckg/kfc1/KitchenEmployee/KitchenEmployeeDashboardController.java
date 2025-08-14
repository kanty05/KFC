package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import mainpckg.kfc1.HelloApplication;

import java.io.IOException;

public class KitchenEmployeeDashboardController
{

    @javafx.fxml.FXML
    private TextArea kitchenEmplyeeInfoTextArea;
    @javafx.fxml.FXML
    private BorderPane KitchenEmployeeBorderPane;

    KitchenEmployee kitchenEmployee;

    public void setter(KitchenEmployee kitchenEmployee){
        this.kitchenEmployee = kitchenEmployee;
        kitchenEmplyeeInfoTextArea.setText(kitchenEmployee.toString());

    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void manageFoodInventoyButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("KitchenEmployee/ManageFoodInventory.fxml"));
        KitchenEmployeeBorderPane.setCenter(fxmlLoader.load());
    }


    @javafx.fxml.FXML
    public void updateOrderStatusButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("KitchenEmployee/UpdateOrderStatus.fxml"));
        KitchenEmployeeBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void dailyReportButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("KitchenEmployee/DailyReport.fxml"));
        KitchenEmployeeBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void assignDeliveryButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("KitchenEmployee/AssignDeliveryStaff.fxml"));
        KitchenEmployeeBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void foodStockButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("KitchenEmployee/FoodStock.fxml"));
        KitchenEmployeeBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void newOrderButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("KitchenEmployee/NewOrders.fxml"));
        KitchenEmployeeBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void verifyPaymentButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("KitchenEmployee/VerifyPaymentStatus.fxml"));
        KitchenEmployeeBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void logOutButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginPage.fxml"));
        KitchenEmployeeBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void kitchenShiftButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("KitchenEmployee/KitchenShiftLog.fxml"));
        KitchenEmployeeBorderPane.setCenter(fxmlLoader.load());
    }
}