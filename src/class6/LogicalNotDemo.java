package class6;

public class LogicalNotDemo {
    public static void main(String[] args) {

        System.out.println(false);
        System.out.println(!false);

        String password="hjgf";
        if(!password.equals("Pass123")){
            System.out.println("Wrong password");

        }

        boolean isRaining=true;
        if(!isRaining){
            System.out.println("lets go for a walk");

        }else{
            System.out.println("lets take an umbrela");
        }

    }
}
