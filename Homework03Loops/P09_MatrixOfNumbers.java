package Homework03Loops;

import java.util.Scanner;

public class P09_MatrixOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int rows = 1; rows <= n; rows++) {

            for (int columns = rows; columns < n + rows; columns++) {
                System.out.print(columns + " ");
            }

            System.out.println();
        }
    }
}
