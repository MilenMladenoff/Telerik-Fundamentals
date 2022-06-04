package Lab04Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P10ArraySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        StringBuilder notAppear = new StringBuilder();

        for (int i = 1; i <= numbers.length; i++) {
            boolean numberAppear = false;

            for (int j = 0; j < numbers.length; j++) {

                if (i == numbers[j]) {
                    numberAppear = true;
                    break;
                }
            }

            if (!numberAppear) {
                notAppear.append(i).append(',');
            }
        }

        if (notAppear.length() > 0 && notAppear.charAt(notAppear.length() - 1) == ',') {
            notAppear.deleteCharAt(notAppear.length() - 1);
        }

        System.out.println(notAppear);
    }
}
