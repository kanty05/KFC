package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javax.xml.datatype.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class KitchenShiftLogController
{
    @javafx.fxml.FXML
    private Label endShiftTimeLable;
    @javafx.fxml.FXML
    private Label startShiftTimeLable;
    @javafx.fxml.FXML
    private Button endShiftButton;
    @javafx.fxml.FXML
    private Button startshiftButton;

    private LocalDateTime startTime;
    private final DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void endShiftButtonOnAction(ActionEvent actionEvent) {
        if(startTime != null){
            LocalDateTime endTime = LocalDateTime.now();
            endShiftTimeLable.setText(endTime.format(timeFormat));
    }

}
    @FXML
    public void startShiftButtonOnAction(ActionEvent actionEvent) {
        startTime = LocalDateTime.now();
        startShiftTimeLable.setText(startTime.format(timeFormat));
        endShiftTimeLable.setText("");
        }
    }
