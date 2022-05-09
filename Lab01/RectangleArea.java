package Lab01;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        int rectangleArea = width * height;
        System.out.println(rectangleArea);
    }
}
