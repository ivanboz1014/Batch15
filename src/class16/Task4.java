package class16;

public class Task4 {

    String sayHello(String countryName) {

        switch (countryName) {

            case "USA":
                return "Hello";

            case "Kazahstan":
                return "Salem";
            case "Italy":
                return "Ciao";
            case "China":
                return "Ni hao";
            default:
                return "Country not supported";


        }


    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        System.out.println(task4.sayHello("Italy"));
    }


}
