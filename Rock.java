// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay="";  //Computer's play -- "R", "P", or "S"
        String winner = "";
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter move (R,P,S): "); //Get player's play -- note that this is stored as a string
        personPlay = scan.next();
        personPlay=personPlay.toUpperCase(); //Make player's play uppercase for ease of comparison
         //Generate computer's play (0,1,2)
        computerInt=generator.nextInt(3);
         //Translate computer's randomly generated play to string
        if(computerInt==0){
            computerPlay="R";
        }
        else if(computerInt==1){
            computerPlay="P";
        }
        else if(computerInt==2){
            computerPlay="S";
        }
        System.out.println("Computer's move: " + computerPlay);//Print computer's play
        //See who won.
        if(personPlay.equals(computerPlay)){
            winner="tie";
        }
        else if(personPlay.equals("R")&&computerPlay.equals("S")){
            winner="Player";
        }
        else if(personPlay.equals("R")&&computerPlay.equals("P")){
            winner="Computer";
        }
        else if(personPlay.equals("P")&&computerPlay.equals("R")){
            winner="Player";
        }
        else if(personPlay.equals("P")&&computerPlay.equals("S")){
            winner="Computer";
        }
        else if(personPlay.equals("S")&&computerPlay.equals("P")){
            winner="Player";
        }
        else if(personPlay.equals("S")&&computerPlay.equals("R")){
            winner="Computer";
        }
        System.out.println("Winner: " + winner);
    }
}