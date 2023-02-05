package class20;

public class SportTest {
    public static void main(String[] args) {

        Cricket cricket=new Cricket("Cricket", "Pakistan", "green helmet");
        cricket.display();

        Soccer soccer=new Soccer("Soccer", "Argentina","Messi",11);
soccer.display();
soccer.display1();

}}

class Soccer extends Sport{

    String team;
    int numberOfPlayers;


    Soccer (String name, String country, String team, int numberOfPlayers){
        super(name, country);
        this.team=team;
        this.numberOfPlayers=numberOfPlayers;


    }
    void display1(){
        System.out.println(name+" is played in "+country+" name of team is "+team+" number of players is "+numberOfPlayers);
    }


}
