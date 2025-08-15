package mainpckg.kfc1.KitchenEmployee;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mainpckg.kfc1.Customer.Order;

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

        orderIDTableColumn.setCellValueFactory(new PropertyValueFactory<KitchenEmployee,String>("id"));
        itemsTableColumn.setCellValueFactory(new PropertyValueFactory<KitchenEmployee,String>("items"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<KitchenEmployee,Integer>("quantity"));
        totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<KitchenEmployee,Double>("total price"));

        orders.add(new Order("0001","Zinger Burger",1,299));
        orders.add(new Order("0002","Fries-medium",2,199));
        orders.add(new Order("0003"," Double Zinger Burger",2,599));
        orders.add(new Order("0004","12 pcs Hot & Crispy Chicken Bucket,",1,1799));

        newOrdersTableView.setItems(orders);
    }
}