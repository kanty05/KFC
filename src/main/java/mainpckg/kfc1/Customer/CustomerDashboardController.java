package mainpckg.kfc1.Customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import mainpckg.kfc1.HelloApplication;

import java.io.IOException;

public class CustomerDashboardController
{

    @javafx.fxml.FXML
    private TextArea InfoTextArea;
    @javafx.fxml.FXML
    private BorderPane CustomerBorderPane;

    Customer customer;

    public void setter(Customer customer){
        this.customer = customer;
        InfoTextArea.setText(customer.toString());
    }


    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void trackOrderButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/TrackOrder.fxml"));
        CustomerBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void logOutButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginPage.fxml"));
        CustomerBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void giveReviewButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/Review.fxml"));
        CustomerBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void makePaymentButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/Payment.fxml"));
        CustomerBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void browseMenuButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/BrowseMenu.fxml"));
        CustomerBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void cancelOrderButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/CancelOrder.fxml"));
        CustomerBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void viewOrderHistoryButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/OrderHistory.fxml"));
        CustomerBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void viewCartButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/Cart.fxml"));
        CustomerBorderPane.setCenter(fxmlLoader.load());
    }
}