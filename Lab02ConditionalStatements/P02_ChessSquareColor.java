package Lab02ConditionalStatements;

import java.util.Scanner;

public class P02_ChessSquareColor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char label = scan.nextLine().charAt(0);
        int rank = Integer.parseInt(scan.nextLine());

        if ((label == 'a' || label == 'c' || label == 'e' || label == 'g') && rank % 2 != 0) {
            System.out.println("dark");
        } else if ((label == 'b' || label == 'd' || label == 'f' || label == 'h') && rank % 2 == 0) {
            System.out.println("dark");
        } else {
            System.out.println("light");
        }
    }
}
