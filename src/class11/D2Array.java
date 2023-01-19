package class11;
import java.util.Arrays;
public class D2Array {
    public static void main(String[] args) {

        int[][] matrix={{10,20,30},
                        {45,55,66},
                       {30,40,20,10,25}};

        for (int i = 0; i < matrix[2].length ; i++) {
            System.out.print(matrix[2][i]);


        }




        for (int i = 0; i <matrix[0].length ; i++) {
            System.out.println(matrix[0][i]);


        }
        int[]arr=matrix[0];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }

    }}

