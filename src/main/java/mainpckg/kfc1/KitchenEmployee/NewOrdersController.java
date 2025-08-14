package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mainpckg.kfc1.Customer.Customer;

import java.util.ArrayList;

public class NewOrdersController
{
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> orderIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> itemsTableColumn;
    @javafx.fxml.FXML
    private TableView<KitchenEmployee> newOrdersTableView;
    @javafx.fxml.FXML
    private TableColumn quantityTableColumn;
    @javafx.fxml.FXML
    private TableColumn totalPriceTableColumn;


    @javafx.fxml.FXML
    public void initialize() {
        orderIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        itemsTableColumn.setCellValueFactory(new PropertyValueFactory<>("items"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("total price"));
    }

    @Deprecated
    public void refreshButtonOnAction(ActionEvent actionEvent) {

    }
}