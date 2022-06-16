package controller;

import Model.ParkAndDelivery;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static controller.AddVehicleController.*;

public class DashBoardController {
    public AnchorPane DashBoardFormContext;
    public AnchorPane DashBoardLoginContext;
    public ImageView LoginContext;
    public Label lblTime;
    public Label lblDate;
    public ComboBox cmbSelectVehicle;
    public ComboBox cmbSelectDriver;
    public TextField txtVehicleType;
    public Label lblSlot;

   static ParkAndDelivery[] parkingArray=new ParkAndDelivery[14];
   static ParkAndDelivery[] deliveryArray=new ParkAndDelivery[14];

    int NextPark;
    int NextDelivery;


    String driverName;
    String vehicleNo;
    String busSlot[]={"14"};
    String vanSlot[]={"1","2","3","4","12","13"};
    String lorrySlot[]={"5","6","7","8","9","10","11"};

    public void initialize(){
       cmbSelectVehicle.setVisible(true);
        cmbSelectDriver.setVisible(true);

        cmbSelectVehicle.getItems().addAll(
                "NA-3434",
                "KA-4563",
                "58-3567",
                "GF-4358",
                "CCB-3568",
                "LM-6679",
                "QA-3369",
                "KB-3668",
                "JJ-9878",
                "GH-5772",
                "XY-4456",
                "YQ-3536",
                "CBB-3566",
                "QH-3444");

        cmbSelectDriver.getItems().addAll("Sumith Kumara", "Amila Pathirana", "Jithmal Perera", "Sumith Dissanayaka", "Sumanasiri Herath", "Awantha Fernando", "Charith Sudara ", "Prashan Dineth", "Chethiya Dilan", "Dushantha Perera ",
                "Sumith Udayanga ", "Dinesh Udara ", "Udana Chathuranga", "Mohommad Riaz ", "Sandun Kumara ", "Priyanga Perera ");



        cmbSelectVehicle.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

                    vehicleNo= (String) newValue;
                    path();
        });
        cmbSelectDriver.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

            driverName= (String) newValue;

        });



   /* for (int i=0;i< VehicleCount;i++){

        cmbSelectVehicle.getItems().addAll(ArrayVehicle[i].getVehicleNumber());

    }*/

       /* for (int i=0;i<VehicleCount;i++){

            cmbSelectVehicle.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {


            });
        }*/
        initClock();


    }

    public void btnLoginForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginForm.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        DashBoardLoginContext.getChildren().add(load);
       cmbSelectVehicle.setVisible(false);
       cmbSelectDriver.setVisible(false);

    }

    public void btnParkVehicle(ActionEvent actionEvent) {

        ParkCollection(new ParkAndDelivery(vehicleNo,txtVehicleType.getText(),lblSlot.getText(),lblDate.getText()+lblTime.getText(),driverName));
    }

    public void btnOnDeliveryLast(ActionEvent actionEvent) {

        LeaveCollection(new ParkAndDelivery(vehicleNo,txtVehicleType.getText(),lblSlot.getText(),lblDate.getText()+lblTime.getText(),driverName));

    }

    private void initClock() {

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            lblTime.setText(LocalDateTime.now().format(formatter));


            SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();
            lblDate.setText(formatter2.format(date));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

        public void path() {

            if (vehicleNo.equals("NA-3434")) {
                txtVehicleType.setText("Bus");

                for (int i=0;i<busSlot.length;i++){

                    if (busSlot[i]!=""){
                        lblSlot.setText(busSlot[i]);
                        busSlot[i]="";
                    }
                }

            } else if (vehicleNo.equals("KA-4563") || vehicleNo.equals("58-3567") || vehicleNo.equals("GF-4358") || vehicleNo.equals("CCB-3568") || vehicleNo.equals("LM-6679") || vehicleNo.equals("QA-3369")) {

                txtVehicleType.setText("Van");
                for (int i=0;i<vanSlot.length;i++){

                    if (vanSlot[i]!=""){
                        lblSlot.setText(vanSlot[i]);
                        vanSlot[i]="";
                        break;
                    }
                }

            } else if (vehicleNo.equals("KB-3668") || vehicleNo.equals("JJ-9878") || vehicleNo.equals("GH-5772") || vehicleNo.equals("XY-4456") || vehicleNo.equals("YQ-3536") || vehicleNo.equals("CBB-3566") || vehicleNo.equals("QH-3444")) {
                txtVehicleType.setText("Cargo Lorry");
                for (int i=0;i<lorrySlot.length;i++){

                    if (lorrySlot[i]!=""){
                        lblSlot.setText(lorrySlot[i]);
                        lorrySlot[i]="";
                        break;
                    }
                }
            }
        }

        public void ParkCollection(ParkAndDelivery P1){
            if (deliveryArray[0] != null) {
                for (int i = 0; i < NextDelivery; i++) {
                    if (P1.getVehicleNo() == deliveryArray[i].getVehicleNo()) {
                        for (int j = i; j < NextDelivery; j++) {
                            deliveryArray[j]=  deliveryArray[j + 1];
                        }
                        NextDelivery--;
                        break;
                    }
                }
            }
        parkingArray[NextPark++]=P1;
    }
        public void LeaveCollection(ParkAndDelivery L1){
            if (parkingArray[0] != null) {
                for (int i = 0; i < NextPark; i++) {
                    if (L1.getVehicleNo() == parkingArray[i].getVehicleNo()) {
                        for (int j = i; j < NextPark; j++) {
                            parkingArray[j]=  parkingArray[j + 1];
                        }
                        NextPark--;
                        break;
                    }
                }
            }

        deliveryArray[NextDelivery++]=L1;
        }


}
