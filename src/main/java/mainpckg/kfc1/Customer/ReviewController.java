package mainpckg.kfc1.Customer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ReviewController
{
    @javafx.fxml.FXML
    private ComboBox<String> ratingCombobox;
    @javafx.fxml.FXML
    private TextArea commentTextArea;
    @javafx.fxml.FXML
    private TableView CompletedOrderTableView;
    @javafx.fxml.FXML
    private TableColumn DateTableColumn;
    @javafx.fxml.FXML
    private TableColumn orderIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn ItemsTableColumn;
    @javafx.fxml.FXML
    private TableColumn totalPriceTableColumn;

    private ObservableList<Order> orders= FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        ratingCombobox.getItems().addAll("1","2","3","4","5");
        orderIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("orderID"));
        ItemsTableColumn.setCellValueFactory(new PropertyValueFactory<>("items"));
        totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));
        DateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        orders.add(new Order("101","Fries-medium",2,398,"done", LocalDate.of(2025,7,4)));
        orders.add(new Order("101","Super Charger Burger",1,379,"done", LocalDate.of(2025,8,4)));

        CompletedOrderTableView.setItems(orders);

    }

    @FXML
    public void submitButtononAction(ActionEvent actionEvent) {
        Order selectedOrder = (Order) CompletedOrderTableView.getSelectionModel().getSelectedItem();

        String rating = ratingCombobox.getValue();
        String comment = commentTextArea.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        if (selectedOrder==null){
            alert.setContentText("Please select an order to review");
            alert.showAndWait();
        } else if (comment.isEmpty()) {
            alert.setContentText("please enter a comment!");
            alert.showAndWait();

        } else if (rating==null) {
            alert.setContentText("please selesct a rating");
            alert.showAndWait();
        }else{
            alert.setContentText("Review and rating submitted");
            alert.showAndWait();
            commentTextArea.clear();
            ratingCombobox.getSelectionModel().clearSelection();
        }

    }
}