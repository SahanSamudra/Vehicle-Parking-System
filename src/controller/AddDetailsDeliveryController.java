package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AddDetailsDeliveryController {
    public AnchorPane AddDetailsDelivery;
    public AnchorPane AddDetailsDeliveryContext;

    public void btnCancelDetailsDelivery(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) AddDetailsDeliveryContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/OnDelivery.fxml"))));
    }
}
