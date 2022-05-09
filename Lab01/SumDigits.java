package Lab01;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int digitsSum = 0;

        for (int i = 1; i <= 4; i++){
            int currentDigit = number % 10;
            digitsSum += currentDigit;
            number /= 10;
        }

        System.out.println(digitsSum);
    }
}
