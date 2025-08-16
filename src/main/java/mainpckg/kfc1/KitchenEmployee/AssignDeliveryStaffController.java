package mainpckg.kfc1.KitchenEmployee;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mainpckg.kfc1.Customer.Order;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AssignDeliveryStaffController
{
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> orderIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> itemsTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> selectdeliveryStaffComboBox;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> totalTableColumn;
    @javafx.fxml.FXML
    private TableView<Order> assignDeliveryStaffTableView;

    ObservableList<Order> orders = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    private Label labelmsg;

    @javafx.fxml.FXML
    public void initialize() {
        selectdeliveryStaffComboBox.getItems().addAll("deliveryman-1","deliveryman-2","deliveryman-3","deliveryman-4");

        orderIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("orderID"));
        itemsTableColumn.setCellValueFactory(new PropertyValueFactory<>("items"));
        totalTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));


        assignDeliveryStaffTableView.getItems().clear();

        orders.add(new Order("0001","Zinger Burger",2,598,"Done", LocalDate.of(2025,4,25)));
        orders.add(new Order("0002","Fries-Large",3,897,"Done", LocalDate.of(2025,6,15)));
        orders.add(new Order("0003","Zinger Burger",2,598,"Done", LocalDate.of(2025,8,5)));

        assignDeliveryStaffTableView.setItems(orders);
    }

    @javafx.fxml.FXML
    public void confirmAssignDeliveryStaffButtonOnAction(ActionEvent actionEvent) {
        Order selectOrder = assignDeliveryStaffTableView.getSelectionModel().getSelectedItem();
        String staff = selectdeliveryStaffComboBox.getValue();

        if (selectOrder !=null && staff !=null){
            labelmsg.setText("Order"  +  selectOrder.getOrderID()  +  "accepted by"  +  staff);
        }
        else {
            labelmsg.setText("please select an order and a deliveryman");
        }
    }
}