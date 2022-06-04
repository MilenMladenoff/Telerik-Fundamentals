package Lab04Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04RotateList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(","))
                .map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            int firstElement = numbers.get(0);
            numbers.remove(0);
            numbers.add(firstElement);
        }

        for (int i = 0; i < numbers.size(); i++) {

            if (i == numbers.size() - 1) {
                System.out.println(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + ",");
            }
        }
    }
}
