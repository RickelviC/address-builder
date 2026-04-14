package com.pluralsight;

import java.util.Scanner;

public class builder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder address = new StringBuilder();

        System.out.println("Please provide the following information: ");

        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();

        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        StringBuilder fullInfo = address.append(fullName).append("\n").append("\n")
                .append("Billing Address:\n");

        address.append(billingStreet).append("\n").append(billingCity).append(", ")
                .append(billingState).append(" ").append(billingZip).append("\n").append("\n");

        address.append("Shipping Address:\n").append(shippingStreet).append("\n").append(shippingCity).append(", ")
                .append(shippingState).append(" ").append(shippingZip);



        System.out.println(fullInfo);

    }
}
