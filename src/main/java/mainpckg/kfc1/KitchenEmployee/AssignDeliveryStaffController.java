package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AssignDeliveryStaffController
{
    @javafx.fxml.FXML
    private TableColumn orderIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn customerNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn itemsTableColumn;
    @javafx.fxml.FXML
    private TableColumn timetableColumn;
    @javafx.fxml.FXML
    private ComboBox selectdeliveryStaffComboBox;
    @javafx.fxml.FXML
    private TableColumn totalTableColumn;
    @javafx.fxml.FXML
    private TableView assignDeliveryStaffTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void confirmAssignDeliveryStaffButtonOnAction(ActionEvent actionEvent) {
    }
}