import java.util.Scanner;

public class Demo019a {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble(); 
        
        double roundedNumber = Math.round(number / 5.0) * 5;
        
        System.out.println("Rounded to the nearest multiple of 5: " + roundedNumber);
        
        scanner.close();
    }
}
