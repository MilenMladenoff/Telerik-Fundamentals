package Homework02;

import java.util.Scanner;

public class Problem03CheckForAPlayCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        boolean isValid = false;

        switch (input) {
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
            case "J":
            case "Q":
            case "K":
            case "A":
                isValid = true;
                break;
        }

        if (isValid){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
