package Lab04Arrays;

import java.util.Scanner;

public class P06RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] elements = scan.nextLine().split(",");
        StringBuilder noDuplicates = new StringBuilder();

        for (int i = 0; i < elements.length; i++) {
            String currentElement = elements[i];

            if (!noDuplicates.toString().contains(currentElement)) {
                noDuplicates.append(currentElement).append(',');
            }
        }

        if (noDuplicates.charAt(noDuplicates.length() - 1) == ',') {
            noDuplicates.deleteCharAt(noDuplicates.length() - 1);
        }

        System.out.println(noDuplicates);
    }
}
