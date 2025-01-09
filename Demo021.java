public class Demo021 {
    public static String getFizzBizz(int number) {
        // If the number is zero or negative, return "Error"
        if (number <= 0) {
            return "Error";
        }
        
        // If the number is a multiple of both 3 and 5, return "FIZZBIZZ"
        if (number % 3 == 0 && number % 5 == 0) {
            return "FIZZBIZZ";
        }
        
        // If the number is a multiple of 3, return "FIZZ"
        if (number % 3 == 0) {
            return "FIZZ";
        }
        
        // If the number is a multiple of 5, return "BIZZ"
        if (number % 5 == 0) {
            return "BIZZ";
        }
        
        // If the number is neither a multiple of 3 nor 5, return the number as a string
        return Integer.toString(number);
    }

    public static void main(String[] args) {
        // Test the method with various inputs
        System.out.println(getFizzBizz(33));  // Output: FIZZ
        System.out.println(getFizzBizz(5));   // Output: BIZZ
        System.out.println(getFizzBizz(15));  // Output: FIZZBIZZ
        System.out.println(getFizzBizz(7));   // Output: 7
        System.out.println(getFizzBizz(-3));  // Output: Error
    }
}
