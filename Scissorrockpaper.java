import java.util.Random;
import java.util.Scanner;


public class Scissorrockpaper {
  public static void main(String [] args){

    System.out.println("Professor Hickey challenge you to a Rock-Papper-Sissor duel...\n");
    System.out.println("You have to win at least 3 times to win the battle...\n");

    int wins=0;
    while (wins<3){

      System.out.println("Please choose one of the three objects against Professor Hickey...\n");
      System.out.println("1 = Scissor; 2 = Rock; 3 = Paper)");

      Scanner input=new Scanner(System.in);
      int userObject=input.nextInt();
      Random rand = new Random();
      int hickeyObject= rand.nextInt(3) + 1;
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


      System.out.println("You played "+ Object1);
      System.out.println("Professor Hickey palyed "+ Object2);


      if(userObject==hickeyObject){
        System.out.println("It is a tie!");
      }

      else if(userObject==1&&hickeyObject==2 || userObject==2&&hickeyObject==3 || userObject==3&&hickeyObject==1){
        System.out.println("Professor Hickey wins!");
      }

      else{
        System.out.println("Professor Hickey loses!");
        wins++;
      }

    }
    System.out.println("###   ###   #########   ###   ###      #   #   #    #####    ##     ##");
    System.out.println("###   ###   ###   ###   ###   ###      ##  #  ##             ###    ##");
    System.out.println("###   ###   ###   ###   ###   ###      ##  #  ##    #####    ###    ##");
    System.out.println("#########   ###   ###   ###   ###      ## ### ##    #####    ####   ##");
    System.out.println("   ###      ###   ###   ###   ###      ## ### ##    #####    ## ### ##");
    System.out.println("   ###      ###   ###   ###   ###      ## ### ##    #####    ##  #####");
    System.out.println("   ###      #########   #########       #######    #######   ##   ####");
  }
}
