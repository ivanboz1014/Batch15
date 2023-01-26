package class14;

public class Task2 {
    public static void main(String[] args) {

        String str="dfgGHJdfg123123$%^&";

        System.out.println(str.replace("[^A-Za-z0-9]","").length());

    }
}
