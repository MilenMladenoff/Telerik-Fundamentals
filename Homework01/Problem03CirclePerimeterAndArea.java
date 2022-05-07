package Homework01;

import java.util.Scanner;

public class Problem03CirclePerimeterAndArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = Double.parseDouble(scan.nextLine());

        double circlePerimeter = 2 * Math.PI * r;
        double circleArea = Math.PI * r * r;

        System.out.printf("%.2f%n", circlePerimeter);
        System.out.printf("%.2f", circleArea);
    }
}
