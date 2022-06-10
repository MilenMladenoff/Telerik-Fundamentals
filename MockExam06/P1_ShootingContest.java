package MockExam06;

import java.util.Scanner;

public class P1_ShootingContest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long targets = Long.parseLong(scan.nextLine());
        long georgeSpeed = Long.parseLong(scan.nextLine());
        long georgeLatency = Long.parseLong(scan.nextLine());
        long peterSpeed = Long.parseLong(scan.nextLine());
        long peterLatency = Long.parseLong(scan.nextLine());

        long georgeResult = georgeLatency * 2 + targets * georgeSpeed;
        long peterResult = peterLatency * 2 + targets * peterSpeed;

        if (georgeResult < peterResult) {
            System.out.println("George");
        } else if (georgeResult > peterResult) {
            System.out.println("Peter");
        } else {
            System.out.println("Draw");
        }
    }
}
