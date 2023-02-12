package class24;

public abstract class AbstractAnimal {

    abstract void speak();

    }
    class Dog extends AbstractAnimal{
        @Override
        void speak() {
            System.out.println("Wuff");
        }
    }

    class  Cat extends AbstractAnimal{
        @Override
        void speak() {
            System.out.println("Meow");
        }
    }
