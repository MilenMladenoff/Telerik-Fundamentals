package Lab03Loops;

import java.util.Scanner;

public class P05_CalculateDiscount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            double itemPrice = Double.parseDouble(scan.nextLine());
            System.out.printf("%.2f%n", itemPrice * 0.35);
        }
    }
}
