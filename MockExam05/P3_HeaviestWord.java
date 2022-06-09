package MockExam05;

import java.util.Scanner;

public class P3_HeaviestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int maxWeight = -1;
        String heaviestWord = "";

        for (int i = 1; i <= n; i++) {
            String word = scan.nextLine();
            String lowercaseWord = word.toLowerCase();
            int wordWeight = 0;

            for (int j = 0; j < word.length(); j++) {
                int digitWeight = lowercaseWord.charAt(j) - 96;
                wordWeight += digitWeight;
            }

            if (wordWeight > maxWeight) {
                maxWeight = wordWeight;
                heaviestWord = word;
            }
        }

        System.out.printf("%d %s", maxWeight, heaviestWord);
    }
}
