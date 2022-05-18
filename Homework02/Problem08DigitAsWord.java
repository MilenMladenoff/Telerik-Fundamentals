package Homework02;

import java.util.Scanner;

public class Problem08DigitAsWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String digit = scan.nextLine();
        String digitAsAWord = "";

        switch (digit) {
            case "1":
                digitAsAWord = "one";
                break;
            case "2":
                digitAsAWord = "two";
                break;
            case "3":
                digitAsAWord = "three";
                break;
            case "4":
                digitAsAWord = "four";
                break;
            case "5":
                digitAsAWord = "five";
                break;
            case "6":
                digitAsAWord = "six";
                break;
            case "7":
                digitAsAWord = "seven";
                break;
            case "8":
                digitAsAWord = "eight";
                break;
            case "9":
                digitAsAWord = "nine";
                break;
            case "0":
                digitAsAWord = "zero";
                break;
            default:
                digitAsAWord = "not a digit";
                break;
        }

        System.out.println(digitAsAWord);
    }
}
