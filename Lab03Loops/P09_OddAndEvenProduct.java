package Lab03Loops;

import java.util.Scanner;

public class P09_OddAndEvenProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int oddsProduct = 1;
        int evensProduct = 1;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());

            if (i % 2 == 0) {
                evensProduct *= currentNum;
            } else {
                oddsProduct *= currentNum;
            }
        }

        if (oddsProduct == evensProduct) {
            System.out.printf("yes %d", oddsProduct);
        } else {
            System.out.printf("no %d %d", oddsProduct, evensProduct);
        }
    }
}
