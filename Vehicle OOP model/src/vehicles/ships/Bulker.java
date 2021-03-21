package vehicles.ships;

import vehicles.vehicle.Vehicle;
import vehicles.vehicle.VehicleColor;

public class Bulker extends Vehicle {

    public static final double DEFAULT_FUEL_CONSUMPTION = 223;

    public Bulker (double fuel, int power, VehicleColor randomColor) {
        super(fuel, power, randomColor);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}