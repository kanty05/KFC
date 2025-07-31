module mainpckg.kfc1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpckg.kfc1 to javafx.fxml;
    exports mainpckg.kfc1;
}