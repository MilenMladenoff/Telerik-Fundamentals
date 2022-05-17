package Homework02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem01ExchangeIfGreater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());

        if (a > b) {
            double temporaryNumber = a;
            a = b;
            b = temporaryNumber;
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.######################");
        String formattedA = decimalFormat.format(a);
        String formattedB = decimalFormat.format(b);

        System.out.printf("%s %s", formattedA, formattedB);
    }
}
