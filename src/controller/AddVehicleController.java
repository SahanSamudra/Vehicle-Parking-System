package controller;

import Model.Vehicle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class AddVehicleController {
    public AnchorPane AddVehicleContext;
    public TextField txtVehicleNumberAddV;
    public TextField txtMaximumWeightAddV;
    public TextField txtNoOfPassengersAddV;
    public ComboBox<String> txtVehicleTypeAddV;

    String VehicleType;

    static Vehicle[] vehicleArray=new Vehicle[14];
    int nextVehicle;



    public void initialize(){
        txtVehicleTypeAddV.getItems().addAll("Van", "Cargo Lorry", "Bus");
        txtVehicleTypeAddV.getSelectionModel().selectedItemProperty().addListener(((observable, oldValue, newValue) -> {
            VehicleType=newValue;
        }));


    }
    public static Vehicle[] ArrayVehicle=new Vehicle[14];


   static ArrayList<Vehicle> vehicleList = new ArrayList();

    public static int VehicleCount;

    public void btnCancelAddVehicle(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) AddVehicleContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/VehicleList.fxml"))));
    }

    public void btnAddVehicle(ActionEvent actionEvent) {

   /*     ArrayVehicle[VehicleCount] = new Vehicle(txtVehicleNumberAddV.getText(), txtMaximumWeightAddV.getText(), txtNoOfPassengersAddV.getText(), VehicleType);

        System.out.println(ArrayVehicle[VehicleCount].getVehicleNumber());
        VehicleCount++;
    }*/


      Vehicle vehicle=new Vehicle("txtVehicleNumberAddV.getText", "txtVehicleTypeAddV.getText", "txtMaximumWeightAddV.getText", "txtNoOfPassengersAddV.getText");
            VehicleCount++;


       if (vehicleList.add(vehicle)){
            new Alert(Alert.AlertType.CONFIRMATION,"Added..", ButtonType.CLOSE).show();

   VehicleListController.loadAllVehicles();

        }else{
            new Alert(Alert.AlertType.WARNING,"Try Again..",ButtonType.CLOSE).show();
        }
       VehicleCollection(new Vehicle(txtVehicleNumberAddV.getText(),VehicleType,txtMaximumWeightAddV.getText(),txtNoOfPassengersAddV.getText()));
    }

        public void VehicleCollection(Vehicle V1){

        vehicleArray[nextVehicle++]=V1;


        }



}
