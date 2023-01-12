package class6;
import java.util.Scanner;
public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter country");

        String country= scan.next();

        switch (country.toLowerCase()){
            case "usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");
        }

    }
}
