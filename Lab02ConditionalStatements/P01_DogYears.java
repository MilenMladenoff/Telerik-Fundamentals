package Lab02ConditionalStatements;

import java.util.Scanner;

public class P01_DogYears {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int humanYears = Integer.parseInt(scan.nextLine());
        int dogYears = 0;

        if (humanYears <= 2) {
            dogYears = humanYears * 10;
        } else {
            dogYears = 20 + (humanYears - 2) * 4;
        }

        System.out.println(dogYears);
    }
}
