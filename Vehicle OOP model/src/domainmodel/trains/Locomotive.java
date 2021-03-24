package domainmodel.trains;

import domainmodel.Vehicle;
import domainmodel.enums.VehicleColor;

public class Locomotive extends Vehicle {

    public Locomotive(double fuel, int power, VehicleColor randomColor) {
        super(fuel, power, randomColor);
    }
}