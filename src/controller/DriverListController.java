package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class DriverListController {
    public AnchorPane DriverListContext;
    public AnchorPane DriverListAddContext;
    public AnchorPane AddDriverContext;


    public void btnMenuBackDriverList(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginMenu.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        DriverListContext.getChildren().clear();
        DriverListContext.getChildren().add(load);

    }

    public void btnLogOutDriverList(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoard.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        DriverListContext.getChildren().clear();
        DriverListContext.getChildren().add(load);
    }

    public void btnAddDriverList(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddDriver.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
       AddDriverContext.getChildren().add(load);
    }
}
