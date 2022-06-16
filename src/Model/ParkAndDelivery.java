package Model;

public class ParkAndDelivery {

    private String vehicleNo;
    private String VehicleType;
    private String ParkingSlot;
    private String TimeAndDate;
    private String Driver;

    public ParkAndDelivery() {
    }

    public ParkAndDelivery(String vehicleNo, String vehicleType, String parkingSlot, String timeAndDate, String driver) {
        this.setVehicleNo(vehicleNo);
        setVehicleType(vehicleType);
        setParkingSlot(parkingSlot);
        setTimeAndDate(timeAndDate);
        setDriver(driver);
    }


    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getParkingSlot() {
        return ParkingSlot;
    }

    public void setParkingSlot(String parkingSlot) {
        ParkingSlot = parkingSlot;
    }

    public String getTimeAndDate() {
        return TimeAndDate;
    }

    public void setTimeAndDate(String timeAndDate) {
        TimeAndDate = timeAndDate;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }
}
