package class12;
import java.util.Scanner;
public class TaskString1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter username");
        String username=scanner.next();
        System.out.println("Please enter your password");
        String password=scanner.next();
        System.out.println("Please enter your password again");
        String confirmPassword=scanner.next();

        if(username.isEmpty() || password.isEmpty()) {
            System.out.println("Username and password cannot be empty");
        } else if (password.length()<8) {
            System.out.println("Password is too short");

        } else if (password.contains(username)) {
            System.out.println("Password cannot contain username");

        } else if (!password.equalsIgnoreCase(confirmPassword)) {
            System.out.println("Password do not match");

        }else{
            System.out.println("Your username and password has been created");
        }


    }}
