package domainmodel.motorcycles;

import domainmodel.Vehicle;
import domainmodel.enums.VehicleColor;

public class CrossMotorcycle extends Vehicle {
    public CrossMotorcycle(double fuel, int horsePower, VehicleColor randomColor) {
        super(fuel, horsePower, randomColor);
    }
}