package class23;

public class FinalKeyword {

    double gravity=9.81;
    final double PI=3.14;
    final double LightSpeed=299792456;

    void tryChangingGravity(){
        gravity=1.6;
    }

}

class Child extends FinalKeyword{

    @Override
    void tryChangingGravity() {
        super.tryChangingGravity();

    }

}
