package Lab04Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArraySort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scan.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] resultArr = new int[inputArr.length];
        int indexCounter = 0;

        for (int i = 0; i < inputArr.length; i++) {

            if (inputArr[i] != 0) {
                resultArr[indexCounter] = inputArr[i];
                indexCounter++;
            }
        }

        for (int i = 0; i < resultArr.length; i++) {

            if (i == resultArr.length - 1) {
                System.out.println(resultArr[i]);
            } else {
                System.out.printf("%d,", resultArr[i]);
            }
        }
    }
}
