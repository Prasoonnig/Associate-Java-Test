package problem1;


public class DigitCounter {

    /**
     * Returns the number of digits in an integer, ignoring the sign.
     *
     * @param number The integer input.
     * @return The count of digits.
     */
    public static int countDigits(int number) {
        // Convert negative number to positive
        number = Math.abs(number);

        // Handle special case for 0
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // Example test cases
        int[] testNumbers = { 34, -7291, 0, 5, -1, 123456 };

        for (int num : testNumbers) {
            System.out.println("Input: " + num + " -> Output: " + countDigits(num));
        }
    }
}