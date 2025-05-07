package problem4;

import java.util.*;

public class MedianFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the elements of array in sorted order");
            int n = scanner.nextInt();

            // check for empty array
            if (n == 0) {
                System.out.println("MEDIAN :-1.0");
                return;
            }
            double[] numbers = new double[n];

            // ASk user to enter sorted array
            System.out.println("Enter the sorted array elements(one by one ):");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextDouble();
            }
            double median;

            if (n % 2 == 1) {
                // odd no of elements
                median = numbers[n / 2];
            } else {
                // Even number of elements
                median = (numbers[(n / 2) - 1] + numbers[n / 2]) / 2.0;
            }
            System.out.println("Median:" + median);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter only decimal numbers.");
        } finally {
            scanner.close();
        }
    }
}
