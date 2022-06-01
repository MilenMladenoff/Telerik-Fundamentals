package Lab03Loops;

import java.util.Scanner;

public class P15_VowelToLengthRatio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double minVowelsToLettersRatio = 2;
        int maxVowels = 0;
        String bestFood = "";

        for (int i = 1; i <= n; i++) {
            String food = scan.nextLine();
            int vowelsCounter = 0;

            for (int j = 0; j < food.length(); j++) {
                char letter = food.charAt(j);

                if (letter == 'a' || letter == 'o' || letter == 'e' || letter == 'i' || letter == 'u') {
                    vowelsCounter++;
                }
            }

            double currentVowelsToLettersRatio = vowelsCounter * 1.0 / food.length();

            if (currentVowelsToLettersRatio <= minVowelsToLettersRatio) {

                if (vowelsCounter >= maxVowels) {

                    if (food.length() >= bestFood.length()) {

                        minVowelsToLettersRatio = currentVowelsToLettersRatio;
                        maxVowels = vowelsCounter;
                        bestFood = food;
                    }
                }
            }
        }

        System.out.printf("%s %d/%d", bestFood, maxVowels, bestFood.length());
    }
}
