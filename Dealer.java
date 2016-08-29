import java.util.Random;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Dealer {

 public static Integer [] deck = new Integer[52];

 public Dealer(){

 }

 public void createDeck(){
    //public Integer[] deck = new Integer[52];
  for(int k = 0; k < deck.length; k++)
    deck[k] = k + 1;

  Collections.shuffle(Arrays.asList(deck));

  for( int i = 0;i < deck.length; i++) {
   //   System.out.print(deck[i]+ " " );

  }
}


public void dealCards(){
  Scanner scanner = new Scanner(System.in);
  //Scanner user_input = new Scanner( System.in );
  String numPlayers;
  String whatCard="";
  String cardName="";
  String winString="";
  Integer deckValue =0;
  Integer dealerDeckValue =0;
  int ddv = 0;
  int dv = 0;
  System.out.println("Enter the number of players (Max 15) excluding the Dealer (Enter defaults to 1): ");
  //numPlayers = user_input.next( );
  System.out.print("");
  
  numPlayers = scanner.nextLine(); 

  if (numPlayers.isEmpty()) {
        // Display string length.
    numPlayers = "1";}
    System.out.println("");
    System.out.println(numPlayers +" player(s) ready to take on the house - good luck (you may need it!). ");
    System.out.print("");
    System.out.println("Press ENTER key to deal cards");
    String sentence = scanner.nextLine();
  //System.out.println("Dealer "  + ":");

    int result = Integer.parseInt(numPlayers)+1;
    
    int numCardsEach = Math.round(52 / result) ;
    numCardsEach = 3; //remove for full deal
    //System.out.println(numCardsEach);
    int ctr=0;
    for(int k = 0; k < result; k++);
      ctr = ctr + 1;
    deckValue=0;
    String playNum=Integer.toString(ctr)  ;   
    int cardCnt=0;
    String deckstr = ("Deck"+playNum );
    //System.out.println(deckstr);
    //System.out.println(numCardsEach);
    String suit = "";
    int cntr = 0;
    for(int i=0; i < result; i++){
      deckValue=0;


//Print the dealers details to terminal

      System.out.println("  =======================");
      
      if (i == 0) 
        System.out.println("  Dealer "  + ":");


      else
        System.out.println("  Player " + (i) + ":");


      System.out.println("  =======================");
      
      int g;
      g=0;
      int ctr1 = 0;
      

      //deal out the correct number of cards
      for(int d = 0 ;d < numCardsEach ; d++) 

      {
        if (deckValue > 14)
         {break;} 

       ctr1=deck[cntr];

//get the correct suit
       if(ctr1 < 14) g = 1;
       else if(ctr1 < 27) g = 2;
       else if(ctr1 < 40) g = 3;
       else  g = 4;

       switch (g) {
        case 1: {

          System.out.print("  ♦♦♦♦ ");
          if (deck[cntr] == 1)
            {System.out.print("  Ace" + "" );

        } else if (deck[cntr] == 11)
          //cardName="Jack";
        {System.out.print("  Jack" + "" );
      } else if (deck[cntr] == 12)
        //cardName="Queen";
      {System.out.print("  Queen" + "" );
    } else if (deck[cntr] == 13)
      //cardName="King"
    {System.out.print("  King" + "" );
  } else
  {System.out.print("  " + deck[cntr] + "" );}

  System.out.println(" of Diamonds");
  if (deck[cntr] ==1)
  {
    deckValue= deckValue+11;
  }else if (deck[cntr] < 9){
    deckValue= deckValue+deck[cntr]; 
  } else {
    deckValue= deckValue+10;}
    whatCard = Integer.toString(deck[cntr]); 
    suit="♦";

    break;

  }
  case 2: {

    System.out.print("  ♥♥♥♥ ");
    if (deck[cntr] == 14)
      {System.out.print("  🂱" );
  } else if (deck[cntr] == 24)
  {System.out.print("  🂻" );}
  else if (deck[cntr] == 25)
    {System.out.print("  🂽" );}
  else if (deck[cntr] == 26)
    {System.out.print("  🂼" );}
  else
    {System.out.print("  " + (deck[cntr]-13) + "" );}
  // String[] deckVar = {🂱,🂲,🂳,🂴,🂵,🂶,🂷,🂸,🂹,🂺,🂻,🂽,🂾};
  // System.out.print("  " + (deckVar(deck[cntr]-13)) + "" );}
  

  System.out.println(" of Hearts");
  if (deck[cntr] ==14)
  {
    deckValue= deckValue + 11;
  }else if (deck[cntr] < 23){
    deckValue= deckValue+deck[cntr]-13; 
  } else {
    deckValue= deckValue+10;}

    whatCard =  Integer.toString(deck[cntr]%13) ; 
    if (whatCard == "0"){
      whatCard = "  King";}
      suit="♥";

      break;   
    }

    case 3: {
      System.out.print("  ♣♣♣♣ ");
      if (deck[cntr] == 27)
       {System.out.print("  Ace" + "" );
   } else if (deck[cntr] == 37)
   {System.out.print("  Jack" + "" );}
   else if (deck[cntr] == 38)
    {System.out.print("  Queen" + "" );}
  else if (deck[cntr] == 39)
    {System.out.print("  King" + "" );}
  else
    {System.out.print("  " + (deck[cntr]-26) + "" );}


  System.out.println(" of Clubs");

  if (deck[cntr] < 36){
    deckValue= deckValue+(deck[cntr]-26); 
  } else {
    deckValue= deckValue + 10;}
    
    whatCard =  Integer.toString(deck[cntr]%13) ; 
    if (whatCard == "0"){
      whatCard = "  King";}

      suit="♣";

      break;

    }
    case 4: {
      System.out.print("  ♠♠♠♠ ");
      if (deck[cntr] == 40)
        {System.out.print("  Ace" + "🂡" );
    } else if (deck[cntr] == 50)
    {System.out.print("  Jack" + " 🂫" );
    // 🂡🂢🂣🂤🂥🂦🂧🂨🂩🂪🂫🂬🂭🂮
  }else if (deck[cntr] == 51)
  {System.out.print("  Queen" + " 🂭" );
}else if (deck[cntr] == 52)
{System.out.print("  King" + "🂮" );
}else
{System.out.print("  " + (deck[cntr]-39) + "" );}


System.out.println(" of Spades");

if (deck[cntr] < 50){
  deckValue= deckValue+(deck[cntr]-39); 
} else {
  deckValue= deckValue + 10;}


  suit="♠";

  int stringLen = whatCard.length();
  if (stringLen == 1){
   whatCard = " " + whatCard;
 }
 break;

}
}
cntr = cntr + 1;
}

if (i == 0) 
{
  dealerDeckValue = deckValue;
}   


System.out.println("");
System.out.println("  Value of Hand = " + deckValue);
System.out.println("");

if (deckValue > 21 ){
  if (i != 0) System.out.println("  YOU BUST!");
  if (i == 0) {System.out.println("  DEALER BUSTS!");}
  dealerDeckValue = 0;}
  else if (dealerDeckValue - deckValue > 0 ){
    System.out.println("  YOU LOST!");} 
    else if (deckValue - dealerDeckValue > 0){
      System.out.println("  WINNER!");}
      else
        if (i != 0) {System.out.println("  DEALER WINS DRAW!");}
      System.out.println("  =======================");
      //System.out.println("_______________________");
    }

    System.out.print("  Press Enter to play again ~ CTL-C to quit");
  }


}   //end of class






