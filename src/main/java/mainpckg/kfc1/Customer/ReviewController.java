package mainpckg.kfc1.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class ReviewController
{
    @javafx.fxml.FXML
    private ComboBox ratingCombobox;
    @javafx.fxml.FXML
    private TextArea commentTextArea;
    @javafx.fxml.FXML
    private ListView completedOrderListView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitButtononAction(ActionEvent actionEvent) {
    }
}