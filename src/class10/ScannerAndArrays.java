package class10;
import java.util.Scanner;
import java.util.Arrays;
public class ScannerAndArrays {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter five numbers");


        int[]numbers=new int[5];

        /*numbers[0]=scanner.nextInt();
        numbers[1]=scanner.nextInt();
        numbers[2]=scanner.nextInt();
        numbers[3]=scanner.nextInt();
        numbers[4]=scanner.nextInt();*/

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]=scanner.nextInt();

        }

        System.out.println(Arrays.toString(numbers));

    }
}
