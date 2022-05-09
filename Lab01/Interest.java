package Lab01;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double deposit = Double.parseDouble(scan.nextLine());

        for (int i = 1; i <= 3; i++){
            deposit *= 1.05;
            System.out.printf("%.2f", deposit);
        }
    }
}
