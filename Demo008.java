import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String username,pass;
        do{
            System.out.println("Hello Mallareddy Unversity, Please Login: ");
            System.out.print("Enter username: ");
            username = sc.next();
            System.out.print("Enter password: ");
            pass = sc.next();
        }while((!username.equals("Samvedha"))||(!pass.equals("sam2004")));
        System.out.println("Successfully logged in.");
    }
}
