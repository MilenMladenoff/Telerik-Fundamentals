package MockExam05;

import java.util.Scanner;

public class P2_ChickenLatin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split(" ");

        for (String word : words) {
            StringBuilder wordToSB = new StringBuilder();
            wordToSB.append(word);

            if (word.toLowerCase().charAt(0) == 'a' || word.toLowerCase().charAt(0) == 'e'
                    || word.toLowerCase().charAt(0) == 'i' || word.toLowerCase().charAt(0) == 'o' ||
                    word.toLowerCase().charAt(0) == 'u') {

                wordToSB.replace(0, 1, "");
                wordToSB.append(word.charAt(0));
            }

            wordToSB.append("che");

            if (word.length() % 2 == 0) {
                wordToSB.append("e");
            }

            System.out.print(wordToSB + " ");
        }
    }
}
