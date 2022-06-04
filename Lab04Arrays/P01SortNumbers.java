package Lab04Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);

        for (int i = numbers.length - 1; i >= 0; i--) {

            if (i == 0) {
                System.out.println(numbers[0]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
    }
}
