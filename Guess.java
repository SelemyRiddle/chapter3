// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess=0;           //Number the user tries to guess
          int guess;                //The user's guess
          int mysteryNum;
          int highGuess=0;
          int lowGuess=0;
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          //randomly generate the  number to guess
          
          mysteryNum= generator.nextInt(10)+1;
          //print message asking user to enter a guess
          System.out.print ("Enter a guess: ");
          guess = scan.nextInt();
          //read in guess
          System.out.println(guess);  
          while (mysteryNum != guess)  //keep going as long as the guess is wrong
            {
                  if (mysteryNum<guess){
                      System.out.println("Too high. Guess again: ");
                      guess = scan.nextInt();
                      highGuess+=1;
                    }//print message saying guess is wrong
                  if (mysteryNum>guess){
                      System.out.println("Too low. Guess again: ");
                      guess = scan.nextInt();
                      lowGuess+=1;
                    }//get another guess from the user
                  numToGuess+=1;
          }
          System.out.println("Correct! The Mystery Number was "+mysteryNum);
          System.out.println("You guessed "+numToGuess+" times");
          System.out.println(highGuess+" time(s) you guessed too high");
          System.out.println(lowGuess+" time(s) you guesses too low");
          //print message saying guess is right
        }
}