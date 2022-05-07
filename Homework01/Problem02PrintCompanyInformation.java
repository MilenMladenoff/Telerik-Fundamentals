package Homework01;

import java.util.Scanner;

public class Problem02PrintCompanyInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String companyName = scan.nextLine();
        String companyAddress = scan.nextLine();
        String companyPhone = scan.nextLine();
        String fax = scan.nextLine();
        String website = scan.nextLine();
        String managerFirstName = scan.nextLine();
        String managerLastName = scan.nextLine();
        int managerAge = Integer.parseInt(scan.nextLine());
        String managerPhone = scan.nextLine();

        System.out.println(companyName);
        System.out.printf("Address: %s%n", companyAddress);
        System.out.printf("Tel. %s%n", companyPhone);

//      I apologize for the next lines. I know we haven't talked about Conditional Statements, but I don't know how else.
        if (fax.isEmpty()) {
            System.out.println("Fax: (no fax)");
        } else {
            System.out.printf("Fax: %s%n", fax);
        }

        System.out.printf("Web site: %s%n", website);
        System.out.printf("Manager: %s %s (age: %d, tel. %s)",
                managerFirstName, managerLastName, managerAge, managerPhone);
    }
}
