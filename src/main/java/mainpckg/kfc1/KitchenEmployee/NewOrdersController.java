package mainpckg.kfc1.KitchenEmployee;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mainpckg.kfc1.Customer.Order;

import java.util.ArrayList;

public class NewOrdersController {

    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> orderIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> itemsTableColumn;
    @javafx.fxml.FXML
    private TableView<Order> newOrdersTableView;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,Integer> quantityTableColumn;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,Double> totalPriceTableColumn;


    private ObservableList<Order> orders = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        orderIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("orderID"));
        itemsTableColumn.setCellValueFactory(new PropertyValueFactory<>("items"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));

        orders.add(new Order("0001","Zinger Burger",1,299));
        orders.add(new Order("0002","Fries-medium",1,199));
        orders.add(new Order("0003","12 pcs hot and crispy Chicken Bucket",1,1799));
        orders.add(new Order("0004","Double Zinger Burger",1,599));

        newOrdersTableView.setItems(orders);
    }
}