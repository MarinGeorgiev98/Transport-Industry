package vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Vehicle raceMotorcycle = new RaceMotorcycle(5, 20);
        Vehicle crossMotorcycle = new CrossMotorcycle(10, 15);
        Vehicle familyCar = new FamilyCar(2, 5);
        Vehicle sportCar = new SportCar(3, 4);

        System.out.println(raceMotorcycle);
        System.out.println(crossMotorcycle);
        System.out.println(familyCar);
        System.out.println(sportCar);
    }
}