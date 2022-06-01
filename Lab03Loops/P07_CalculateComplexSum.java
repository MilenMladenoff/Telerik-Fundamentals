package Lab03Loops;

import java.util.Scanner;

public class P07_CalculateComplexSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());
        double nFactorial = 1;
        double sum = 1;

        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
            double nxn = nFactorial / Math.pow(x, i);
            sum += nxn;
        }

        System.out.printf("%.5f", sum);
    }
}
