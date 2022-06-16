package Model;

public class Vehicle {
    private String vehicleNumber;
    private String vehicleType;
    private String maximumWeight;
    private String noOfPassengers;

    public Vehicle() {}

    public Vehicle(String vehicleNumber, String vehicleType, String maximumWeight, String noOfPassengers) {
        this.setVehicleNumber(vehicleNumber);
        this.setVehicleType(vehicleType);
        this.setMaximumWeight(maximumWeight);
        this.setNoOfPassengers(noOfPassengers);
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
}
