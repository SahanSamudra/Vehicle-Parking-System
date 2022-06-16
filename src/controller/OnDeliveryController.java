package controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

public class OnDeliveryController {
    public AnchorPane DeliveryContext;
    public AnchorPane OnDeliveryAddContext;
    public TableView tblOnDelivery;
    public TableColumn clmVehicleNo;
    public TableColumn clmVehicleTypeDelivery;
    public TableColumn clmDriverNameD;
    public TableColumn clmLeftTime;

    public void initialize(){
        clmVehicleNo.setCellValueFactory(new PropertyValueFactory<>("vehicleNo"));
        clmVehicleTypeDelivery.setCellValueFactory(new PropertyValueFactory<>("VehicleType"));
       clmDriverNameD.setCellValueFactory(new PropertyValueFactory<>("Driver"));
      clmLeftTime.setCellValueFactory(new PropertyValueFactory<>("TimeAndDate"));
        tblOnDelivery.setItems(FXCollections.observableArrayList(Arrays.asList(DashBoardController.deliveryArray)));



    }


    public void btnAddDriverD(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DriverList.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        DeliveryContext.getChildren().add(load);
    }

    public void btnMenuBackDelivery(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginMenu.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        DeliveryContext.getChildren().clear();
        DeliveryContext.getChildren().add(load);
    }

    public void btnAddVehicleD(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/VehicleList.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        DeliveryContext.getChildren().clear();
        DeliveryContext.getChildren().add(load);
    }

    public void btnLogOutDelivery(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoard.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
       DeliveryContext.getChildren().clear();
       DeliveryContext.getChildren().add(load);
    }

    public void btnAddDetailsDelivery(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddDetailsDelivery.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        OnDeliveryAddContext.getChildren().add(load);
    }
}
