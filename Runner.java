import java.util.Timer;
import java.util.TimerTask;

class Runner{

  public static void main(String args[]) {
   clearScreen();
    createLogo();
    System.out.println("");
   Dealer dealer=new Dealer();
   dealer.createDeck();
   dealer.dealCards(); 
    

  }

  public static void clearScreen() {  
      System.out.print("\033[H\033[2J");  
      System.out.flush();  
     }  

  

  public static void createLogo(){
 System.out.println("\r\r\r\r\r\r\r\r\r");
  System.out.println("     PPPPPP  OOOOOOO  NN     NN TTTTTTTT OOOOOOO OOOOOOO NN     NN");
  System.out.println("     PP   PP OOOOOOO  NNN    NN    TT    OOOOOOO OOOOOOO NNN    NN");
  System.out.println("     PP   PP OO   OO  NN N   NN    TT    OO   OO OO   OO NN N   NN");
  System.out.println("     PPPPPP  OO   OO  NN  N  NN    TT    OO   OO OO   OO NN  N  NN");
  System.out.println("     PP      OO   OO  NN   N NN    TT    OO   OO OO   OO NN   N NN");
  System.out.println("     PP      OOOOOOO  NN    NNN    TT    OOOOOOO OOOOOOO NN    NNN");
  System.out.println("     PP      OOOOOOO  NN     NN    TT    OOOOOOO OOOOOOO NN     NN");
  }


}







