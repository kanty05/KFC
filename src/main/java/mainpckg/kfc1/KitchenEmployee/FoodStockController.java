package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;

public class FoodStockController
{
    @javafx.fxml.FXML
    private TableColumn foodStockTableColumn;
    @javafx.fxml.FXML
    private TableColumn stockAvailabilityTableColumn;
    @javafx.fxml.FXML
    private TableView foodStckTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void markOutOfStockButtonOnAction(ActionEvent actionEvent) {
    }
}