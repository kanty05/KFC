package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FoodStockController
{
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> foodStockTableColumn;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> stockAvailabilityTableColumn;
    @javafx.fxml.FXML
    private TableView<KitchenEmployee> foodStckTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void markOutOfStockButtonOnAction(ActionEvent actionEvent) {
    }
}