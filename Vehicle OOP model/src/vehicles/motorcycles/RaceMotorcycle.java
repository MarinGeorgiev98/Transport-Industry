package vehicles.motorcycles;

import vehicles.Vehicle;
import vehicles.enums.VehicleColor;

public class RaceMotorcycle extends Vehicle {
    public static final double DEFAULT_FUEL_CONSUMPTION = 8;

    public RaceMotorcycle(double fuel, int horsePower, VehicleColor randomColor) {
        super(fuel, horsePower, randomColor);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}