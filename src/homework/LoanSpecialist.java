package homework;

import java.util.Scanner;

public class LoanSpecialist {
    public static void main(String[] args) {

        Scanner Scan=new Scanner(System.in);

        System.out.println("What is the amount of loan needed?");
        int need=Scan.nextInt();
    if(need<=200000){
        System.out.println("I will approve your loan");
    }else{
        System.out.println("I will not approve your loan");
    }}}






