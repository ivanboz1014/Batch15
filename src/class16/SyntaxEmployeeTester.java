package class16;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {


        SyntaxEmployee syntaxEmployee = new SyntaxEmployee();
        syntaxEmployee.empID=123;
        syntaxEmployee.salary=100000;



        SyntaxEmployee syntaxEmployee2 = new SyntaxEmployee();
syntaxEmployee2.empID=234;
syntaxEmployee2.salary=120000;


        System.out.println(syntaxEmployee.empID);
        System.out.println(syntaxEmployee.salary);
        System.out.println(syntaxEmployee.CEO);

        System.out.println(syntaxEmployee2.empID);
        System.out.println(syntaxEmployee2.salary);
        System.out.println(syntaxEmployee2.CEO);




    }
}
