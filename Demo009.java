import java.util.Scanner;
public class Demo009 {
    String Cust_Name ="Samvedha";
    long Account_no = 1234567890;
    Double Balance = 50000.00;
    void accept_details(){
        System.out.println("Enter your Name, Account no");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Cust_Name = sc.nextLine();
        Account_no = sc.nextLong();
    }
    void Display_details(){
        System.out.println("Hello "+Cust_Name);
        System.out.println("ur balance is "+Balance);

    }
    public static void main(String[] args) {
        Demo009 obj = new Demo009();
        obj.accept_details();
        obj.Display_details();
        
    }

    
}