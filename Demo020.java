import java.util.Scanner;

public class Demo020 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Check for valid input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Variables to store the first two terms
            int first = 0, second = 1;

            // Print the Fibonacci series
            System.out.println("Fibonacci series:");
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");

                // Calculate the next term
                int next = first + second;
                first = second;
                second = next;
            }
        }

        // Close the scanner
        scanner.close();
    }
}