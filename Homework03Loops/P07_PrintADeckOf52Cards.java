package Homework03Loops;

public class P07_PrintADeckOf52Cards {
    public static void main(String[] args) {
        String faces = "234567890JQKA";

        for (int i = 0; i < faces.length(); i++) {

            for (int j = 1; j <= 4; j++) {
                char face = faces.charAt(i);

                if (face == '0') {
                    System.out.print("10 of ");
                } else {
                    System.out.printf("%c of ", face);
                }

                if (i == faces.length() - 1 && j == 4) {
                    System.out.print("diamonds");
                    break;
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
                        System.out.print("diamonds, ");
                        break;
                }
            }
        }
    }
}
