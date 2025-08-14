package mainpckg.kfc1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mainpckg.kfc1.Customer.Customer;
import mainpckg.kfc1.Customer.CustomerDashboardController;
import mainpckg.kfc1.KitchenEmployee.KitchenEmployee;
import mainpckg.kfc1.KitchenEmployee.KitchenEmployeeDashboardController;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class LoginPageController {
    @javafx.fxml.FXML
    private PasswordField passwordPasswordField;
    @javafx.fxml.FXML
    private TextField userIDtextField;

    ArrayList<Customer> customerList = new ArrayList<Customer>();
    ArrayList<KitchenEmployee> kitchenEmployeeList = new ArrayList<KitchenEmployee>();

    @javafx.fxml.FXML
    public void initialize() {
        KitchenEmployee kitchenEmployee1 = new KitchenEmployee("employee1", "employee1@email.com", "female", "Dhaka", "1234", "01987767", LocalDate.of(2002, 3, 25));
        kitchenEmployeeList.add(kitchenEmployee1);

        KitchenEmployee kitchenEmployee2 = new KitchenEmployee("employee2", "employee2@email.com", "male", "Dhaka", "5678", "01987767", LocalDate.of(2002, 3, 25));
        kitchenEmployeeList.add(kitchenEmployee2);

        Customer customer = new Customer("purnota","customer@email.com","male","Dhaka","5555","099876543",LocalDate.of(2003,2,04));
        System.out.println(customer.getId());
        customerList.add(customer);
    }

    @javafx.fxml.FXML
    public void loginOnActionButton(ActionEvent actionEvent) throws IOException {
        String id, password;
        boolean flag = true;

        Alert erroralert = new Alert(Alert.AlertType.ERROR);

        id = userIDtextField.getText();
        password = passwordPasswordField.getText();

        if (id.isBlank()) {
            flag = false ;
            erroralert.setTitle("User ID Error");
            erroralert.setContentText("User ID can not be Blank");
            erroralert.showAndWait();
        }
        if (password.isBlank()) {
            flag = false ;
            erroralert.setTitle("Password Error");
            erroralert.setContentText(" Password can not be Blank");
            erroralert.showAndWait();
        }

        if (flag){
            if (id.length() == 7){
                for (Customer customer: customerList) {
                    if (customer.login(id, password) != null) {
                        Parent root= null ;
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/CustomerDashboard.fxml"));
                        root = fxmlLoader.load();
                        CustomerDashboardController customerDashboardController = fxmlLoader.getController();
                        customerDashboardController.setter(customer);
                        Scene scene = new Scene(root);
                        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
                        stage.setTitle("Customer Dashboard");
                        stage.setScene(scene);
                        stage.show();

                    }
                }
            } else if (id.length() == 8){
                for (KitchenEmployee kitchenEmployee: kitchenEmployeeList){
                    if(kitchenEmployee.login(id,password) != null){
                        Parent root= null ;
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("KitchenEmployee/KitchenEmployeeDashboard.fxml"));
                        root = fxmlLoader.load();
                        KitchenEmployeeDashboardController kitchenEmployeeDashboardController = fxmlLoader.getController();
                        kitchenEmployeeDashboardController.setter(kitchenEmployee);
                        Scene scene = new Scene(root);
                        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
                        stage.setTitle("Kitchen Employee Dashboard");
                        stage.setScene(scene);
                        stage.show();
                    }
                }
            } else {
                erroralert.setTitle("User ID Error");
                erroralert.setContentText("User ID type does not exist");
                erroralert.showAndWait();
            }
        }

    }

    @javafx.fxml.FXML
    public void createaccountOnActionButton(ActionEvent actionEvent) {
    }
}