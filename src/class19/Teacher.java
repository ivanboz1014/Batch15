package class19;

public class Teacher {

    String name;
    int teacherId;
    String subject;


    Teacher(String name, int teacherId){
        this.name=name;
        this.teacherId=teacherId;




    }
    void print(){
        System.out.println(name+" "+teacherId);
    }

    Teacher(String name, int teacherId, String subject){
        this(name, teacherId);
        this.subject=subject;


    }
    void print1(){
        System.out.println(name+" "+teacherId+" "+subject);

    }
}
