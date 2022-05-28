package Lab02ConditionalStatements;

import java.util.Scanner;

public class P10_ChineseZodiac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = Integer.parseInt(scan.nextLine());
        int diff = Math.abs(2000 - year);

        if (diff % 12 == 0) {
            System.out.println("Dragon");
        } else if (diff % 12 == 11) {
            System.out.println("Snake");
        } else if (diff % 12 == 10) {
            System.out.println("Horse");
        } else if (diff % 12 == 9) {
            System.out.println("Sheep");
        } else if (diff % 12 == 8) {
            System.out.println("Monkey");
        } else if (diff % 12 == 7) {
            System.out.println("Rooster");
        } else if (diff % 12 == 6) {
            System.out.println("Dog");
        } else if (diff % 12 == 5) {
            System.out.println("Pig");
        } else if (diff % 12 == 4) {
            System.out.println("Rat");
        } else if (diff % 12 == 3) {
            System.out.println("Ox");
        } else if (diff % 12 == 2) {
            System.out.println("Tiger");
        } else if (diff % 12 == 1) {
            System.out.println("Hare");
        }
        
    }
}
