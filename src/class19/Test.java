package class19;

public class Test {
    public static void main(String[] args) {

        BankAccount ba=new BankAccount();
        ba.accountNumber=34654623l;
        ba.money=1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);
        System.out.println("--------------------");

        Checking check=new Checking();
        check.accountNumber=2349;
        check.money=567;
        check.interest=0;
        check.deposit();
        check.transfer();

        Savings save=new Savings();
        save.accountNumber=3245634576l;
        save.money=23456;
        save.profit=100;
        save.takeProfit();

        SuperSavings ss=new SuperSavings();
        ss.superSaving();
    }
}
