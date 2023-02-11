package class23;

public class Student {
    public void learn(){
        System.out.println("Students are learning");
    }


}

class SyntaxStudent extends Student{
    @Override
    public void learn() {
        System.out.println("Syntax students are learning");
    }}




class CollegeStudent extends Student{
    @Override
    public void learn() {
        System.out.println("College students are learning");

    }

}

class SchoolStudent extends Student {


}