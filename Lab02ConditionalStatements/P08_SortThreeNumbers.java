package Lab02ConditionalStatements;

import java.util.Scanner;

public class P08_SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        double num1 = Double.parseDouble(scan.nextLine());
//        double num2 = Double.parseDouble(scan.nextLine());
//        double num3 = Double.parseDouble(scan.nextLine());

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        if (num1 >= num2) {

            if (num1 >= num3) {
                System.out.print(num1 + " ");

                if (num2 >= num3) {
                    System.out.print(num2 + " ");
                    System.out.print(num3 + " ");
                } else {
                    System.out.print(num3 + " ");
                    System.out.print(num2 + " ");
                }

            } else {
                System.out.print(num3 + " ");
                System.out.print(num1 + " ");
                System.out.print(num2 + " ");
            }

        } else if (num2 >= num3) {

            if (num2 >= num1) {
                System.out.print(num2 + " ");

                if (num1 >= num3) {
                    System.out.print(num1 + " ");
                    System.out.print(num3 + " ");
                } else {
                    System.out.print(num3 + " ");
                    System.out.print(num1 + " ");
                }
            }

        } else if (num3 >= num1) {

            if (num3 >= num2) {
                System.out.print(num3 + " ");

                if (num1 >= num2) {
                    System.out.print(num1 + " ");
                    System.out.print(num2 + " ");
                } else {
                    System.out.print(num2 + " ");
                    System.out.print(num1 + " ");
                }
            }
        }
    }
}
