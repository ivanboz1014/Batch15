package class29;

import java.util.ArrayList;
import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        HashSet<String> set=new HashSet<>(aList);

        aList.clear();

        aList.addAll(set);


        System.out.println(aList);
    }
}
