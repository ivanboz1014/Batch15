package homework;

import java.util.Scanner;

public class Dmv {
    public static void main(String[] args) {

        Scanner Scan=new Scanner(System.in);
        System.out.println("What is your age?");
        int age=Scan.nextInt();
        if(age>18){
            System.out.println("I will issue a drivers licence to you");
        }else{
            System.out.println("You need learners permit ");
        }


    }
}
