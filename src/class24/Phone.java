package class24;

 public abstract class Phone {

     abstract void displayPictures();

     abstract void unlockPhone();
     abstract void SendText();





}
class Iphone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Iphone display");
    }

    @Override
    void unlockPhone() {
        System.out.println("Iphone unlocks");

    }

    @Override
    void SendText() {
        System.out.println("Iphone sending texts");

    }
}
class Samsung extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Samsung display");
    }

    @Override
    void unlockPhone() {
        System.out.println("Samsung unlocks");

    }

    @Override
    void SendText() {
        System.out.println("Samsung texts");

    }
}
