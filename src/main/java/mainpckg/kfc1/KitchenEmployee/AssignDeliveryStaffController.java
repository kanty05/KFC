package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDateTime;

public class AssignDeliveryStaffController
{
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> orderIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> customerNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> itemsTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> selectdeliveryStaffComboBox;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> totalTableColumn;
    @javafx.fxml.FXML
    private TableView<KitchenEmployee> assignDeliveryStaffTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void confirmAssignDeliveryStaffButtonOnAction(ActionEvent actionEvent) {
    }
}