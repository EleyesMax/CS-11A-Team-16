import java.util.Scanner;
public class DormEscape{
   public static void main(String[] args) {
     riddle();
   }
/**
this is  a game that let user ecape from the dorm by answering the right question.
*/
public static void riddle(){
  Scanner console = new Scanner(System.in);
  System.out.println("please enter username");
  String Name = console.next();
  System.out.println("You live in Massell or North?");
  String DormName = console.next();
  System.out.printf("Now you are at the third floor of %s.%nYou can escape only if you follow the instructions%n",DormName);
  System.out.println("Open a door and take one thing that it is important for you to escape.");
  System.out.println("please tell us what you decide to take with you");
  String Things = TextIO.getlnString();
  System.out.printf("GREAT! take %s with you and answer the question%n", Things);
  System.out.println("What is the founding date of Brandeis\n ");
  System.out.println("1946 \n 1947 \n 1948 \n 1949");
  long date = console.nextLong();
  if(date == 1946){
    System.out.println("error. Sorry you died");
  }else if(date == 1947){
    System.out.println("Sorry. you cannot escape.");
  }else if(date == 1948){
    System.out.println("WOW! YOU ARE SO TALENTED! Here is your key and you can go.");
  }else if(date == 1949){
    System.out.println("OOPS.... wrong! Try it again");
  }
}
}
