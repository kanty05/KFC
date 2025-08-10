package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class NewOrdersController
{
    @javafx.fxml.FXML
    private TableColumn orderIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn cutomerNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn itemsTableColumn;
    @javafx.fxml.FXML
    private TableColumn timePlacedTableColumn;
    @javafx.fxml.FXML
    private TableColumn totalTableColumn;
    @javafx.fxml.FXML
    private TableView newOrdersTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void refreshButtonOnAction(ActionEvent actionEvent) {
    }
}