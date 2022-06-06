package MockExam03;

import java.util.Arrays;
import java.util.Scanner;

public class P3AloneNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] outputArr = new int[numbers.length];
        outputArr[0] = numbers[0];
        int target = Integer.parseInt(scan.nextLine());

        for (int i = 1; i < numbers.length - 1; i++) {

            if (numbers[i] != numbers[i - 1] && numbers[i] != numbers[i + 1] && numbers[i] == target) {
                outputArr[i] = Math.max(numbers[i - 1], numbers[i + 1]);
            } else {
                outputArr[i] = numbers[i];
            }
        }

        outputArr[numbers.length - 1] = numbers[numbers.length - 1];
        System.out.print("[");
        System.out.print(Arrays.toString(outputArr).replaceAll("[\\[\\]]", ""));
        System.out.print("]");
    }
}
