package Practice;

public class Operations {
    public static float calculateRegistrationCost(Vehicle v){
        return v.getVehicleVehiclePrice()*0.1f;
    }
    public static float calculateInsuranceCost(Vehicle v){
        if (v.getVehicleType() == VehicleType.PRIVATE) {
            return 0.05f * v.getVehicleVehiclePrice();
        }
        else if (v.getVehicleType() == VehicleType.COMMERCIAL) {
            return 0.1f * v.getVehicleVehiclePrice();
        }
        else{
            return 0.2f * v.getVehicleVehiclePrice();
        }
    }
}
