import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

class Runner{

  public static void main(String args[]) {
 Scanner scanner = new Scanner(System.in);   
    int x = 10;

    while( x < 20 ) {



     clearScreen();
     createLogo();
     System.out.println("");
     Dealer dealer=new Dealer();
     dealer.createDeck();
     dealer.dealCards(); 

     String sentence = scanner.nextLine();
     x++;

   }

 }

 public static void clearScreen() {  
  System.out.print("\033[H\033[2J");  
  System.out.flush();  
}  



public static void createLogo(){
 System.out.println("\r\r\r\r\r\r\r\r\r");
 
 System.out.println("                ===================================================================");
 System.out.println("                ♣♣♣♣♣♣   ♥♥♥♥♥♥♥   ♠     ♠  ♦♦♦♦♦♦♦  ♠♠♠♠♠♠♠  ♥♥♥♥♥♥♥  ♠     ♠");
 System.out.println("                ♣     ♣  ♥     ♥   ♠♠    ♠     ♦     ♠     ♠  ♥     ♥  ♠♠    ♠");
 System.out.println("                ♣     ♣  ♥     ♥   ♠ ♠   ♠     ♦     ♠     ♠  ♥     ♥  ♠ ♠   ♠");
 System.out.println("                ♣♣♣♣♣♣   ♥     ♥   ♠  ♠  ♠     ♦     ♠     ♠  ♥     ♥  ♠  ♠  ♠");
 System.out.println("                ♣        ♥     ♥   ♠   ♠ ♠     ♦     ♠     ♠  ♥     ♥  ♠   ♠ ♠");
 System.out.println("                ♣        ♥     ♥   ♠    ♠♠     ♦     ♠     ♠  ♥     ♥  ♠    ♠♠");
 System.out.println("                ♣        ♥♥♥♥♥♥♥   ♠     ♠     ♦     ♠♠♠♠♠♠♠  ♥♥♥♥♥♥♥  ♠     ♠");
 System.out.println("                ==============================================================");
 
}





}








