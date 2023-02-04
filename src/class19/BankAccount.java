package class19;

public class BankAccount {

    long accountNumber;
    double money;



    void deposit(){
        System.out.println("Deposit");
    }
}

    class Checking extends BankAccount{

    double interest;

    void transfer(){
        System.out.println("Transfer");
    }


        }
        class Savings extends BankAccount{

            double profit;
            void takeProfit(){
                System.out.println("Profit method from savings class");

    }



}
            class SuperSavings extends Savings{

    void superSaving(){
        System.out.println("Super saving method from super saving class");


    }


}
