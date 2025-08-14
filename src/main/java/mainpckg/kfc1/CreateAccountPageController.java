package mainpckg.kfc1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import mainpckg.kfc1.Customer.Customer;

import java.time.LocalDate;
import java.util.ArrayList;

public class CreateAccountPageController
{
    ArrayList<Customer> customerList = new ArrayList<Customer>();

    @javafx.fxml.FXML
    private TextField phoneNoTextField;
    @javafx.fxml.FXML
    private RadioButton femaleRadioButton;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private PasswordField passwordPasswordField;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private RadioButton maleRadioButton;
    @javafx.fxml.FXML
    private RadioButton othersRadioButton;
    @javafx.fxml.FXML
    private TextArea addressTextArea;
    @javafx.fxml.FXML
    private DatePicker dateofbirthDatePicker;
    @javafx.fxml.FXML
    private ToggleGroup tg;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createAccountButtonOnAction(ActionEvent actionEvent) {
        String name,email,phoneNo,gender="",address,password ;
        LocalDate dob;

        name=nameTextField.getText();
        email=emailTextField.getText();
        phoneNo=phoneNoTextField.getText();
        address=addressTextArea.getText();
        password=passwordPasswordField.getText();
        dob=dateofbirthDatePicker.getValue();

        if (maleRadioButton.isSelected()) {
            gender="Male" ;
        }
        else if (femaleRadioButton.isSelected()) {
            gender="Female"  ;
        }
        else if (othersRadioButton.isSelected()){
            gender="Others" ;
        }

        Customer customer = new Customer(name,email,gender,address,password,phoneNo,dob);

        outputTextArea.clear();
        outputTextArea.setText(customer.toString());


        nameTextField.clear();
        emailTextField.clear();
        addressTextArea.clear();
        passwordPasswordField.clear();
        phoneNoTextField.clear();
        dateofbirthDatePicker.setValue(null);

        if (maleRadioButton.isSelected()) {
            maleRadioButton.setSelected(false);
        }
        else if (femaleRadioButton.isSelected()) {
            femaleRadioButton.setSelected(false);
        }
        else if (othersRadioButton.isSelected()){
            othersRadioButton.setSelected(false);
        }

    }
}