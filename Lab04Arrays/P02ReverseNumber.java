package Lab04Arrays;

import java.util.Scanner;

public class P02ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] number = new char[input.length()];

        for (int i = 0; i < number.length; i++) {
            number[i] = input.charAt(i);
        }

        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
        }
    }
}
