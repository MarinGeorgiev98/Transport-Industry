package domainmodel;

import domainmodel.enums.VehicleColor;

import java.util.Objects;

public class Vehicle {
    protected static final double DEFAULT_FUEL_CONSUMPTION = 1.25;
    protected double fuelConsumption;
    protected double fuel;
    protected int speed;
    protected VehicleColor randomColor;

    public Vehicle(double fuel, int speed, VehicleColor randomColor) {
        this.fuel = fuel;
        this.speed = speed;
        this.randomColor = randomColor;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public static double getDefaultFuelConsumption() {
        return DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public VehicleColor getRandomColor() {
        return randomColor;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void drive(int kilometers) {
        if (canDrive(kilometers)) {
            this.fuel -= this.fuelConsumption * kilometers;
        }
    }

    private boolean canDrive(int kilometers) {
        return this.fuel >= this.fuelConsumption * kilometers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Fuel consumption: ")
                .append(this.getFuelConsumption())
                .append(System.lineSeparator())
                .append("Fuel: ")
                .append(this.getFuel())
                .append(System.lineSeparator())
                .append("Speed: ")
                .append(this.getSpeed())
                .append(System.lineSeparator())
                .append("Color: ")
                .append(getRandomColor())
                .append(System.lineSeparator());

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.getFuel(), getFuel()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFuel());
    }
}
