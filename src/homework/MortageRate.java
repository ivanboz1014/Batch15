package homework;

public class MortageRate {
    public static void main(String[] args) {

        double rate=3.0;
        int price=100000;

        if(rate>4.5){
            System.out.println("User will not buy a house");
        }else{
            System.out.println("User will consider buying a house");
        }
        if(price>200000){
            System.out.println("User will take a loan");
        }else{
            System.out.println("User will pay cash");
        }
    }
}
