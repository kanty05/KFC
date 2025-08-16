package mainpckg.kfc1.Customer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

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
    private TableView<Cart> cartTableView;
    @javafx.fxml.FXML
    private Button checkOutButton;
    @javafx.fxml.FXML
    private Label labelmsg;


    ObservableList<Cart> carts = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        itemNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("foodItem"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        priceTableColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        carts.add(new Cart("Fries-Small",2,358));
        carts.add(new Cart("zinger Burger",1,299));
        carts.add(new Cart("8Pc hot and crispy Chicken Bucket",1,1299));
        carts.add(new Cart("Super Charger Burger",1,479));

        totalPriceLable.setText("Total: Tk.2435");

        cartTableView.setItems(carts);

    }

    @javafx.fxml.FXML
    public void checkOutButtonOnAction(ActionEvent actionEvent) throws IOException {
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Go to Place Order to Confirm your order by giving delivery detail!");
        alert.showAndWait();
    }

}