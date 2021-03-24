package domainmodel.ships;

import domainmodel.Vehicle;
import domainmodel.enums.VehicleColor;

public class PassengerShip extends Vehicle {

    public PassengerShip(double fuel, int power, VehicleColor randomColor) {
        super(fuel, power, randomColor);
    }
}