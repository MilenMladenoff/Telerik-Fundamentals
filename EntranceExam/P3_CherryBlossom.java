package EntranceExam;

import java.util.Scanner;

public class P3_CherryBlossom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] expectedDate = scan.nextLine().split("\\s+");
        int day = Integer.parseInt(expectedDate[0]);
        String month = expectedDate[1];
        int year = Integer.parseInt(expectedDate[2]);
        int averageTemperature = Integer.parseInt(scan.nextLine());
        int rain = Integer.parseInt(scan.nextLine());
        int winterLength = Integer.parseInt(scan.nextLine());

        boolean isLeapYear = false;

        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 100 == 0) {
            isLeapYear = false;
        } else if (year % 4 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        if (isLeapYear) {
            averageTemperature += 5;
        }

        int daysEarly = 0;
        int daysLater = 0;

        if (winterLength >= 7) {
            daysLater += winterLength / 7;
        }

        int rainDiff = Math.abs(30 - rain);

        if (rainDiff >= 3) {
            daysLater += rainDiff / 3;
        }

        if (averageTemperature > 20) {
            daysEarly = 20 - averageTemperature;
        } else if (averageTemperature < 20) {
            daysLater += Math.abs(averageTemperature - 20);
        }

        day = day + daysLater - Math.abs(daysEarly);

        if (day <= 0) {
            month = "February";
            day = Math.abs(day);

            if (isLeapYear) {
                day = 29 - day;
            } else {
                day = 28 - day;
            }

        } else if (day > 31) {
            month = "April";
            day = day - 31;
        }

        System.out.printf("%d %s %d", day, month, year);
    }
}
