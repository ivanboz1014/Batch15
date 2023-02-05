package class20;

public class userClass {

    String name;
    int mobileNumber;

userClass(String name, int mobileNumber){
    this.mobileNumber=mobileNumber;
    this.name=name;
}
public  void display(){
    System.out.println("Name is "+name+" phone number is "+mobileNumber);

}
}
class userInfo extends userClass{
    String address;


    userInfo(String name, int mobilePhone,String address){
        super(name, mobilePhone);
        this.address=address;

    }
    public void display1(){
        System.out.println("Name is "+name+" phone number is "+mobileNumber+" address is "+address);

    }
}

class Test{
    public static void main(String[] args) {
        userClass userClass=new userClass("Proba",123455667);
        userClass.display();
        userInfo userInfo=new userInfo("Test", 543245, "12 iouhoiugrdb");
        userInfo.display();
        userInfo.display1();
    }
}
