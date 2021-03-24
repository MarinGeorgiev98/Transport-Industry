package vehicles;

import vehicles.cars.FamilyCar;
import vehicles.cars.SportCar;
import vehicles.enums.VehicleColor;
import vehicles.enums.VehicleType;
import vehicles.motorcycles.CrossMotorcycle;
import vehicles.motorcycles.RaceMotorcycle;
import vehicles.planes.Airplane;
import vehicles.planes.Rotorcraft;
import vehicles.ships.Bulker;
import vehicles.ships.PassengerShip;
import vehicles.trains.HighSpeedRail;
import vehicles.trains.Locomotive;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        EnumMap<VehicleType, Set<Vehicle>> vehicles = new EnumMap<>(VehicleType.class);

        createVehicleObjectsMethod(vehicles);

        sortByFieldMethod(vehicles);

        Vehicle familyCar = new FamilyCar(5, 50, VehicleColor.PURPLE);
        AirportParking airportParking = new AirportParking(20, 4);
        airportParking.canParkVehicle(familyCar, 5);
        airportParking.exitVehicle(familyCar);
    }

    private static void createVehicleObjectsMethod(EnumMap<VehicleType, Set<Vehicle>> vehicles) {
        File fileData = new File("FileData.txt");
        try {
            Scanner reader = new Scanner(fileData);
            Random random = new Random();

            while (reader.hasNextLine()) {
                VehicleColor[] colors = VehicleColor.values();
                VehicleColor randomColor = colors[random.nextInt(colors.length)];

                String[] data = reader.nextLine().split(", ");

                if (data.length != 3) {
                    System.out.println("Invalid input!");
                    System.out.println();
                    continue;
                }

                String input = data[0];
                int fuel = Integer.parseInt(data[1]);
                int speed = Integer.parseInt(data[2]);
                VehicleType vehicleType = VehicleType.valueOf(input.toUpperCase());

                switch (vehicleType) {
                    case FAMILYCAR:
                        Vehicle familyCar = new FamilyCar(fuel, speed, randomColor);
                        vehicles.putIfAbsent(VehicleType.FAMILYCAR, new HashSet<>());
                        vehicles.get(VehicleType.FAMILYCAR).add(familyCar);
                        System.out.println(familyCar);
                        break;
                    case SPORTCAR:
                        Vehicle sportCar = new SportCar(fuel, speed, randomColor);
                        vehicles.putIfAbsent(VehicleType.SPORTCAR, new HashSet<>());
                        vehicles.get(VehicleType.SPORTCAR).add(sportCar);
                        System.out.println(sportCar);
                        break;
                    case CROSSMOTORCYCLE:
                        Vehicle crossMotorcycle = new CrossMotorcycle(fuel, speed, randomColor);
                        vehicles.putIfAbsent(VehicleType.CROSSMOTORCYCLE, new HashSet<>());
                        vehicles.get(VehicleType.CROSSMOTORCYCLE).add(crossMotorcycle);
                        System.out.println(crossMotorcycle);
                        break;
                    case RACEMOTORCYCLE:
                        Vehicle raceMotorcycle = new RaceMotorcycle(fuel, speed, randomColor);
                        vehicles.putIfAbsent(VehicleType.RACEMOTORCYCLE, new HashSet<>());
                        vehicles.get(VehicleType.RACEMOTORCYCLE).add(raceMotorcycle);
                        System.out.println(raceMotorcycle);
                        break;
                    case AIRPLANE:
                        Vehicle airplane = new Airplane(fuel, speed, randomColor);
                        vehicles.putIfAbsent(VehicleType.AIRPLANE, new HashSet<>());
                        vehicles.get(VehicleType.AIRPLANE).add(airplane);
                        System.out.println(airplane);
                        break;
                    case ROTORCRAFT:
                        Vehicle rotorcraft = new Rotorcraft(fuel, speed, randomColor);
                        vehicles.putIfAbsent(VehicleType.ROTORCRAFT, new HashSet<>());
                        vehicles.get(VehicleType.ROTORCRAFT).add(rotorcraft);
                        System.out.println(rotorcraft);
                        break;
                    case BULKER:
                        Vehicle bulker = new Bulker(fuel, speed, randomColor);
                        vehicles.putIfAbsent(VehicleType.BULKER, new HashSet<>());
                        vehicles.get(VehicleType.BULKER).add(bulker);
                        System.out.println(bulker);
                        break;
                    case PASSENGERSHIP:
                        Vehicle passengerShip = new PassengerShip(fuel, speed, randomColor);
                        vehicles.putIfAbsent(VehicleType.PASSENGERSHIP, new HashSet<>());
                        vehicles.get(VehicleType.PASSENGERSHIP).add(passengerShip);
                        System.out.println(passengerShip);
                        break;
                    case HIGHSPEEDRAIL:
                        Vehicle highSpeedRail = new HighSpeedRail(fuel, speed, randomColor);
                        vehicles.putIfAbsent(VehicleType.HIGHSPEEDRAIL, new HashSet<>());
                        vehicles.get(VehicleType.HIGHSPEEDRAIL).add(highSpeedRail);
                        System.out.println(highSpeedRail);
                        break;
                    case LOCOMOTIVE:
                        Vehicle locomotive = new Locomotive(fuel, speed, randomColor);
                        vehicles.putIfAbsent(VehicleType.LOCOMOTIVE, new HashSet<>());
                        vehicles.get(VehicleType.LOCOMOTIVE).add(locomotive);
                        System.out.println(locomotive);
                        break;
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not find the file.");
        }
        System.out.println("====================================================");
        System.out.println();
    }

    private static void sortByFieldMethod(EnumMap<VehicleType, Set<Vehicle>> vehicles) {
        File sortingFile = new File("SortingFile.txt");
        try {
            Scanner read = new Scanner(sortingFile);
            while (read.hasNextLine()) {
                String[] data = read.nextLine().split(" ");

                String input = data[2];
                VehicleType vehicleType = VehicleType.valueOf(input.toUpperCase());
                String field = data[3];

                switch (vehicleType) {
                    case FAMILYCAR:
                        if ("fuel".equals(field)) {
                            Set<Vehicle> carsSortedByFuel =
                                    vehicles.get(VehicleType.FAMILYCAR)
                                            .stream()
                                            .sorted(Comparator.comparing(Vehicle::getFuel))
                                            .collect(Collectors.toCollection(LinkedHashSet::new));
                            System.out.println("List of FamilyCars by fuel:");
                            for (Vehicle vehicle : carsSortedByFuel) {
                                System.out.println(vehicle);
                            }
                        } else if ("speed".equals(field)) {
                            System.out.println("List of FamilyCars by speed:");
                            Set<Vehicle> carsSortedBySpeed =
                                    vehicles.get(VehicleType.FAMILYCAR)
                                            .stream()
                                            .sorted(Comparator.comparing(Vehicle::getSpeed))
                                            .collect(Collectors.toCollection(LinkedHashSet::new));
                            for (Vehicle vehicle : carsSortedBySpeed) {
                                System.out.println(vehicle);
                            }
                        }
                        break;

                    case AIRPLANE:
                        if ("fuel".equals(field)) {
                            Set<Vehicle> airplanesSortedByFuel =
                                    vehicles.get(VehicleType.AIRPLANE)
                                            .stream()
                                            .sorted(Comparator.comparing(Vehicle::getFuel))
                                            .collect(Collectors.toCollection(LinkedHashSet::new));
                            System.out.println("List of airplanes by fuel:");
                            for (Vehicle vehicle : airplanesSortedByFuel) {
                                System.out.println(vehicle);
                            }
                        } else if ("speed".equals(field)) {
                            Set<Vehicle> airplanesSortedBySpeed =
                                    vehicles.get(VehicleType.AIRPLANE)
                                            .stream()
                                            .sorted(Comparator.comparing(Vehicle::getSpeed))
                                            .collect(Collectors.toCollection(LinkedHashSet::new));
                            System.out.println("List of airplanes by speed:");
                            for (Vehicle vehicle : airplanesSortedBySpeed) {
                                System.out.println(vehicle);
                            }
                        }
                        break;

                    case LOCOMOTIVE:
                        if ("fuel".equals(field)) {
                            Set<Vehicle> locomotivesSortedByFuel =
                                    vehicles.get(VehicleType.LOCOMOTIVE)
                                            .stream()
                                            .sorted(Comparator.comparing(Vehicle::getFuel))
                                            .collect(Collectors.toCollection(LinkedHashSet::new));
                            System.out.println("List of Locomotives by fuel:");
                            for (Vehicle vehicle : locomotivesSortedByFuel) {
                                System.out.println(vehicle);
                            }
                        } else if ("speed".equals(field)) {
                            Set<Vehicle> locomotivesSortedBySpeed =
                                    vehicles.get(VehicleType.LOCOMOTIVE)
                                            .stream()
                                            .sorted(Comparator.comparing(Vehicle::getSpeed))
                                            .collect(Collectors.toCollection(LinkedHashSet::new));
                            System.out.println("List of Locomotives by speed:");
                            for (Vehicle vehicle : locomotivesSortedBySpeed) {
                                System.out.println(vehicle);
                            }
                        }
                        break;
                }
            }
            read.close();
            System.out.println("====================================================");
        } catch (FileNotFoundException e) {
            System.out.println("Could not find the file.");
        }
    }
}
