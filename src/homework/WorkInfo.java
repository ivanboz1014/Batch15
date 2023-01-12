package homework;

import java.util.Scanner;

public class WorkInfo {
    public static void main(String[] args) {

        Scanner Scan=new Scanner(System.in);

        System.out.println("Enter numbers of years worked?");
        int years=Scan.nextInt();
        System.out.println("Enter your salary");
        int salary=Scan.nextInt();
        if (years >= 5) {
            System.out.println("you are eligible for the bonus");
        }else{
            System.out.println("You are not eligible for the bonus");
        }if(salary>5000){
            System.out.println("Your bonus is 5000");
        }else{
            System.out.println("Your bonus is 3000");
        }
    }
}
