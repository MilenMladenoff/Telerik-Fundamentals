package Homework02;

import java.util.Scanner;

public class Problem09PlayWithIntDoubleAndString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = Integer.parseInt(scan.nextLine());

        switch (choice) {
            case 1:
                int intNum = Integer.parseInt(scan.nextLine());
                System.out.println(intNum);
                break;
            case 2:
                double realNum = Double.parseDouble(scan.nextLine());
                System.out.println(realNum);
                break;
            case 3:
                String text = scan.nextLine();
                System.out.println(text);
                break;

        }
    }
}
