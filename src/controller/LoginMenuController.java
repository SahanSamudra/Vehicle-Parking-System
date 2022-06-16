package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class LoginMenuController {
    public AnchorPane LoginMenuContext;




    public void btnInParking(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/InParking.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        LoginMenuContext.getChildren().clear();
        LoginMenuContext.getChildren().add(load);
    }

    public void btnLogOut(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoard.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        LoginMenuContext.getChildren().clear();
        LoginMenuContext.getChildren().add(load);
    }

    public void btnOnDelivery(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/OnDelivery.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        LoginMenuContext.getChildren().clear();
        LoginMenuContext.getChildren().add(load);
    }

    public void btnVehicleList(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/VehicleList.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        LoginMenuContext.getChildren().clear();
        LoginMenuContext.getChildren().add(load);
    }

    public void btnVDriverList(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DriverList.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        LoginMenuContext.getChildren().clear();
        LoginMenuContext.getChildren().add(load);
    }
}
