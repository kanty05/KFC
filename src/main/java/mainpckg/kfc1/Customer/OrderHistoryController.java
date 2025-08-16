package mainpckg.kfc1.Customer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class OrderHistoryController {
    @javafx.fxml.FXML
    private TableColumn<Customer, String> orderIDTableColumn;
    @javafx.fxml.FXML
    private TableView<Order> orderHistoryTableView;
    @javafx.fxml.FXML
    private TableColumn<Customer, LocalDate> dateTableColumn;

    ObservableList<Order> orders = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    private TableColumn totalPriceTableColumn;
    @javafx.fxml.FXML
    private TableColumn itemsTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        orderIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("orderID"));
        itemsTableColumn.setCellValueFactory(new PropertyValueFactory<>("items"));
        totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        orders.add(new Order("001", "Zinger Burger",2, 498,"done", LocalDate.of(2025, 4, 15)));
        orders.add(new Order("002", "12pcs Chicken Bucket", 1, 1799, "done", LocalDate.of(2025, 5, 6)));
        orders.add(new Order("003", "Fries-medium,6pcs wings bucket", 2, 798,"done", LocalDate.of(2025, 6, 17)));

        orderHistoryTableView.setItems(orders);
    }
}
