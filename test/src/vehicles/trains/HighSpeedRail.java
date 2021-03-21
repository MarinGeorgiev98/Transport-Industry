package vehicles.trains;

import vehicles.vehicle.Vehicle;
import vehicles.vehicle.VehicleColor;

public class HighSpeedRail extends Vehicle {

    public static final double DEFAULT_FUEL_CONSUMPTION = 140;

    public HighSpeedRail (double fuel, int power, VehicleColor randomColor) {
        super(fuel, power, randomColor);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}