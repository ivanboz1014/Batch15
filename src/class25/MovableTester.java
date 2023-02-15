package class25;

public class MovableTester {
    public static void main(String[] args) {

        Washable[] washables={new SmartWatch(),new Inverter()};

        for(Washable w:washables){
            w.wash();
        }


    }
}
