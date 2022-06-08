package MockExam04;

import java.util.Scanner;

public class P1_MilitaryTanks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String moves = scan.nextLine();
        int xPosition = 0;
        int yPosition = 0;

        for (int i = 0; i < moves.length(); i++) {
            char direction = moves.charAt(i);

            switch (direction) {
                case 'L':
                    xPosition--;
                    break;
                case 'R':
                    xPosition++;
                    break;
                case 'U':
                    yPosition++;
                    break;
                case 'D':
                    yPosition--;
                    break;
            }
        }

        System.out.printf("(%d, %d)", xPosition, yPosition);
    }
}
