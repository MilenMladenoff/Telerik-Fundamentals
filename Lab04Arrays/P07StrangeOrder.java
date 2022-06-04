package Lab04Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07StrangeOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        StringBuilder negative = new StringBuilder();
        StringBuilder zero = new StringBuilder();
        StringBuilder positive = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < 0) {
                negative.append(numbers[i]).append(',');
            } else if (numbers[i] == 0) {
                zero.append(numbers[i]).append(',');
            } else {
                positive.append(numbers[i]).append(',');
            }
        }

        StringBuilder merged = new StringBuilder();
        merged.append(negative).append(zero).append(positive);

        if (merged.charAt(merged.length() - 1) == ',') {
            merged.deleteCharAt(merged.length() - 1);
        }

        System.out.println(merged);
    }
}
