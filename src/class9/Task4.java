package class9;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        double total=0;


        for (int i = 0; i <3 ; i++) {
            System.out.println("Please enter the item");
            String itemName= scanner.next();
            System.out.println("Please enter the price");
            double itemPrice= scanner.nextDouble();
            total=total+itemPrice;
            System.out.println("This is the total amount that you have to pay "+total);


        }
        System.out.println("Please pay for the items");
        double amountPaid= scanner.nextDouble();

        if(amountPaid>total){
            double change=amountPaid-total;
            System.out.println("Hey here is your change "+change);
        }else if(amountPaid<total){
            System.out.println("You can buy all the items");

        }
        System.out.println("Thank you for shopping");









    }
}
