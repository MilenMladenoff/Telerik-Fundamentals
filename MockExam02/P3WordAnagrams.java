package MockExam02;

import java.util.Scanner;

public class P3WordAnagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            String currentWord = scan.nextLine();

            if (word.length() == currentWord.length()) {

                for (int j = 0; j < word.length(); j++) {
                    char symbol = word.charAt(j);
                    String letter = "" + symbol;

                    if (currentWord.contains(letter)) {
                        currentWord = currentWord.replace(letter, "");
                    }
                }

                if (currentWord.isEmpty()) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            } else {
                System.out.println("No");
            }
        }
    }
}
