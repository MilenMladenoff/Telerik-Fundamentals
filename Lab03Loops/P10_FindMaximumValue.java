package Lab03Loops;

import java.util.Scanner;

public class P10_FindMaximumValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxNum = -200;
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());

            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
        }

        System.out.println(maxNum);
    }
}
