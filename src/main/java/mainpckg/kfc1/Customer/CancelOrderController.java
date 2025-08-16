package mainpckg.kfc1.Customer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class CancelOrderController
{
    @javafx.fxml.FXML
    private TableColumn<Customer,String> orderIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Customer,String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Customer,Integer> priceTableColumn;
    @javafx.fxml.FXML
    private TableView<Order> cancelOrderTableView;
    private ObservableList<Order> orders= FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        orderIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("orderID"));
        priceTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        orders.add(new Order("201","Zinger Burger",2,598,"Preparing", LocalDate.of(2025,4,30)));
        orders.add(new Order("202","Fries-small",1,179,"On the way to deliver!",LocalDate.of(2025,6,5)));
        orders.add(new Order("203","Double Zinger Burger",2,1198,"Pending",LocalDate.of(2025,8,4)));
        cancelOrderTableView.setItems(orders);
    }

    @javafx.fxml.FXML
    public void cancelOrderButtonOnAction(ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        Order selectedOrder = cancelOrderTableView.getSelectionModel().getSelectedItem();
        if (selectedOrder.getStatus().equals("Pending")){
            alert.setContentText("Cancelled!");
            alert.showAndWait();
        }else{
            alert.setContentText("your order is ready,you can not cancel it!");
            alert.showAndWait();
        }

    }
}