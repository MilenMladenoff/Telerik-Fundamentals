package Lab04Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P11ConvertDegrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] celsius = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < celsius.length; i++) {
            double fahrenheit = celsius[i] * 1.8 + 32;
            System.out.printf("%.0f%n", fahrenheit);
        }
    }
}
