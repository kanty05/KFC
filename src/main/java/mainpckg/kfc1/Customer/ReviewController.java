package mainpckg.kfc1.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

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
    private TableColumn TotalAmountTableColumn;
    @javafx.fxml.FXML
    private TableColumn ItemTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitButtononAction(ActionEvent actionEvent) {
    }
}