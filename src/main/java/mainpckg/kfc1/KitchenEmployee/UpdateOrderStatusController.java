package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class UpdateOrderStatusController
{
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> orderIDTableColumn;
    @javafx.fxml.FXML
    private TableView<KitchenEmployee>updateOrderStatusTableView;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> customerTableColumn;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> currentStatusTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateStatusButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void newStatusComboBox(ActionEvent actionEvent) {
    }
}