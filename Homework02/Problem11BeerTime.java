package Homework02;

import java.util.Scanner;

public class Problem11BeerTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String time = scan.nextLine();
        int indexOfColon = time.indexOf(":");
        int indexOfSpace = time.indexOf(" ");

        int hours = Integer.parseInt(time.substring(0, indexOfColon));
        String designator = time.substring(indexOfSpace + 1);

        if (designator.equals("PM") && hours < 12) {
            hours += 12;
        }

        if (designator.equals("AM") && hours == 12) {
            hours = 0;
        }

        if (hours >= 3 && 13 > hours) {
            System.out.println("non-beer time");
        } else {
            System.out.println("beer time");
        }
    }
}
