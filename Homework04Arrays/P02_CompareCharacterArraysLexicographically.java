package Homework04Arrays;

import java.util.Scanner;

public class P02_CompareCharacterArraysLexicographically {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input1 = scan.nextLine();
        char[] arr1 = new char[input1.length()];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input1.charAt(i);
        }

        String input2 = scan.nextLine();
        char[] arr2 = new char[input2.length()];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = input2.charAt(i);
        }

        boolean areEqual = false;

        if (arr1.length < arr2.length) {
            System.out.println("First");
        } else if (arr1.length > arr2.length) {
            System.out.println("Second");
        } else {

            for (int i = 0; i < arr1.length; i++) {

                if (arr1[i] < arr2[i]) {
                    System.out.println("First");
                    areEqual = false;
                    break;
                } else if (arr1[i] > arr2[i]) {
                    System.out.println("Second");
                    areEqual = false;
                    break;
                } else {
                    areEqual = true;
                }
            }

            if (areEqual) {
                System.out.println("Equal");
            }
        }
    }
}
