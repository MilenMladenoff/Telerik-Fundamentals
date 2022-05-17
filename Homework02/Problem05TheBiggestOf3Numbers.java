package Homework02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem05TheBiggestOf3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double c = Double.parseDouble(scan.nextLine());
        double maxNumber = 0;

        maxNumber = Math.max(a, Math.max(b, c));

        DecimalFormat decimalFormat = new DecimalFormat("#.######################");
        String formattedBiggestNum = decimalFormat.format(maxNumber);
        System.out.println(formattedBiggestNum);
    }
}
