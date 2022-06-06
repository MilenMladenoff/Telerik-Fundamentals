package MockExam02;

import java.util.Scanner;

public class P2MergingAndSquashing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] input = new int[n];
        String[] merged = new String[n - 1];
        String[] squashed = new String[n - 1];

        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(scan.nextLine());
        }

        for (int i = 0; i < merged.length; i++) {
            merged[i] = String.valueOf(input[i] % 10) + (input[i + 1] / 10);
            squashed[i] = String.valueOf(input[i] / 10) + (input[i] % 10 + input[i + 1] / 10) % 10 + input[i + 1] % 10;
        }

        System.out.println(String.join(" ", merged));
        System.out.println(String.join(" ", squashed));
    }
}
