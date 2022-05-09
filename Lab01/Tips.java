package Lab01;

import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bill = Integer.parseInt(scan.nextLine());
        double totalSum = bill * 1.1;
        System.out.printf("%.0f", totalSum);
    }
}
