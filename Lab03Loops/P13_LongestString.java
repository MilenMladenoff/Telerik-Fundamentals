package Lab03Loops;

import java.util.Scanner;

public class P13_LongestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int maxLength = 0;
        String longestString = "";

        while (!input.equals("END")) {

            if (input.length() >= maxLength) {
                maxLength = input.length();
                longestString = input;
            }

            input = scan.nextLine();
        }

        System.out.println(longestString);
    }
}
