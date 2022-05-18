package Homework02;

import java.util.Scanner;

public class Problem10NumberAsWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numberInDigits = scan.nextLine();
        char digit1 = numberInDigits.charAt(0);
        char digit2 = '0';
        char digit3 = '0';
        String firstWord = "";
        String secondDigitAsWords = "";
        String lastWord = "";

        if (numberInDigits.length() == 2) {
            digit2 = numberInDigits.charAt(1);
        }

        if (numberInDigits.length() == 3) {
            digit2 = numberInDigits.charAt(1);
            digit3 = numberInDigits.charAt(2);
        }

        switch (digit1) {
            case '1':
                firstWord = "one";
                break;
            case '2':
                firstWord = "two";
                break;
            case '3':
                firstWord = "three";
                break;
            case '4':
                firstWord = "four";
                break;
            case '5':
                firstWord = "five";
                break;
            case '6':
                firstWord = "six";
                break;
            case '7':
                firstWord = "seven";
                break;
            case '8':
                firstWord = "eight";
                break;
            case '9':
                firstWord = "nine";
                break;
            case '0':
                firstWord = "zero";
                break;
        }

        switch (digit3) {
            case '1':
                lastWord = "one";
                break;
            case '2':
                lastWord = "two";
                break;
            case '3':
                lastWord = "three";
                break;
            case '4':
                lastWord = "four";
                break;
            case '5':
                lastWord = "five";
                break;
            case '6':
                lastWord = "six";
                break;
            case '7':
                lastWord = "seven";
                break;
            case '8':
                lastWord = "eight";
                break;
            case '9':
                lastWord = "nine";
                break;
            case '0':
                lastWord = "";
                break;
        }

        switch (digit2) {
            case '1':

                switch (digit3) {
                    case '1':
                        secondDigitAsWords = "eleven";
                        break;
                    case '2':
                        secondDigitAsWords = "twelve";
                        break;
                    case '3':
                        secondDigitAsWords = "thirteen";
                        break;
                    case '4':
                        secondDigitAsWords = "fourteen";
                        break;
                    case '5':
                        secondDigitAsWords = "fifteen";
                        break;
                    case '6':
                        secondDigitAsWords = "sixteen";
                        break;
                    case '7':
                        secondDigitAsWords = "seventeen";
                        break;
                    case '8':
                        secondDigitAsWords = "eighteen";
                        break;
                    case '9':
                        secondDigitAsWords = "nineteen";
                        break;
                    case '0':
                        secondDigitAsWords = "ten";
                        break;
                }

                break;
            case '2':
                secondDigitAsWords = "twenty" + " " + lastWord;
                break;
            case '3':
                secondDigitAsWords = "thirty" + " " + lastWord;
                break;
            case '4':
                secondDigitAsWords = "forty" + " " + lastWord;
                break;
            case '5':
                secondDigitAsWords = "fifty" + " " + lastWord;
                break;
            case '6':
                secondDigitAsWords = "sixty" + " " + lastWord;
                break;
            case '7':
                secondDigitAsWords = "seventy" + " " + lastWord;
                break;
            case '8':
                secondDigitAsWords = "eighty" + " " + lastWord;
                break;
            case '9':
                secondDigitAsWords = "ninety" + " " + lastWord;
                break;
            case '0':
                secondDigitAsWords = "";
                break;
        }

        if (numberInDigits.length() == 1) {
            System.out.println(firstWord);
        } else if (numberInDigits.length() == 2) {
            System.out.println(secondDigitAsWords);
        } else if (numberInDigits.length() == 3) {

            if (digit2 != 0 && digit3 != 0) {
                System.out.println(firstWord + " hundred and " + secondDigitAsWords);
            } else {
                System.out.println(firstWord + " hundred");
            }
        }
    }
}
