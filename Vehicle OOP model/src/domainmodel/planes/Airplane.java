package domainmodel.planes;

import domainmodel.Vehicle;
import domainmodel.enums.VehicleColor;

public class Airplane extends Vehicle {

    private static final double DEFAULT_FUEL_CONSUMPTION = 104;

    public Airplane(double fuel, int power, VehicleColor randomColor) {
        super(fuel, power, randomColor);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}