package Lab04Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05IsAListSorted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            int[] line = Arrays.stream(scan.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
            boolean isSorted = true;

            for (int j = 1; j < line.length; j++) {

                if (line[j] < line[j - 1]) {
                    isSorted = false;
                    break;
                }
            }

            if (isSorted) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
