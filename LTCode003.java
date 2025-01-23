public class LTCode003 {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int i = 0;
        int n = s.length();
        
        
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;  
        if (i < n && s.charAt(i) == '-') {
            sign = -1;  
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++; 
        }

        int result = 0;
        
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }
        
        return result * sign;
    }

    public static void main(String[] args) {
        LTCode003 solution = new LTCode003();

        System.out.println(solution.myAtoi("42"));          
        System.out.println(solution.myAtoi("   -42"));     
        System.out.println(solution.myAtoi("4193 with words")); 
        System.out.println(solution.myAtoi("words and 987")); 
        System.out.println(solution.myAtoi("-91283472332")); 
        System.out.println(solution.myAtoi("91283472332"));  
        System.out.println(solution.myAtoi("  +0012a42"));   
    }
}
