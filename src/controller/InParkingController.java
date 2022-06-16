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

public class InParkingController {
    public AnchorPane ParkingContext;
    public AnchorPane AddVehicleInParkingContext;
    public TableView tblInParking;
    public TableColumn clmVehicleNumber;
    public TableColumn clmVehicleType;
    public TableColumn clmParkingSlot;
    public TableColumn clmParkingTime;

    public void initialize(){

        clmVehicleNumber.setCellValueFactory(new PropertyValueFactory<>("vehicleNo"));
        clmVehicleType.setCellValueFactory(new PropertyValueFactory<>("VehicleType"));
        clmParkingSlot.setCellValueFactory(new PropertyValueFactory<>("ParkingSlot"));
        clmParkingTime.setCellValueFactory(new PropertyValueFactory<>("TimeAndDate"));
        tblInParking.setItems(FXCollections.observableArrayList(Arrays.asList(DashBoardController.parkingArray)));
    }


    public void btnMenuBackParking(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginMenu.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        ParkingContext.getChildren().clear();
        ParkingContext.getChildren().add(load);

    }

    public void btnAddDriver(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DriverList.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        ParkingContext.getChildren().add(load);
    }

    public void btnAddVehicle(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/VehicleList.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
    ParkingContext.getChildren().add(load);
    }

    public void btnLogOutParking(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoard.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        ParkingContext.getChildren().clear();
        ParkingContext.getChildren().add(load);
    }

    public void btnAddDetailsParking(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddDetailsParking.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        AddVehicleInParkingContext.getChildren().add(load);
    }
}
