package Homework03Loops;

import java.util.Scanner;

public class P06_WordOrNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if (input.contains("0") || input.contains("1") || input.contains("2") || input.contains("3")
                || input.contains("4") || input.contains("5") || input.contains("6") || input.contains("7")
                || input.contains("8") || input.contains("9")) {
            double number = Double.parseDouble(input);
            System.out.println(number + 1);
        } else {

            for (int i = input.length() - 1; i >= 0; i--) {
                char letter = input.charAt(i);
                System.out.print(letter);
            }
        }
    }
}
