package vehicles.cars;

import vehicles.vehicle.VehicleColor;

public class SportCar extends Car {
    public static final double DEFAULT_FUEL_CONSUMPTION = 10;
    public SportCar (double fuel, int horsePower, VehicleColor randomColor) {
        super(fuel, horsePower, randomColor);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}