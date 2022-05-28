package Lab02ConditionalStatements;

import java.util.Scanner;

public class P09_DigitAsWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char digit = input.charAt(0);
        String word = "";

        switch (digit) {
            case '0':
                word = "zero";
                break;
            case '1':
                word = "one";
                break;
            case '2':
                word = "two";
                break;
            case '3':
                word = "three";
                break;
            case '4':
                word = "four";
                break;
            case '5':
                word = "five";
                break;
            case '6':
                word = "six";
                break;
            case '7':
                word = "seven";
                break;
            case '8':
                word = "eight";
                break;
            case '9':
                word = "nine";
                break;
            default:
                word = "not a digit";
                break;
        }

        if (input.length() == 1) {
            System.out.println(word);
        } else {
            System.out.println("not a digit");
        }

    }
}
