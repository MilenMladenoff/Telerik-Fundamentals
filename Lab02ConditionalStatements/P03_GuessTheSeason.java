package Lab02ConditionalStatements;

import java.util.Scanner;

public class P03_GuessTheSeason {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int date = Integer.parseInt(scan.nextLine());
        String season = "";

        switch (month) {
            case "January":
            case "February":
                season = "Winter";
                break;
            case "March":

                if (date < 20) {
                    season = "Winter";
                } else {
                    season = "Spring";
                }

                break;
            case "April":
            case "May":
                season = "Spring";
                break;
            case "June":

                if (date < 21) {
                    season = "Spring";
                } else {
                    season = "Summer";
                }

                break;
            case "July":
            case "August":
                season = "Summer";
                break;
            case "September":

                if (date < 22) {
                    season = "Summer";
                } else {
                    season = "Autumn";
                }

                break;
            case "October":
            case "November":
                season = "Autumn";
                break;
            case "December":

                if (date < 21) {
                    season = "Autumn";
                } else {
                    season = "Winter";
                }

                break;
        }

        System.out.println(season);
    }
}
