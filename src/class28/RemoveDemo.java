package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

        var name="sdfgfds";
        var c='s';
        var f=12.5;


        words.removeIf(s -> s.endsWith("a"));
        System.out.println(words);
    }
}
