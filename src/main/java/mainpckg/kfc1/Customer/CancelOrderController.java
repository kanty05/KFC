package mainpckg.kfc1.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CancelOrderController
{
    @javafx.fxml.FXML
    private TableColumn orderIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn priceTableColumn;
    @javafx.fxml.FXML
    private TableView myOrderTabelView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void cancelOrderButtonOnAction(ActionEvent actionEvent) {
    }
}