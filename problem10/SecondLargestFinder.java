package problem10;

import java.util.Scanner;

public class SecondLargestFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Check if there exist atleast 2 numbers
        if (n < 2) {
            System.out.println("Please enter at least two numbers.");
            return;
        }

        int[] arr = new int[n];

        // Take array input from the user
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize largest and second largest at the starting only
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the array to find the largest and second largest
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest; // current largest becomes second largest
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num; // only update second largest if it's different
            }
        }

        // If second largest was never updated, it means all numbers are same
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all numbers may be equal).");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }

        sc.close();
    }

}
