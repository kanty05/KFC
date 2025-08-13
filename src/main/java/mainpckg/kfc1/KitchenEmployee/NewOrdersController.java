package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class NewOrdersController
{
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> orderIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> itemsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> totalTableColumn;
    @javafx.fxml.FXML
    private TableView<KitchenEmployee> newOrdersTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void refreshButtonOnAction(ActionEvent actionEvent) {
    }
}