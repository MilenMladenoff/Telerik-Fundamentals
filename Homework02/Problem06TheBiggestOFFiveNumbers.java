package Homework02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem06TheBiggestOFFiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double c = Double.parseDouble(scan.nextLine());
        double d = Double.parseDouble(scan.nextLine());
        double e = Double.parseDouble(scan.nextLine());
        double maxNumber = 0;

        maxNumber = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));

        DecimalFormat decimalFormat = new DecimalFormat("#.######################");
        String formattedBiggestNum = decimalFormat.format(maxNumber);
        System.out.println(formattedBiggestNum);
    }
}
