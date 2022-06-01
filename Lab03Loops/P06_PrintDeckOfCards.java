package Lab03Loops;

import java.util.Scanner;

public class P06_PrintDeckOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String signs = "234567890JQKA";
        String cardSign = scan.nextLine();

        if (cardSign.equals("10")) {
            cardSign = "0";
        }

        int endIndex = signs.indexOf(cardSign);

        for (int i = 0; i <= endIndex; i++) {

            for (int j = 1; j <= 4; j++) {
                char face = signs.charAt(i);

                if (face == '0') {
                    System.out.print("10 of ");
                } else {
                    System.out.printf("%c of ", face);
                }

                switch (j) {
                    case 1:
                        System.out.print("spades, ");
                        break;
                    case 2:
                        System.out.print("clubs, ");
                        break;
                    case 3:
                        System.out.print("hearts, ");
                        break;
                    case 4:
                        System.out.println("diamonds");
                        break;
                }
            }
        }
    }
}
