package class20;

public class Teacher {
    String teacherName;
    String teacherId;

    public void homework() {
        System.out.println("Homeworks make students perfect!!!!");
    }

    public void grade() {
        System.out.println("Grade doesn't matter");
    }

    public void scholarship() {
        System.out.println("Good students from this class will get scholarship");
    }

    public void extraPoint() {
        System.out.println("All students attend the class will get extra point");
    }
}

class MathTeacher extends Teacher{
    String subject;
    String grade;

    void excellent(){
        System.out.println("This class is excellent");
    }
}

class ChemistryTeacher extends Teacher{
    String homework;
    String test;

    void science(){
        System.out.println("Chemistry class is fun");
    }
}

class Pianoteacher extends Teacher{
    String classic;
    String schedule;

    void happy(){
        System.out.println("This class make students happy");
    }}

class School{
    public static void main(String[] args) {




        Teacher tc=new Teacher();
        tc.teacherName="Babara";
        tc.teacherId="T121";

        System.out.println("This is principal "+tc.teacherName);
        tc.extraPoint();

        MathTeacher mt=new MathTeacher();
        mt.teacherName="Luna";
        mt.teacherId="M221";
        mt.subject="Math";
        System.out.println("Teacher "+mt.teacherName+" teach "+ mt.subject);
        mt.excellent(); //comes from child class
        mt.homework(); //comes from the parent
    }
}



