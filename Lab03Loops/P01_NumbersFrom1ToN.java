package Lab03Loops;

import java.util.Scanner;

public class P01_NumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", i);
        }
    }
}
