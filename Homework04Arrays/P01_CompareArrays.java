package Homework04Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P01_CompareArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr1 = new int[3];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(scan.nextLine());
        }

        int[] arr2 = new int[3];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(scan.nextLine());
        }

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
