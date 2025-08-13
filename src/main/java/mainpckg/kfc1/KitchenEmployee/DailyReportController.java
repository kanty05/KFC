package mainpckg.kfc1.KitchenEmployee;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class DailyReportController
{
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> orderIDTableColumn;
    @javafx.fxml.FXML
    private Label totalOrdersLable;
    @javafx.fxml.FXML
    private Label totalRevenueLable;
    @javafx.fxml.FXML
    private TableView<KitchenEmployee> dailyReportTableView;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> itemsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> totalAmountTableColumn;
    @javafx.fxml.FXML
    private Label itemsSoldLable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateReportButtonOnAction(ActionEvent actionEvent) {
    }
}