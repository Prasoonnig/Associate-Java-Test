package problem8;

import java.util.*;

public class CalculatingTime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // asking for user for the input
        System.out.print("Enter the number of second : ");
        long second = sc.nextLong();

        // calculating days
        long days = second / (24 * 3600);// 1day=24*60*60 seconds
        long remsecond = second % (24 * 3600);

        // Calculate hours
        long hours = remsecond / 3600; // 1 hour = 3600 seconds
        remsecond %= 3600;

        // Calculate minutes
        long minutes = remsecond / 60; //
        long seconds = remsecond % 60;

        // Display the result
        System.out.printf("%d Day(s) %d Hour(s) %d Minute(s) %d Second(s)%n", days, hours, minutes, seconds);

        sc.close();
    }
}
