package vehicles.planes;

import vehicles.Vehicle;
import vehicles.enums.VehicleColor;

public class Rotorcraft extends Vehicle {

    public static final double DEFAULT_FUEL_CONSUMPTION = 120;

    public Rotorcraft(double fuel, int power, VehicleColor randomColor) {
        super(fuel, power, randomColor);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
