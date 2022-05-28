package Lab02ConditionalStatements;

import java.util.Scanner;

public class P05_PhoneBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int textMessages = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int additionalMessages = 0;
        double paidMessages = 0.0;
        int additionalMinutes = 0;
        double paidMinutes = 0.0;
        double taxes = 0.0;
        double totalBill = 12;

        if (textMessages > 20) {
            additionalMessages = textMessages - 20;
            paidMessages = additionalMessages * 0.06;
        }

        if (minutes > 60) {
            additionalMinutes = minutes - 60;
            paidMinutes = additionalMinutes * 0.1;
        }

        if (paidMessages > 0 || paidMinutes > 0) {
            taxes = (paidMessages + paidMinutes) * 0.2;
        }

        totalBill += paidMessages + paidMinutes + taxes;

        System.out.printf("%d additional messages for %.2f levas%n", additionalMessages, paidMessages);
        System.out.printf("%d additional minutes for %.2f levas%n", additionalMinutes, paidMinutes);
        System.out.printf("%.2f additional taxes%n", taxes);
        System.out.printf("%.2f total bill%n", totalBill);
    }
}
