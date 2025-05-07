package problem3;

import java.util.*;

public class FindLargerNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Asking the user for the first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Asking the user for the second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Here, we check which number is larger and store it in 'largerNumber'
            double largerNumber = (num1 > num2) ? num1 : num2;

            // printing the larger number
            System.out.println("The larger number is: " + largerNumber);

        } catch (Exception e) {
            // If the user enters something that’s not a number, this will catch it
            System.out.println("Oops! Please enter valid numbers.");
        } finally {
            // Always good practice to close the scanner when we’re done
            scanner.close();
        }
    }
}