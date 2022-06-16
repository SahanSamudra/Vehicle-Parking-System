package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AddDetailsParkingController {
    public AnchorPane AddDetailsParkingContext;

    public void btnCancelDetailsParking(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) AddDetailsParkingContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/OnDelivery.fxml"))));
    }
}
