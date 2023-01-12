package homework;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {

        Scanner Scan=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        boolean card= Scan.nextBoolean();
        if(!card){
            System.out.println("Would you like a credit card?");

        } else {
            System.out.println("What is the balance on your card?");
            int balance=Scan.nextInt();
            if(balance>1000){
                System.out.println("Pay off immediately");
            }else{
                System.out.println("You can spend more");
            }
        }
    }
}
