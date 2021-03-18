package vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fuel = Integer.parseInt(scan.nextLine());
        int horsePower = Integer.parseInt(scan.nextLine());
        Vehicle raceMotorcycle = new RaceMotorcycle(fuel, horsePower);
        System.out.println(raceMotorcycle);

        fuel = Integer.parseInt(scan.nextLine());
        horsePower = Integer.parseInt(scan.nextLine());
        Vehicle crossMotorcycle = new CrossMotorcycle(fuel, horsePower);
        System.out.println(crossMotorcycle);

        fuel = Integer.parseInt(scan.nextLine());
        horsePower = Integer.parseInt(scan.nextLine());
        Vehicle familyCar = new FamilyCar(fuel, horsePower);
        System.out.println(familyCar);

        fuel = Integer.parseInt(scan.nextLine());
        horsePower = Integer.parseInt(scan.nextLine());
        Vehicle sportCar = new SportCar(fuel,horsePower);
        System.out.println(sportCar);
    }
}