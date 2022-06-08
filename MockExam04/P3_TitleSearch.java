package MockExam04;

import java.util.Scanner;

public class P3_TitleSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder title = new StringBuilder();
        title.append(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            String text = scan.nextLine();
            int replacedLettersCounter = 0;
            boolean isFound = false;
            int index = 0;

            for (int j = 0; j < text.length(); j++) {
                String textLetter = text.charAt(j) + "";

                for (; index < title.length(); index++) {
                    String titleLetter = title.charAt(index) + "";

                    if (textLetter.equals(titleLetter)) {
                        title.replace(index, index + 1, "");
                        replacedLettersCounter++;
                        isFound = true;
                        break;
                    } else {
                        isFound = false;
                    }

                }
            }

            if (replacedLettersCounter < text.length()) {
                isFound = false;
            }

            if (isFound) {
                System.out.println(title);
            } else {
                System.out.println("No such title found!");
            }
        }
    }
}
