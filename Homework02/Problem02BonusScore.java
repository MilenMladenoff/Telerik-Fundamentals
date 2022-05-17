package Homework02;

import java.util.Scanner;

public class Problem02BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = Integer.parseInt(scan.nextLine());

        if (score >= 1 && 3 >= score) {
            score *= 10;
        } else if (score >= 4 && 6 >= score) {
            score *= 100;
        } else if (score >= 7 && 9 >= score) {
            score *= 1000;
        } else {
            System.out.println("invalid score");
            return;
        }

        System.out.println(score);
    }
}
