import java.util.Scanner;

public class Demo019 {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        
        // Round the number to the nearest multiple of 5
        double roundedNumber = Math.round(number / 5.0) * 5;
        
        // Print the result
        System.out.println("Rounded to the nearest multiple of 5: " + roundedNumber);
        
        // Close the scanner
        scanner.close();
    }
}
