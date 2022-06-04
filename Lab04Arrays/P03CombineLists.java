package Lab04Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03CombineLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] line1 = Arrays.stream(scan.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] line2 = Arrays.stream(scan.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < line1.length; i++) {

            if (i == line1.length - 1) {
                System.out.print(line1[i] + ",");
                System.out.print(line2[i]);
            } else {
                System.out.print(line1[i] + ",");
                System.out.print(line2[i] + ",");
            }
        }
    }
}
