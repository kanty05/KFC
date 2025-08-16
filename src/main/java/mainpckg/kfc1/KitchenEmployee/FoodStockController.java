package mainpckg.kfc1.KitchenEmployee;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mainpckg.kfc1.Customer.FoodItem;

public class FoodStockController {
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee, String> stockAvailabilityTableColumn;
    @javafx.fxml.FXML
    private TableView<FoodItem> foodStckTableView;
    @javafx.fxml.FXML
    private TableColumn itemNameTableColumn;

    private ObservableList<FoodItem> foodItems = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        itemNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        stockAvailabilityTableColumn.setCellValueFactory(new PropertyValueFactory<>("availability"));

        KitchenEmployee e1 = null;
        foodItems.add(new FoodItem(e1,"Zinger Burger", "Available"));
        foodItems.add(new FoodItem(e1,"Double Zinger Burger", "Out of Stock"));
        foodItems.add(new FoodItem(e1,"Super Charger Burger", "Available"));
        foodItems.add(new FoodItem(e1,"Fries-medium", "Available"));
        foodItems.add(new FoodItem(e1,"Fries-Large", "Out of Stock"));
        foodItems.add(new FoodItem(e1,"8pcs Hot & Crispy Chicken", "Available"));
        foodStckTableView.setItems(foodItems);


    }

    @javafx.fxml.FXML
    public void markOutOfStockButtonOnAction(ActionEvent actionEvent) {
        FoodItem selected = foodStckTableView.getSelectionModel().getSelectedItem();
        if (selected != null){
            selected.setAvailability("Out of  Stock");
            foodStckTableView.refresh();
        }else{
            Alert alert=new Alert(Alert.AlertType.WARNING);
            alert.setContentText("select an order first");
            alert.showAndWait();
        }
    }
}