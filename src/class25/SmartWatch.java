package class25;

interface Washable{
    void wash();

}

public class SmartWatch implements Washable {
    @Override
    public void wash() {
        System.out.println("You can wash this smart watch without any issues");
    }
}

class Phone implements Washable{
    @Override
    public void wash() {
        System.out.println("I am IP65 rated you can wash me");

    }
}
class Inverter implements Washable {
    @Override
    public void wash() {
        System.out.println("I am IP65 rated you can wash me");

    }
}

