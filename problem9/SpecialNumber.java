package problem9;

import java.util.Scanner;

public class SpecialNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a two-digit number
        System.out.print("Please enter a two-digit number: ");
        int num = sc.nextInt();

        // Make sure the number is actually two digits
        if (num < 10 || num > 99) {
            System.out.println("Oops! That's not a two-digit number. Try again with a number from 10 to 99.");
        } else {
            // Split the number into tens and units place
            int tens = num / 10;
            int units = num % 10;

            // Apply the formula: digit1 + digit2 + (digit1 * digit2)
            int result = tens + units + (tens * units);

            // Check if the result equals the original number
            if (result == num) {
                System.out.println(num + " is a special number! ");
            } else {
                System.out.println(num + " is not a special number.");
            }
        }

        sc.close();
    }
}
