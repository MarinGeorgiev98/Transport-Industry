package vehicles.planes;

import vehicles.Vehicle;
import vehicles.enums.VehicleColor;

public class Airplane extends Vehicle {

    private static final double DEFAULT_FUEL_CONSUMPTION = 104;

    public Airplane(double fuel, int power, VehicleColor randomColor) {
        super(fuel, power, randomColor);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}