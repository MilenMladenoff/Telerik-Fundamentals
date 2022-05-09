package Lab01;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a % b);
        System.out.printf("%.0f", Math.pow(a, b));
    }
}
