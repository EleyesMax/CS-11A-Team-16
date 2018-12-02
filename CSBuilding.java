public class CSBuilding{




public static void main(String args[]){
  CS();
}


//Yanxi Chen
//The adventure at CS BUilding
public static void CS(){

//player's standard property
  int playerHealth = 50;
  int playerAttack = 5;

//Professor Hickey's standard property
  int THHealth = 100;
  int THAttack = 2;

//The check and talk stand for the times player has choose
//to check or talk.
  double check = 0;
  double talk = 0;
  double mercy = 0;

  System.out.println("BATTLE BEGIN!");
  System.out.println("Tim Hickey Jumps Out!!!");

  while(THHealth > 0){
    if(playerHealth > 0){
      System.out.println("Make your choice:");
      System.out.println("Attack   Check   Talk   Mercy");

      String choice = TextIO.getlnString();

      if(choice.equals("Attack")){
        int times1 = (int)(Math.random()*2) + 1;
        THHealth = THHealth - playerAttack * times1;
        int times2 = (int)(Math.random()) + 1;
        playerHealth = playerHealth - THAttack * times2;
        printBlood(playerHealth,THHealth);
      }

      else if(choice.equals("Check")){
        System.out.println("Tim Hickey wants to teach you some CS knowledge!");
        check++;
      }

      else if(choice.equals("Talk")){
        if(check == 0){
          System.out.println("You don't know what to talk about.");
          System.out.println("Maybe you should CHECK him first!");
        }
        else{
          System.out.println("You ask a few questions about CS.");
          System.out.println("Professor Hickey is happy to answer your question and teach you a few more knowledge!");
          System.out.println("Your heart is filled with courage!");
          mercy++;
          if(mercy == 3){
            System.out.println("You are filled with knowledges!");
            System.out.println("Youc can choice MERCY to go on your trip!");
          }
        }
      }

      else if(choice.equals("Mercy")){
        if(mercy < 3){
          System.out.println("Professor Hickey has more knowledge he wants to teach!");
        }
        else{
          System.out.println("YOU WIN!");
          break;
        }
      }

    }
    else{
      System.out.println("You lose!");
    }
  }


}

// The method which print player's health and TH's health
public static void printBlood(int playerHealth,int THHealth){
  System.out.println("--------------------------");
  System.out.println("Your Health: " + playerHealth);
  System.out.println("Tim Hickey's Health: " + THHealth);
  System.out.println("--------------------------");
}

}
