public class Brandeisian Adventure {
  public static void main (String[] args){
    Entrance();
    Choose();
    Choose();
    Choose();
  }

  public static void Entrance(){
    System.out.println("Hello adventurer， welcome to the glory fort of shapiro center! You need to registre at the front desk to proceed the entrance test for becoming a proud Brandeisian! ");
    System.out.println("Please enter your name");
    String name = TextIO.getlnString();
    System.out.println("Nice to meet you " + name + "! We have a slot open at CS11A class, but you need to prove your ability to do some maths!");
    System.out.println("Give me an random interger A from 1 to 10!" )
    Int interger1 = TextIo.getlnInt();
    System.out.println("Give me another random interger B from 1 to 10! ")
    Int interger2 = TextIo.getInInt();
    System.out.println("How much is A to the power of B? ")
    Int A1 = TextIo.getInInt();
    if (A1 == Math.pow(interger1, interger2)){
        System.out.println("You know your maths!Now you get access to the CS building!")
    } else {System.out.println ("you failed the test!Do it again!")}

  public static void Choose()
    System.out.println("Now, which Building do you wanna start your adventure with, CS Building, Gosman Center, or North Dorm?");
    String building = TextIO.getlnString();
    if (building.equals("CS Building")){
      chenyanxiprojectname()
      yifeiprojectname()
    }
    else if (building.equals("Gosman Center")){
      ruanjiaxiprojectname()
    }
    else if (building.equals("North Dorm")){
      zuohanzhiprojectname()
    }
  }
