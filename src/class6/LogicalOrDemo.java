package class6;
import java.util.Scanner;
public class LogicalOrDemo {
    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a day");
        String day=scan.next();

        if(day.equals("Monday")||day.equals("Friday")){
            System.out.println("No class today");

        } else if (day.equals("Saturday")||day.equals("Sunday")) {
            System.out.println("Java class Enjoy");

        }else if(day.equals("Wednesday")||day.equals("Tuesday")){
            System.out.println("Manual testing class");
        }else if(day.equals("Thursday")){
            System.out.println("Review class");
        }else{
            System.out.println("Wrong day entered");
        }

    }
}
