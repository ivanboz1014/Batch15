package class24;

public class PhoneTester {
    public static void main(String[] args) {

        Phone [] phoneTester = {new Iphone(), new Samsung()};

        for (Phone newName : phoneTester) {
            newName.displayPictures();
            newName.unlockPhone();
            newName.SendText();
            System.out.println();
        }
    }


    }
