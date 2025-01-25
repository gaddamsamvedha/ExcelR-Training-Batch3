public class Demo020 {
    public static String getFizzBizz(int number) {
        
        if (number <= 0) {
            return "Error";
        }
        
        if (number % 3 == 0 && number % 5 == 0) {
            return "FIZZBIZZ";
        }
       
        if (number % 3 == 0) {
            return "FIZZ";
        }
      
        if (number % 5 == 0) {
            return "BIZZ";
        }
       
        return Integer.toString(number);
    }

    public static void main(String[] args) {
     
        System.out.println(getFizzBizz(33));  
        System.out.println(getFizzBizz(5));   
        System.out.println(getFizzBizz(15));  
        System.out.println(getFizzBizz(7));   
        System.out.println(getFizzBizz(-3));  
    }
}
