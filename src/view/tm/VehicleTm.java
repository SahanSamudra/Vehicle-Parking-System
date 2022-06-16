package view.tm;

import javafx.scene.control.Button;

public class VehicleTm {
    private String vehicleNumber;
    private String vehicleType;
    private String maximumWeight;
    private String noOfPassengers;
    private Button btn;

    public VehicleTm() {
    }

    public VehicleTm(String vehicleNumber, String vehicleType, String maximumWeight, String noOfPassengers, Button btn) {
        this.setVehicleNumber(vehicleNumber);
        this.setVehicleType(vehicleType);
        this.setMaximumWeight(maximumWeight);
        this.setNoOfPassengers(noOfPassengers);
        this.setBtn(btn);
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getMaximumWeight() {
        return maximumWeight;
    }

    public void setMaximumWeight(String maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public String getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(String noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
