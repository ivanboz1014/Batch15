package class25;

public interface Movable  {
    void move();

}
interface OwnAble{
    void own();


}

class Car implements Movable, OwnAble{
    @Override
    public void own() {
        System.out.println("I own a car");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");


    }
}

class Dog implements Movable, OwnAble{
    @Override
    public void own() {
        System.out.println("I own a dog");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving");


    }
}


