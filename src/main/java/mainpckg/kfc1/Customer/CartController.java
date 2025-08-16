package mainpckg.kfc1.Customer;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import mainpckg.kfc1.HelloApplication;
import mainpckg.kfc1.KitchenEmployee.KitchenEmployeeDashboardController;

import java.io.IOException;

public class CartController {
    @javafx.fxml.FXML
    private TableColumn<Customer, Integer> priceTableColumn;
    @javafx.fxml.FXML
    private Label totalPriceLable;
    @javafx.fxml.FXML
    private TableColumn<Customer, Integer> quantityTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Customer, String> itemNameTableColumn;
    @javafx.fxml.FXML
    private VBox cartVbox;
    @javafx.fxml.FXML
    private TableView<Customer> cartTableView;
    @javafx.fxml.FXML
    private Button checkOutButton;
    @javafx.fxml.FXML
    private Label labelmsg;


    @javafx.fxml.FXML
    public void initialize() {
        itemNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("items"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        priceTableColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

    }

    @javafx.fxml.FXML
    public void checkOutButtonOnAction(ActionEvent actionEvent) throws IOException {
    }
}