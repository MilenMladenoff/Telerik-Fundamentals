package Lab03Loops;

import java.util.Arrays;
import java.util.Scanner;

public class P11_FindLargestThreeValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scan.nextLine());
        }

        Arrays.sort(numbers);
        int[] largestThree = new int[3];
        int largestThreeIndex = 0;

        for (int i = numbers.length - 1; i > numbers.length - 4; i--) {
            largestThree[largestThreeIndex] = numbers[i];
            largestThreeIndex++;
        }

        System.out.printf("%d, %d and %d", largestThree[0], largestThree[1], largestThree[2]);
    }
}
