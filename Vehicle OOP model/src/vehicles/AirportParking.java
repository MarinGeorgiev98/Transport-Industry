package vehicles;

import vehicles.enums.VehicleType;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AirportParking {
    private int parkingSize;
    private int priceForAMinute;
    public Map<String, Set<Vehicle>> parkingLots;
    private Map<Vehicle, Integer> reservedMinutes;
    private int price;

    public AirportParking(int parkingSize, int priceForAMinute) {
        this.parkingSize = parkingSize;
        this.priceForAMinute = priceForAMinute;
        this.reservedMinutes = new HashMap<>();
        this.parkingLots = new HashMap<>();
        this.parkingLots.put(String.valueOf(VehicleType.AIRPLANE), new HashSet<>());
        this.parkingLots.put(String.valueOf(VehicleType.FAMILYCAR), new HashSet<>());
        this.parkingLots.put(String.valueOf(VehicleType.LOCOMOTIVE), new HashSet<>());
        this.parkingLots.put(String.valueOf(VehicleType.RACEMOTORCYCLE), new HashSet<>());
    }

    public void canParkVehicle(Vehicle vehicle, int minutes) {
        if (parkingLots.get(vehicle.getClass().getSimpleName().toUpperCase()).size() < parkingSize) {
            this.parkingLots.get(vehicle.getClass().getSimpleName().toUpperCase()).add(vehicle);
            System.out.println("Your vehicle was successfully parked.");
            this.reservedMinutes.put(vehicle, minutes);
        } else {
            System.out.println("You cannot park your vehicle. Parking is full.");
        }
    }

    private int calculatePrice(Vehicle vehicle) {
        return this.price = reservedMinutes.get(vehicle) * priceForAMinute;
    }

    public void exitVehicle(Vehicle vehicle) {
        this.parkingLots.get(vehicle.getClass().getSimpleName().toUpperCase()).remove(vehicle);
        System.out.printf("You have successfully freed a parking space. Your parking price is: %d%n",
                calculatePrice(vehicle));
        this.reservedMinutes.remove(vehicle);
    }
}
