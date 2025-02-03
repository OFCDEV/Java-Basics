package Practice;

public class Vehicle {
    //data members
    private String vehicleRegistrationId;
    private int vehicleSeatCount;
    private String vehicleModelName;
    private float vehicleVehiclePrice;
    private VehicleType vehicleType = VehicleType.PRIVATE; //Default Value
    
    public String getVehicleRegistrationId() {
        return vehicleRegistrationId;
    }

    public void setVehicleRegistrationId(String vehicleRegistrationId) {
        this.vehicleRegistrationId = vehicleRegistrationId;
    }

    public int getVehicleSeatCount() {
        return vehicleSeatCount;
    }

    public void setVehicleSeatCount(int vehicleSeatCount) {
        this.vehicleSeatCount = vehicleSeatCount;
    }

    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public float getVehicleVehiclePrice() {
        return vehicleVehiclePrice;
    }

    public void setVehicleVehiclePrice(float vehicleVehiclePrice) {
        this.vehicleVehiclePrice = vehicleVehiclePrice;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle(String vehicleRegistrationId, int vehicleSeatCount, String vehicleModelName,
            float vehicleVehiclePrice, VehicleType vehicleType) {
        this.vehicleRegistrationId = vehicleRegistrationId;
        this.vehicleSeatCount = vehicleSeatCount;
        this.vehicleModelName = vehicleModelName;
        this.vehicleVehiclePrice = vehicleVehiclePrice;
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle [vehicleRegistrationId=" + vehicleRegistrationId + ", vehicleSeatCount=" + vehicleSeatCount
                + ", vehicleModelName=" + vehicleModelName + ", vehicleVehiclePrice=" + vehicleVehiclePrice
                + ", vehicleType=" + vehicleType + "]";
    }

}
