package MockExam04;

import java.util.Arrays;
import java.util.Scanner;

public class P2_GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scan.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scan.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        StringBuilder output = new StringBuilder();

        for (int value : firstArr) {

            for (int i = 0; i < secondArr.length; i++) {

                if (secondArr[i] == value) {

                    if (i == secondArr.length - 1) {
                        output.append("-1,");
                        break;
                    } else {
                        boolean isGreater = false;

                        for (int j = i; j < secondArr.length; j++) {

                            if (value < secondArr[j]) {
                                output.append(secondArr[j]).append(",");
                                isGreater = true;
                                break;
                            }
                        }

                        if (!isGreater) {
                            output.append("-1,");
                            break;
                        }
                    }
                }
            }
        }

        if (output.length() > 0 && output.charAt(output.length() - 1) == ',') {
            output.deleteCharAt(output.length() - 1);
        }

        System.out.println(output);
    }
}
