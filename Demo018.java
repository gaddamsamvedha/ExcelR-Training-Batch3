import java.util.Scanner;

public class Demo018 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the number of minutes
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        // Constants
        int minutesInDay = 24 * 60; // Minutes in a day
        int minutesInYear = 365 * minutesInDay; // Minutes in a year

        // Calculate years and days
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;

        // Display the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        
        // Close the scanner
        scanner.close();
    }
}