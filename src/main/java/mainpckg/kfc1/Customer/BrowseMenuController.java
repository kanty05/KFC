package mainpckg.kfc1.Customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import mainpckg.kfc1.HelloApplication;

import java.io.IOException;
import java.util.ArrayList;

public class BrowseMenuController {

    @FXML
    private TabPane manuTabPane;
    @FXML
    private Tab friesTabPane;
    @FXML
    private Tab chickenTabPane;
    @FXML
    private Tab burgerTabPane;
    @FXML
    private AnchorPane customerAnchorPane;
    @FXML
    private TextField friesSmallQuantityTextField;
    @FXML
    private TextField superChargerBurgerQuantityTextField;
    @FXML
    private TextField doubleZingerBurgerQuantityTextField;
    @FXML
    private TextField eightPcChickenQuantityTextField;
    @FXML
    private TextField friesLargeQuantityTextField;
    @FXML
    private TextField friesMediumQuantityTextField;
    @FXML
    private TextField twelvePcChickenQuantityTextField;
    @FXML
    private TextField sixPcChickenQuantityTextField;
    @FXML
    private TextField zingerBurgerQuantityTextField;


    @FXML
    public void initialize() {

    }

    @FXML
    public void twelvePcChickenBucketAddToCartButtonOnAction(ActionEvent actionEvent) {
    }


    @FXML
    public void eightPcChickenBucketAddToCartButtonOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void friesLargeAddToCartButtonOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void friesMediumAddToCartButtonOnAction(ActionEvent actionEvent) {

    }

    @FXML
    public void friesSmallAddToCartButtonOnAction(ActionEvent actionEvent) {

    }

    @FXML
    public void zingerBurgerAddToCartButtonOnAction(ActionEvent actionEvent) {

    }

    @FXML
    public void superChargerBurgerAddtoCartButtonOnAction(ActionEvent actionEvent) {

    }

    @FXML
    public void doubleZingerBurgerAddToCartButtonOnAction(ActionEvent actionEvent) {

    }

    @FXML
    public void sixPcWingsBucketAddToCartButtonOnAction(ActionEvent actionEvent) {

    }

    private void addToCart(String itemName,double price,TextField quantity){
        String qtyText= quantity.getText();
    }
}
