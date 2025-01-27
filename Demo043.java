import java.util.Scanner;

public class Demo043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter an uppercase character: ");
        char ch = scanner.next().charAt(0);
        
        // Convert to lowercase
        char lowercaseChar = Character.toLowerCase(ch);
        
        System.out.println("The lowercase character is: " + lowercaseChar);
        
        scanner.close();
    }
}