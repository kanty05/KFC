package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ManageFoodInventoryController
{
    @javafx.fxml.FXML
    private TableView<KitchenEmployee> inventoryManagementTableView;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> currentStockTableColumn;
    @javafx.fxml.FXML
    private TextField newStockAmountTextField;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> categoryTableColumn;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> itemNameTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveChangeButtonOnAction(ActionEvent actionEvent) {
    }
}