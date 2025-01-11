import java.util.Scanner;

public class Demo028 {

    // Recursive method to generate and print Fibonacci series
    public static void printFibonacci(int n) {
        if (n > 0) {
            printFibonacci(n - 1);  // Recursive call to print previous terms
            System.out.print(fibonacci(n - 1) + " ");  // Print the Fibonacci number at position n-1
        }
    }

    // Recursive method to find the Fibonacci number at a specific position
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base case: Fibonacci(0) = 0, Fibonacci(1) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of terms
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = scanner.nextInt();

        // Print Fibonacci series up to n terms
        System.out.println("Fibonacci Series:");
        printFibonacci(n);

        // Close the scanner
        scanner.close();
    }
}