package class15;

import com.sun.jdi.Method;

public class MethodPracticeTester {
    public static void main(String[] args) {

       MethodsPractice mp=new MethodsPractice();
       boolean isEven= mp.isEven(15);
        System.out.println(isEven);

        boolean isEven2=mp.isEven(100);
        System.out.println(isEven);

        boolean isEven3=mp.isEven(12);
        System.out.println(isEven3);

        System.out.println(mp.isEven(20));



    }
}
