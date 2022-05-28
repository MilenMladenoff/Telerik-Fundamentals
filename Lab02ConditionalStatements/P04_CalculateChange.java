package Lab02ConditionalStatements;

import java.util.Scanner;

public class P04_CalculateChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = Double.parseDouble(scan.nextLine()) * 100;
        double paid = Double.parseDouble(scan.nextLine()) * 100;
        int change = (int) (paid - price);

        if (change >= 100) {
            int lev1 = change / 100;
            change = change % 100;
            System.out.printf("%d x 1 lev%n", lev1);
        }

        if (change >= 50) {
            change -= 50;
            System.out.println("1 x 50 stotinki");
        }

        if (change >= 20) {
            int stotinki20 = change / 20;
            change = change % 20;
            System.out.printf("%d x 20 stotinki%n", stotinki20);
        }

        if (change >= 10) {
            change -= 10;
            System.out.println("1 x 10 stotinki");
        }

        if (change >= 5) {
            change -= 5;
            System.out.println("1 x 5 stotinki");
        }

        if (change >= 2) {
            int stotinki2 = change / 2;
            change = change % 2;
            System.out.printf("%d x 2 stotinki%n", stotinki2);
        }

        if (change > 0) {
            System.out.printf("%d x 1 stotinka%n", change);
        }
    }
}
