package class24;

public class Animal {

    public void speak(){
        System.out.println("Animal speaks");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}

class cat extends Animal{
    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Eats milk");
    }
}

class dog extends Animal{
    @Override
    public void speak() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Eats meat");
    }
}

class horse extends Animal{
    @Override
    public void speak() {
        System.out.println("Pffff");
    }

    @Override
    public void eat() {
        System.out.println("Eats sugar");
    }
}