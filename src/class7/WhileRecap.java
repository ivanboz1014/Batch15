package class7;

public class WhileRecap {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        int number=10;
        while(number<20){
            System.out.println(number<20);
            System.out.println(number);
            number++;

        }

        int number1=10;
        while (number1<20){
            System.out.println(number1<20);
            if(number1<15){
                System.out.println("number is still less than 15");
            }else {
                System.out.println("Number is greater than 15 now");
            }
            System.out.println(number1);
            number1++;

        }
    }
}
