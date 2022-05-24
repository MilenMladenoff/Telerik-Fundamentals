package Homework03Loops;

import java.util.Scanner;

public class P10_WordOrNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String words = "";
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            String input = scan.nextLine();

            if (input.contains("0") || input.contains("1") || input.contains("2") || input.contains("3")
                    || input.contains("4") || input.contains("5") || input.contains("6") || input.contains("7")
                    || input.contains("8") || input.contains("9")) {
                int number = Integer.parseInt(input);
                sum += number;
            } else {

                if (words.isEmpty()) {
                    words += input;
                } else {
                    words += "-" + input;
                }

            }
        }

        System.out.println(words);
        System.out.println(sum);
    }
}
