public class GosmanGame {
    public static void main(String[] args) {
        System.out.println("Welcome to a Dice Game of Gosman Sports center! In order to claim the title of 'The toughest', you will be asked to do a computation first. After you do correctly answer the question, you have to win the big dice game twice in a roll versus James. Let's get straight to the game!");
  while (true){
      int dice=(int)(Math.random()*6+1);
      double x=Math.random();
      int x1 = (int)(x*100);
      double y=Math.random();
      int y1 =(int)(y*100);
      double sum= x1+y1;

      System.out.println("what is the sum of"+x1+'+'+y1);
      int answer = TextIO.getlnInt();
      if (answer==sum){
        System.out.println("James:OMG I can't believe you just beat me!");
        break;
      }else {
        System.out.println("try again");
        }
      }
  }
}
