package class33;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        System.out.println("Line1");
        System.out.println("Line2");
        System.out.println("Line3");
        System.out.println("Line4");
        System.out.println("Line5");
        try{
            String name=null;
            System.out.println(name.length());
        }catch (NullPointerException npe){
            System.out.println("We are trying to access a method on a null object");


        }catch (Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println("Line6");
        System.out.println("Line7");
        System.out.println("Line8");
        System.out.println("Line9");
    }
}
