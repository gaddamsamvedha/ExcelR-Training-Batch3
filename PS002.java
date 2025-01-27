import java.util.Scanner;

public class PS002 {

    public static int getNextMultipleOf100(int number) {
       
        if (number <= 0) {
            return -1;
        }
        return ((number / 100) + 1) * 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        int result = getNextMultipleOf100(input);
        System.out.println("Output: " + result);

        scanner.close();
    }
}
