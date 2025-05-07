package problem7;

import java.util.*;

public class CompoundedRetailInflation {

    public static double calculateCompoundedInflation(double rate, int years) {
        // Convert rate from percentage to decimal (e.g., 10% becomes 0.10)
        // Then apply compound growth formula: (1 + rate/100)^years
        // This gives the factor by which prices grow after 'years' of compounding
        double factor = Math.pow(1 + rate / 100, years);

        // Subtract 1 from the factor to get only the "increase" part (excluding
        // original value)
        // Multiply by 100 to convert the result back to percentage
        // Example: (2.49 - 1) * 100 = 1.49 * 100 = 149% increase
        return (factor - 1) * 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input for rate of inflamation
        System.out.print("Enter the retail inflation rate (in %): ");
        double rate = sc.nextDouble();

        // taking input for number of years
        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();

        // calculating the value of inflamation with the help of
        // calculatecompundinflamation function
        double compoundedInflation = calculateCompoundedInflation(rate, years);

        System.out.printf("Compounded retail inflation after %d years is: %.2f%%%n", years, compoundedInflation);

        sc.close();
    }
}
