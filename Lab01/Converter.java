package Lab01;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double milesPerGallon = Double.parseDouble(scan.nextLine());
        double litersPerKilometer = 4.54 / (milesPerGallon * 1.6) * 100;
        System.out.printf("%.0f litres per 100 km", Math.floor(litersPerKilometer));
    }
}
