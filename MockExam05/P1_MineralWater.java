package MockExam05;

import java.util.Scanner;

public class P1_MineralWater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int smallBottles = Integer.parseInt(scan.nextLine());
        int bigBottles = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= bigBottles; i++) {

            if (capacity < 5) {
                break;
            }

            capacity -= 5;
        }

        if (capacity == 0) {
            System.out.println("0");
        } else {

            if (capacity <= smallBottles) {
                System.out.println(capacity);
            } else {
                System.out.println("-1");
            }
        }
    }
}
