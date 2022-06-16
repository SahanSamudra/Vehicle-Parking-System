package controller;

import Model.Vehicle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import view.tm.VehicleTm;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class VehicleListController {
    public AnchorPane VehicleListContext;
    public AnchorPane AddVehicleContext;
    public TableView tblVehicleList;
   public TableColumn VehicleNumber;
    public TableColumn VehicleType;
    public TableColumn MaximumWeight;
    public TableColumn NoOfPassengers;
    public TableView tblVehicleL;

    static ArrayList<Vehicle> vehicleList=new ArrayList();

    public void initialize(){

        VehicleNumber.setCellValueFactory(new PropertyValueFactory<>("vehicleNumber"));
        VehicleType.setCellValueFactory(new PropertyValueFactory<>("vehicleType"));
        MaximumWeight.setCellValueFactory(new PropertyValueFactory<>("maximumWeight"));
        NoOfPassengers.setCellValueFactory(new PropertyValueFactory<>("noOfPassengers"));
        tblVehicleList.setItems(FXCollections.observableArrayList(Arrays.asList(AddVehicleController.vehicleArray)));

    }


    public void btnMenuBackVehicleList(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginMenu.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        VehicleListContext.getChildren().clear();
        VehicleListContext.getChildren().add(load);
    }

    public void btnAddVehicleLIst(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddVehicle.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
       AddVehicleContext.getChildren().add(load);
    }

    public void btnLogOutVehicleList(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoard.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        VehicleListContext.getChildren().clear();
        VehicleListContext.getChildren().add(load);
    }


    public static void loadAllVehicles(){
       ObservableList<VehicleTm>tmObservableList= FXCollections.observableArrayList();
        for (Vehicle tempVehicle: AddVehicleController.vehicleList
             ) {
            tmObservableList.add(
                    new VehicleTm()
            );
        }




    }

}
