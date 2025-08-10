package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class DailyReportController
{
    @javafx.fxml.FXML
    private TableColumn orderIDTableColumn;
    @javafx.fxml.FXML
    private Label totalOrdersLable;
    @javafx.fxml.FXML
    private Label totalRevenueLable;
    @javafx.fxml.FXML
    private TableView dailyReportTableView;
    @javafx.fxml.FXML
    private TableColumn itemsTableColumn;
    @javafx.fxml.FXML
    private TableColumn totalAmountTableColumn;
    @javafx.fxml.FXML
    private Label itemsSoldLable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateReportButtonOnAction(ActionEvent actionEvent) {
    }
}