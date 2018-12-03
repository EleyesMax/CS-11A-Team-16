//Yanxi Chen
//The adventure at CS BUilding
public class CSBuilding{

  //player's standard property
    private static int playerHealth = 50;
    private static int playerAttack = 5;

  //Professor Hickey's standard property
    private static int THHealth = 100;
    private static int THAttack = 2;

  //The check and talk stand for the times player has choose
  //to check or talk.
    private static double check = 0;
    private static double talk = 0;
    private static double mercy = 0;

    // The method which print player's health and TH's health
    public static void printBlood(int playerHealth,int THHealth){
      System.out.println("--------------------------");
      System.out.println("Your Health: " + playerHealth);
      System.out.println("Tim Hickey's Health: " + THHealth);
      System.out.println("--------------------------");
    }


    //Method to run attack movement
    public static void runattack(){
      int times1 = (int)(Math.random()*2) + 1;
      THHealth = THHealth - playerAttack * times1;
      int times2 = (int)(Math.random()) + 1;
      playerHealth = playerHealth - THAttack * times2;
      CSBuilding.printBlood(playerHealth,THHealth);
    }

    //Method to run talk movement
    public static void runtalk(){
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

    //Method to run mercy movement
    public static void runmercy(){
      if(mercy < 3){
        System.out.println("Professor Hickey has more knowledge he wants to teach!");
      }
      else{
        System.out.println("YOU WIN!");
      }
    }



public static void main(String args[]){
  CS();
}


public static void CS(){
  System.out.println("BATTLE BEGIN!");
  System.out.println("Tim Hickey Jumps Out!!!");

  while(THHealth > 0){
    if(playerHealth > 0){
      System.out.println("Make your choice:");
      System.out.println("Attack   Check   Talk   Mercy");

      String choice = TextIO.getlnString();

      if(choice.equals("Attack")){
        CSBuilding.runattack();
      }

      else if(choice.equals("Check")){
        System.out.println("Tim Hickey wants to teach you some CS knowledge!");
        check++;
      }

      else if(choice.equals("Talk")){
        CSBuilding.runtalk();
      }

      else if(choice.equals("Mercy")){
        CSBuilding.runmercy();
        break;
      }

    }
    else{
      System.out.println("You lose!");
    }
  }
}




}
