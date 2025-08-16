package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mainpckg.kfc1.Customer.Customer;
import mainpckg.kfc1.Customer.Payment;

import java.time.LocalDate;
import java.util.ArrayList;

public class VerifyPaymentStatusController
{
    @FXML
    private TableColumn<Payment,String> paymentStatusTableColumn;
    @FXML
    private Label showPaymentResultLable;
    @FXML
    private TableColumn<Payment,String> orderIDTableColumn;
    @FXML
    private TableView<Payment> paymentVerifyTableView;

    ArrayList<Payment> paymentList = new ArrayList<Payment>();

    @FXML
    public void initialize() {

        orderIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("orderID"));
        paymentStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));

    }

    @FXML
    public void checkPaymentStatusButtonOnStock(ActionEvent actionEvent) {
        paymentVerifyTableView.getItems().clear();
        KitchenEmployee emp1=null;
        paymentVerifyTableView.getItems().add(new Payment(emp1,"0001","Paid"));
        paymentVerifyTableView.getItems().add(new Payment(emp1,"0002","Pending"));

    }
}