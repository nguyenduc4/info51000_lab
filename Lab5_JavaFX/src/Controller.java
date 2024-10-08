
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author danie
 */
public class Controller {
    @FXML
    TextField nameTextField;
    @FXML
    TextField ageTextField;
    @FXML
    TextField emailTextField;
    
    public void submit(ActionEvent event) { 
        
        String name = nameTextField.getText();
        String age = ageTextField.getText();
        String email = emailTextField.getText();
        
        // Performing name validation
        if (name.isEmpty()) { 
            alertModal("Error!!", "Please check your name input!", "Name should not be Empty");
            return;
        }
        if (!name.matches("[a-zA-Z ]+")) {
            alertModal("Error!!", "Please check your name input!", "Name should be correct format, only charactor, no special char and number");
            return;
        }
        
        // Performing age validation
        if (age.isEmpty()) { 
            alertModal("Error!!", "Please check your age input!", "Age should not be Empty");
            return;
        }
        if (!age.matches("\\d+") || Integer.parseInt(age) < 0) {
                alertModal("Error!!", "Please check your age input!", "Age should only be non Negative Integer!");
                return;
            }
        
        // Performing email validation
        if (email.isEmpty()) { 
            alertModal("Error!!", "Please check your email input!", "Email should not be Empty");
            return;
        }
        if(!this._is_valid_email(email) || email.isEmpty()) {
            alertModal("Error!!", "Please check your email input!", "Email should have the right format!");
            return;
        }
                
        System.out.println("Submitted name : " + name + " Age: " + age + " Email: " + email);
        
        // Create a popup alert
        alertModal("Submitted", "Thank you!", "Submitted Details: \nName: " + name + "\nAge: " + age + "\nEmail: " + email);
    }
    
    public void alertModal(String title, String headerText, String contentText ) { 
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);
        alert.showAndWait();
    }
    
    private boolean _is_valid_email(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + 
                       "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(regex);
    }
    
}
