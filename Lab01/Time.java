package Lab01;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int seconds = Integer.parseInt(scan.nextLine());
        int totalSeconds = seconds + minutes * 60 + hours * 60 * 60 + days * 60 * 60 * 24;
        System.out.println(totalSeconds);
    }
}
