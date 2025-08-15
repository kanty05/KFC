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

public class BrowseMenuController
{

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
        addToCart("12Pc Chicken Bucket",1799,twelvePcChickenQuantityTextField);
    }


    @FXML
    public void eightPcChickenBucketAddToCartButtonOnAction(ActionEvent actionEvent) {
        addToCart("8Pc Chicken Bucket",1279,eightPcChickenQuantityTextField);
    }

    @FXML
    public void friesLargeAddToCartButtonOnAction(ActionEvent actionEvent) {
        addToCart("Fries-Large",299,friesLargeQuantityTextField);
    }

    @FXML
    public void friesMediumAddToCartButtonOnAction(ActionEvent actionEvent) {
        addToCart("Fries-Medium",199,friesMediumQuantityTextField);
    }

    @FXML
    public void friesSmallAddToCartButtonOnAction(ActionEvent actionEvent) {
        addToCart("Fries-Small",149,friesSmallQuantityTextField);
    }

    @FXML
    public void zingerBurgerAddToCartButtonOnAction(ActionEvent actionEvent) {
        addToCart("Zinger Burger",299,zingerBurgerQuantityTextField);
    }

    @FXML
    public void superChargerBurgerAddtoCartButtonOnAction(ActionEvent actionEvent) {
        addToCart("Super Charger Burger",479,superChargerBurgerQuantityTextField);
    }

    @FXML
    public void doubleZingerBurgerAddToCartButtonOnAction(ActionEvent actionEvent) {
        addToCart("Double Charger Burger",599,doubleZingerBurgerQuantityTextField);
    }

    @FXML
    public void sixPcWingsBucketAddToCartButtonOnAction(ActionEvent actionEvent) {
        addToCart("6Pc Wings Bucket",329,sixPcChickenQuantityTextField);
    }

    private void addToCart(String itemName,double price,TextField quantity){
        String qtyText= quantity.getText();
    }
}
