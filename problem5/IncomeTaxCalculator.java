package problem5;

import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user to enter their annual income
            System.out.print("Enter your annual income (in Rs.): ");
            double income = scanner.nextDouble();

            double tax = 0.0;

            if (income <= 250000) {
                tax = 0.0;
            } else if (income <= 500000) {
                // 10% of amount above 2.5L
                tax = (income - 250000) * 0.10;
            } else if (income <= 1000000) {
                // 10% of amount from 2.5L to 5L + 20% of amount above 5L
                tax = (250000 * 0.10) + ((income - 500000) * 0.20);
            } else {
                // 10% of 2.5L, 20% of 5L, 30% of amount above 10L
                tax = (250000 * 0.10) + (500000 * 0.20) + ((income - 1000000) * 0.30);
            }

            System.out.println("Your calculated income tax is: Rs. " + Math.round(tax));

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid numeric income.");
        } finally {
            scanner.close();
        }
    }

}