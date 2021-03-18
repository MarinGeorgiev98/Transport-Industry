package vehicle;

public class Vehicle {
    public static final double DEFAULT_FUEL_CONSUMPTION = 1.25;
    public double fuelConsumption;
    double fuel;
    int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public static double getDefaultFuelConsumption() {
        return DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
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

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
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
                .append("Fuel consumption: ")
                .append(this.getFuelConsumption())
                .append(System.lineSeparator())
                .append("Fuel: ")
                .append(this.getFuel())
                .append(System.lineSeparator())
                .append("Horsepower: ")
                .append(this.getHorsePower())
                .append(System.lineSeparator());
        return sb.toString();
    }
}