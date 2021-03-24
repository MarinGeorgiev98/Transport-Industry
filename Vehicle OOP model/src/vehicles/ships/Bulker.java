package vehicles.ships;

import vehicles.Vehicle;
import vehicles.enums.VehicleColor;

public class Bulker extends Vehicle {

    private static final double DEFAULT_FUEL_CONSUMPTION = 223;

    public Bulker(double fuel, int power, VehicleColor randomColor) {
        super(fuel, power, randomColor);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}