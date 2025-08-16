package mainpckg.kfc1.KitchenEmployee;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import mainpckg.kfc1.Customer.FoodItem;



public class ManageFoodInventoryController
{
    @FXML
    private TableView<FoodItem> inventoryManagementTableView;
    @FXML
    private TableColumn<KitchenEmployee,String> currentStockTableColumn;
    @FXML
    private TextField newStockAmountTextField;
    @FXML
    private TableColumn<KitchenEmployee,String> itemNameTableColumn;

    ObservableList<FoodItem>foodItems= FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        itemNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        currentStockTableColumn.setCellValueFactory(new PropertyValueFactory<>("currentStock"));

        KitchenEmployee em1 = null;
        foodItems.add(new FoodItem(em1,"Zinger Burger","available",8));
        foodItems.add(new FoodItem(em1,"Super Charger Burger","not available",0));
        foodItems.add(new FoodItem(em1,"Double Zinger Burger","available",4));
        foodItems.add(new FoodItem(em1,"Fries-small","not available",0));

        inventoryManagementTableView.setItems(foodItems);
    }
    @FXML
    public void saveChangeButtonOnAction(ActionEvent actionEvent) {
        FoodItem selected = inventoryManagementTableView.getSelectionModel().getSelectedItem();
        if (selected != null && !newStockAmountTextField.getText().isEmpty()){
            selected.setCurrentStock((Integer.parseInt(newStockAmountTextField.getText())));
            inventoryManagementTableView.refresh();
            newStockAmountTextField.clear();
        }

    }
}