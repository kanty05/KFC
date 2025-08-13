package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class VerifyPaymentStatusController
{
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> paymentStatusTableColumn;
    @javafx.fxml.FXML
    private Label showPaymentResultLable;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> orderIDTableColumn;
    @javafx.fxml.FXML
    private TableView<KitchenEmployee> paymentVerifyTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void checkPaymentStatusButtonOnStock(ActionEvent actionEvent) {
    }
}