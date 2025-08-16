package mainpckg.kfc1.KitchenEmployee;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class UpdateOrderStatusController {
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee, String> orderIDTableColumn;
    @javafx.fxml.FXML
    private TableView<OrderStatus> updateOrderStatusTableView;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee, String> currentStatusTableColumn;

    @javafx.fxml.FXML
    private ComboBox newStatusComboBox;

    private ObservableList<OrderStatus> orderStatuses = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        orderIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("orderID"));
        currentStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        newStatusComboBox.getItems().addAll("Preparing", "Pending", "Ready", "Deliverd");

        orderStatuses.add(new OrderStatus("0001", "Preparing"));
        orderStatuses.add(new OrderStatus("0002", "Pending"));
        orderStatuses.add(new OrderStatus("0003", "Ready"));
        orderStatuses.add(new OrderStatus("0004", "Deliverd"));
        updateOrderStatusTableView.setItems(orderStatuses);
    }

    @javafx.fxml.FXML
    public void updateStatusButtonOnAction(ActionEvent actionEvent) {
        OrderStatus selected = updateOrderStatusTableView.getSelectionModel().getSelectedItem();
        String newStatus = newStatusComboBox.getValue().toString();

        if (selected != null && newStatus != null) {
            selected.setStatus((newStatus));
            updateOrderStatusTableView.refresh();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Please select an order and a new status");
            alert.showAndWait();
        }
    }
}