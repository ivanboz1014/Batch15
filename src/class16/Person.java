package class16;

public class Person {

    private double bankBalance=125000;


    String Address="Street 123";

    public String name="Jon Snow";

    private void printPhonePassword(){
        System.out.println("123");
    }


    void printSSN(){
        System.out.println("1234565");
    }

    public void printTokTokAccount(){
        System.out.println("asd");
    }

    public static void main(String[] args) {

        Person person=new Person();

        System.out.println(person.bankBalance);;
        System.out.println(person.Address);
        System.out.println(person.name);
        person.printPhonePassword();
        person.printSSN();
        person.printTokTokAccount();
    }



}
