package mainpckg.kfc1.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CancelOrderController
{
    @javafx.fxml.FXML
    private TableColumn<Customer,String> orderIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Customer,String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Customer,Integer> priceTableColumn;
    @javafx.fxml.FXML
    private TableView<Customer> cancelOrderTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void cancelOrderButtonOnAction(ActionEvent actionEvent) {
    }
}