public class Demo070 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 10, 13, 17, 18, 19};
        System.out.println("Prime numbers in the array are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
