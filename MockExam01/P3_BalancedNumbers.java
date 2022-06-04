package MockExam01;

import java.util.Scanner;

public class P3_BalancedNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isBalanced = true;
        int balancedNumbersSum = 0;

        while (isBalanced) {
            String inputNum = scan.nextLine();
            int firstDigit = Integer.parseInt(String.valueOf(inputNum.charAt(0)));
            int secondDigit = Integer.parseInt(String.valueOf(inputNum.charAt(1)));
            int thirdDigit = Integer.parseInt(String.valueOf(inputNum.charAt(2)));

            if (firstDigit + thirdDigit == secondDigit) {
                balancedNumbersSum += Integer.parseInt(inputNum);
            } else {
                isBalanced = false;
            }
        }

        System.out.println(balancedNumbersSum);
    }
}
