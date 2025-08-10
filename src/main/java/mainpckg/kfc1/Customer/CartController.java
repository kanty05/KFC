package mainpckg.kfc1.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

public class CartController
{
    @javafx.fxml.FXML
    private TableColumn priceTableColumn;
    @javafx.fxml.FXML
    private Label totalPriceLable;
    @javafx.fxml.FXML
    private TableColumn quantityTableColumn;
    @javafx.fxml.FXML
    private TableColumn itemNameTableColumn;
    @javafx.fxml.FXML
    private VBox cartVbox;
    @javafx.fxml.FXML
    private TableView cartTableView;
    @javafx.fxml.FXML
    private Button checkOutButton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void checkOutButtonOnAction(ActionEvent actionEvent) {
    }
}