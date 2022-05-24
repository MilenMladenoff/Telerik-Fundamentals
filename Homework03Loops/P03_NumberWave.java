package Homework03Loops;

import java.util.Scanner;

public class P03_NumberWave {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        for (int i = n - 1; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
