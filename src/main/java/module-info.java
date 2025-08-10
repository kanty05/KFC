module mainpckg.kfc1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;


    opens mainpckg.kfc1 to javafx.fxml;

    opens mainpckg.kfc1.Customer to javafx.fxml, java.base ;
    opens mainpckg.kfc1.KitchenEmployee to javafx.fxml, java.base ;

    exports mainpckg.kfc1 ;
    exports mainpckg.kfc1.Customer ;
    exports mainpckg.kfc1.KitchenEmployee ;
}