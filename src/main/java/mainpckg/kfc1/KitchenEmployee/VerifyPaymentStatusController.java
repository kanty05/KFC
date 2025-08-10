package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class VerifyPaymentStatusController
{
    @javafx.fxml.FXML
    private TableView paymentVerificationTableView;
    @javafx.fxml.FXML
    private TableColumn paymentStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn orderIdTableColumn;
    @javafx.fxml.FXML
    private Label showPaymentResultLable;
    @javafx.fxml.FXML
    private TableColumn customerTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void checkPaymentStatusButtonOnStock(ActionEvent actionEvent) {
    }
}