/**
 *This is a rock-paper-scissor game with our beloved Professor Hickey
 * You have to win at least 3 times in 10 rounds to win the game
 */

import java.util.Random;
import java.util.Scanner;


public class Duel {
  public static void main(String [] args){

    System.out.println("Professor Hickey challenge you to a Rock-Papper-Sissor duel...\n");
    System.out.println("You have to win at least 3 times to win the battle...\n");

    int userRound=0; //to track how many rounds the user won
    int hickeyRound=0; //to track how many rounds Professor Hickey won
    int round=0; //to track how many rounds in total

    while (round<10){

      System.out.println("Please choose one of the three objects against Professor Hickey...\n");
      System.out.println("(1 = Scissor; 2 = Rock; 3 = Paper)\n"); //explain to user 1 is scissor 2 is rock and 3 is paper

      Scanner input=new Scanner(System.in); //to make it more general i used scanner instead of TextIO
      int userObject=input.nextInt(); //get the input form user

      Random rand = new Random();
      int hickeyObject= rand.nextInt(3) + 1; //to generte a random number

      String Object1 = "";
      String Object2 = "";

      switch(userObject){
        case 1: Object1="Scissor"; break;
        case 2: Object1="Rock"; break;
        case 3: Object1="Paper"; break;
      }

      switch(hickeyObject){
        case 1: Object2="Scissor"; break;
        case 2: Object2="Rock"; break;
        case 3: Object2="Paper"; break;
      }


      System.out.println("You played "+ "|| " + Object1 + " ||"); // to let the user be aware of what object they chose to use
      System.out.println("Professor Hickey palyed "+ "|| " + Object2 + " ||");// to let the user see what object Professor Hickey used


      if(userObject<1 || userObject>3){
        System.out.println("This is not a valid number."); //if user puts an invalid number, it is not counted into round number
      }

      else if (userObject==hickeyObject){ //tie condition
        System.out.println("It is a tie!");
        round++;
        printRoundMethod(userRound,hickeyRound);
      }

      else if(userObject==1&&hickeyObject==2 || userObject==2&&hickeyObject==3 || userObject==3&&hickeyObject==1){ //Professor Hickey wins condition
        System.out.println("Professor Hickey wins!");
        round++;
        hickeyRound++;
        printRoundMethod(userRound,hickeyRound);
      }

      else{ //user wins conditino
        System.out.println("Professor Hickey loses!");
        round++;
        userRound++;
        printRoundMethod(userRound,hickeyRound);
      }

    }

    if (userRound>=3){ //for user to see the final result
      System.out.println("    db    db  .d88b.  db    db      db   d8b   db d888888b d8b   db      ");
      System.out.println("    `8b  d8' .8P  Y8. 88    88      88   I8I   88   `88'   888o  88      ");
      System.out.println("     `8bd8'  88    88 88    88      88   I8I   88    88    88V8o 88      ");
      System.out.println("       88    88    88 88    88      Y8   I8I   88    88    88 V8o88      ");
      System.out.println("       88    `8b  d8' 88b  d88      `8b d8'8b d8'   .88.   88  V888      ");
      System.out.println("       YP     `Y88P'  ~Y8888P'       `8b8' `8d8'  Y888888P VP   V8P      ");
    }
    else{
      System.out.println("     db    db  .d88b.  db    db      db       .d88b.  .d8888. d88888b    ");
      System.out.println("     `8b  d8' .8P  Y8. 88    88      88      .8P  Y8. 88'  YP 88'        ");
      System.out.println("      `8bd8'  88    88 88    88      88      88    88 `8bo.   88ooooo    ");
      System.out.println("        88    88    88 88    88      88      88    88   `Y8b. 88~~~~~    ");
      System.out.println("        88    `8b  d8' 88b  d88      88booo. `8b  d8' db   8D 88.        ");
      System.out.println("        YP     `Y88P'  ~Y8888P'      Y88888P  `Y88P'  `8888Y' Y88888P    ");
    }
  }

//This method prints out how many rounds user has won and Professor Hickey has won so far
  public static void printRoundMethod(int userRound,int hickeyRound){
    System.out.println("You have won: " + userRound);
    System.out.println("Professor Hickey have won: " + hickeyRound);
  }

}
