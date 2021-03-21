package vehicles.main;

import vehicles.cars.FamilyCar;
import vehicles.cars.SportCar;
import vehicles.motorcycles.CrossMotorcycle;
import vehicles.motorcycles.RaceMotorcycle;
import vehicles.planes.Airplane;
import vehicles.planes.Rotorcraft;
import vehicles.ships.Bulker;
import vehicles.ships.PassengerShip;
import vehicles.trains.HighSpeedRail;
import vehicles.trains.Locomotive;
import vehicles.vehicle.Vehicle;
import vehicles.vehicle.VehicleColor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File fileData = new File("FileData.txt");
        Scanner reader = new Scanner(fileData);

        while (reader.hasNextLine()) {
            VehicleColor[] colors = VehicleColor.values();
            Random random = new Random();
            VehicleColor randomColor = colors[random.nextInt(colors.length)];

            String[] data = reader.nextLine().split(", ");

            if (data.length != 3) {
                System.out.println("Invalid input!");
                System.out.println();
                continue;
            }

            String vehicleType = data[0];
            int fuel = Integer.parseInt(data[1]);
            int speed = Integer.parseInt(data[2]);

            switch (vehicleType) {
                case "FamilyCar":
                    Vehicle familyCar = new FamilyCar(fuel, speed, randomColor);
                    System.out.println(familyCar);
                    break;
                case "SportCar":
                    Vehicle sportCar = new SportCar(fuel, speed, randomColor);
                    System.out.println(sportCar);
                    break;
                case "CrossMotorcycle":
                    Vehicle crossMotorcycle = new CrossMotorcycle(fuel, speed, randomColor);
                    System.out.println(crossMotorcycle);
                    break;
                case "RaceMotorcycle":
                    Vehicle raceMotorcycle = new RaceMotorcycle(fuel, speed, randomColor);
                    System.out.println(raceMotorcycle);
                    break;
                case "Airplane":
                    Vehicle airplane = new Airplane(fuel, speed, randomColor);
                    System.out.println(airplane);
                    break;
                case "Rotorcraft":
                    Vehicle rotorcraft = new Rotorcraft(fuel, speed, randomColor);
                    System.out.println(rotorcraft);
                    break;
                case "Bulker":
                    Vehicle bulker = new Bulker(fuel, speed, randomColor);
                    System.out.println(bulker);
                    break;
                case "PassengerShip":
                    Vehicle passengerShip = new PassengerShip(fuel, speed, randomColor);
                    System.out.println(passengerShip);
                    break;
                case "HighSpeedRail":
                    Vehicle highSpeedRail = new HighSpeedRail(fuel, speed, randomColor);
                    System.out.println(highSpeedRail);
                    break;
                case "Locomotive":
                    Vehicle locomotive = new Locomotive(fuel, speed, randomColor);
                    System.out.println(locomotive);
                    break;
                default:
                    System.out.println("Invalid vehicle name input!");
                    break;
            }
        }
        reader.close();
    }
}
