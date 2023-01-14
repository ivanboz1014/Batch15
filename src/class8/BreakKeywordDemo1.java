package class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=75;

        while(summer){
            if(temp<=100){
                System.out.println("I love summer");
            }else{
                System.out.println("Its very hot");
                break;
            }
            temp+=5;
        }
        System.out.println("*******************************");



        boolean summer1=true;
        int temp1=75;
        while (summer1){
        if(temp1<=100){
            System.out.println("I love summer");
        }else{
            System.out.println("Its very hot");
            summer1=false;
        }temp1+=5;



    }
}}
