package problem2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GrossPriceCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        try {
            // Ask the user to enter Net Price
            System.out.println("Enter the price");
            double netPrice = scanner.nextDouble();

            // Ask the user to enter tax
            System.out.println("enter Tax rate (eg.0.12 for 12%):");
            double taxRate = scanner.nextDouble();

            // checking if the tax rate is not valid
            if (taxRate <= 0 || taxRate >= 1) {
                System.out.println("Invalid Input :please enter a valid input");
                return;
            }

            // CAlculate Gross Price---
            double grossPrice = netPrice * (1 + taxRate);  //formulae used


            // lets round it to two decimal places
            grossPrice = Math.round(grossPrice * 100.0) / 100.0;

            // print the result
            System.out.println("Gross Price (before tax): " + df.format(grossPrice));

            // LETS output the result
        } catch (

        Exception e) {
            System.out.println("Invalid input type valid input only.");
        } finally {
            scanner.close();
        }
    }
}
