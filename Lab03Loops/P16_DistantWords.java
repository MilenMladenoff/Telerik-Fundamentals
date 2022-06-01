package Lab03Loops;

import java.util.Scanner;

public class P16_DistantWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        double averageDistance = 0.0;

        for (int i = 1; i <= n; i++) {
            String word = scan.nextLine();
            System.out.print(word + " ");
            word = word.toLowerCase();
            int lettersSum = 0;

            for (int j = 0; j < word.length(); j++) {
                char letter = word.charAt(j);
                lettersSum += letter - 96;
            }

            int wordDistance = Math.abs(target - lettersSum);
            averageDistance += wordDistance;
            System.out.println(wordDistance);
        }

        System.out.printf("%.2f", averageDistance / n);
    }
}
