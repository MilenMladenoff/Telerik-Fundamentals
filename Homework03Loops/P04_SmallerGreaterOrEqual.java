package Homework03Loops;

import java.util.Scanner;

public class P04_SmallerGreaterOrEqual {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int previousNum = Integer.parseInt(scan.nextLine());
        System.out.print(previousNum);

        for (int i = 2; i <= n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());

            if (previousNum < currentNum) {
                System.out.print("<");
            } else if (previousNum > currentNum) {
                System.out.print(">");
            } else {
                System.out.print("=");
            }

            System.out.print(currentNum);
            previousNum = currentNum;
        }
    }
}
