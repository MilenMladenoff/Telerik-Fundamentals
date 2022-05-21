package Homework02;

import java.util.Scanner;

public class Problem09PlayWithIntDoubleAndString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Please choose a type:%n1 --> int%n2 --> double%n3 --> string%n");
        int choice = Integer.parseInt(scan.nextLine());

        switch (choice) {
            case 1:
                System.out.println("Please enter an int:");
                int intNum = Integer.parseInt(scan.nextLine());
                System.out.println(intNum + 1);
                break;
            case 2:
                System.out.println("Please enter a double:");
                double realNum = Double.parseDouble(scan.nextLine());
                System.out.println(realNum + 1);
                break;
            case 3:
                System.out.println("Please enter a string:");
                String text = scan.nextLine();
                System.out.println(text + "*");
                break;
        }
    }
}
