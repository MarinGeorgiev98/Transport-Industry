package domainmodel.cars;

import domainmodel.Vehicle;
import domainmodel.enums.VehicleColor;

public class Car extends Vehicle {
    public static final double DEFAULT_FUEL_CONSUMPTION = 3;

    public Car(double fuel, int horsePower, VehicleColor randomColor) {
        super(fuel, horsePower, randomColor);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}