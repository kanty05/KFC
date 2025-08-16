package mainpckg.kfc1.KitchenEmployee;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class DailyReportController
{
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> orderIDTableColumn;
    @javafx.fxml.FXML
    private Label totalOrdersLable;
    @javafx.fxml.FXML
    private Label totalRevenueLable;
    @javafx.fxml.FXML
    private TableView<Report> dailyReportTableView;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> itemsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<KitchenEmployee,String> totalAmountTableColumn;
    @javafx.fxml.FXML
    private Label itemsSoldLable;

    private ObservableList<Report> reports= FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        orderIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("orderID"));
        itemsTableColumn.setCellValueFactory(new PropertyValueFactory<>("items"));
        totalAmountTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
    }

    @javafx.fxml.FXML
    public void generateReportButtonOnAction(ActionEvent actionEvent) {
        dailyReportTableView.getItems() ;
        reports.add(new Report("0001","Zinger Burger,Fries-medium", 498));
        reports.add(new Report("0002","Zinger Burger", 299));
        reports.add(new Report("0003","Double Zinger Burger,12pcs Chicken Bucket", 2398));
        reports.add(new Report("0004","Zinger Burger,6pcs hot wings bucket", 698));

        dailyReportTableView.setItems(reports);


        totalOrdersLable.setText("Total Orders: 4");
        totalRevenueLable.setText("Total revenue: Tk.1495");
        itemsSoldLable.setText("Total items sold:7");

    }
}