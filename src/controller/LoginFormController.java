package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;

public class LoginFormController {
    public AnchorPane LoginFormContext;
    public JFXTextField UserName;
    public JFXPasswordField Password;
    public Label lblError;
    public JFXButton btnCancelLogin;

    public void btnLogin(ActionEvent actionEvent) throws IOException {


        LoginFormManager();
    }


    public void btnCancel(ActionEvent actionEvent) throws IOException {
   /*     URL resource = getClass().getResource("../view/DashBoard.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        LoginFormContext.getChildren().clear();
        LoginFormContext.getChildren().add(load);*/
        Stage window = (Stage) LoginFormContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashBoard.fxml"))));
    }

   private void LoginFormManager() throws IOException {
        String user = "admin";
        String password = "1234";
        if (UserName.getText().equals(user) && Password.getText().equals(password)) {
            Stage window = (Stage) LoginFormContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LoginMenu.fxml"))));
        } else if (UserName.getText().isEmpty() && Password.getText().isEmpty()) {
            lblError.setText("Your User Name Or Password IS Empty...!");
            UserName.clear();
            Password.clear();
        }
            else if (!UserName.getText().equals(user)) {
                lblError.setText("Your User Name is incorrect..!");
                UserName.clear();
                Password.clear();
            } else if (!Password.getText().equals(password)) {
                lblError.setText("Your Password is incorrect..!");
                UserName.clear();
                Password.clear();
            }
        }

    }


        /* else if (UserName.getText().isEmpty() && Password.getText().isEmpty()) {
               lblError.setText("Your User Name Or Password IS Empty...!");
               UserName.clear();
               Password.clear();
           }*/




