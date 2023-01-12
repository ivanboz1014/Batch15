package homework;

import java.util.Scanner;

public class CityTemperature {
    public static void main(String[] args) {

        Scanner Scan=new Scanner(System.in);

        System.out.println("Please enter the city");
        String city=Scan.nextLine();
        System.out.println("What is the temperature");
        int temp=Scan.nextInt();
        double tempC=(temp-32)*0.5556;
        int convertedC=(int)tempC;
        System.out.println("The temperature in "+city+ " is " +convertedC + "C");

    }
}
