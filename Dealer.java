import java.util.Random;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

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
  Scanner user_input = new Scanner( System.in );
  String numPlayers;
  String whatCard="";
  String cardName="";
  String winString="";
  Integer deckValue =0;
  Integer dealerDeckValue =0;
  int ddv = 0;
  int dv = 0;
  System.out.print("          #Enter the number of players (excluding the dealer): ");
  numPlayers = user_input.next( );
  int result = Integer.parseInt(numPlayers)+1;
  int numCardsEach = Math.round(52 / result) ;
    numCardsEach = 2; //remove for full deal
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

      System.out.println("==============================");
      
      if (i == 0) 
      System.out.println("Dealer "  + ":");
else
  System.out.println("Player " + (i) + ":");


      System.out.println("==============================");
      
    //System.out.println("Card is: " + deck[i]);
      int g;
      g=0;
      int ctr1 = 0;
      //int deckValue=0;
      
      for(int d = 0 ;d < numCardsEach ; d++) 

    //    int e = d +( i * 17);
      {
        //intStr = (cntr + 1).toString;
        // System.out.print( cntr + 1);
        // System.out.print(") ");
        ctr1=deck[cntr];
        
        if(ctr1 < 14) g = 1;
        else if(ctr1 < 27) g = 2;
        else if(ctr1 < 40) g = 3;
        else  g = 4;

        switch (g) {
          case 1: {
               // System.out.println(deck[cntr]);
            //System.out.println("counter ="  +deck[cntr] );
               if (deck[cntr] == 1)
              {System.out.print("Ace" + "" );
         //   } else if (deck[cntr] == 24)
//   {System.out.print(cardName + "" );
          } else if (deck[cntr] == 11)
          //cardName="Jack";
          {System.out.print("Jack" + "" );
        } else if (deck[cntr] == 12)
        //cardName="Queen";
        {System.out.print("Queen" + "" );
      } else if (deck[cntr] == 13)
      //cardName="King"
      {System.out.print("King" + "" );
    } else
    {System.out.print(deck[cntr] + "" );}

    //{System.out.print(deck[cntr] + "");}

    System.out.println(" of Diamonds ♦♦♦♦");
    if (deck[cntr] ==1)
    {
      deckValue= deckValue+11;
    }else if (deck[cntr] < 9){
      deckValue= deckValue+deck[cntr]; 
    } else {
      deckValue= deckValue+10;}
whatCard = Integer.toString(deck[cntr]); 
suit="♦";
//Cards("Diamonds", deck[cntr]);
      break;

    }
    case 2: {
       if (deck[cntr] == 14)
      {System.out.print("Ace" + "" );
    } else if (deck[cntr] == 24)
    {System.out.print("Jack" + "" );}
    else if (deck[cntr] == 25)
      {System.out.print("Queen" + "" );}
    else if (deck[cntr] == 26)
      {System.out.print("King" + "" );}
    else
      {System.out.print(deck[cntr]-13 + "" );}

//whatCard=(deck[cntr]);
    System.out.println(" of Hearts   ♥♥♥♥");
          // if (deck[cntr] ==14)
          // {
          //   deckValue= deckValue+11;
          //   }else if (deck[cntr] < 23);
          //   {deckValue= deckValue+(deck[cntr]-13); 
          //   } else 
          //   {deckValue= deckValue + 10;}
    if (deck[cntr] ==14)
    {
      deckValue= deckValue + 11;
    }else if (deck[cntr] < 23){
      deckValue= deckValue+deck[cntr]-13; 
    } else {
      deckValue= deckValue+10;}




            // System.out.print((deck[cntr]-13) + "" );
            // System.out.println(" of Hearts ♥♥♥♥");

            // deckValue= deckValue+deck[cntr]-13;
      //whatCard = Integer.toString(deck[cntr]); 
      whatCard =  Integer.toString(deck[cntr]%13) ; 
      if (whatCard == "0"){
        whatCard = "King";}
      suit="♥";

      break;      

      
    }
    case 3: {

     if (deck[cntr] == 27)
       {System.out.print("Ace" + "" );
   } else if (deck[cntr] == 37)
   {System.out.print("Jack" + "" );}
   else if (deck[cntr] == 38)
    {System.out.print("Queen" + "" );}
  else if (deck[cntr] == 39)
    {System.out.print("King" + "" );}
  else
    {System.out.print(deck[cntr]-26 + "" );}


  System.out.println(" of Clubs    ♣♣♣♣");

  if (deck[cntr] < 36){
    deckValue= deckValue+(deck[cntr]-26); 
  } else {
    deckValue= deckValue + 10;}


            // System.out.print((deck[cntr]-26) + "" );
            // System.out.println(" of Clubs ♣♣♣♣");
            // deckValue= deckValue+deck[cntr]-26;



  //    whatCard = Integer.toString(deck[cntr]); 
    whatCard =  Integer.toString(deck[cntr]%13) ; 
    if (whatCard == "0"){
      whatCard = "King";}
        


suit="♣";
 // System.out.println(" ------");
 // System.out.println("|" + whatCard + suit+"   |");
 // //System.out.println("|  " + suit + "|");
 // System.out.println("|     " + " " +"|");
 // System.out.println("|     " + " " +"|");
 // System.out.println(" ------");



    break;

  }
  case 4: {
    if (deck[cntr] == 40)
      {System.out.print("Ace" + "" );
  } else if (deck[cntr] == 50)
  {System.out.print("Jack" + "" );
}else if (deck[cntr] == 51)
{System.out.print("Queen" + "" );
}else if (deck[cntr] == 52)
{System.out.print("King" + "" );
}else
{System.out.print(deck[cntr]-39 + "" );}


System.out.println(" of Spades   ♠♠♠♠");

if (deck[cntr] < 50){
  deckValue= deckValue+(deck[cntr]-39); 
} else {
  deckValue= deckValue + 10;}


suit="♠";

            // System.out.print((deck[cntr]-39) + "" );
            // System.out.println(" of Spades ♠♠♠♠");
            // deckValue= deckValue+deck[cntr]-39;
// whatCard= whatCard;
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
 // System.out.println("set " + dealerDeckValue);
}   

//    if (i > 0) {
//      ddv = deckValue;
// }


 //    dv = Integer.parseInt(deckValue);
     
 //     if (dv > ddv); 
 //     System.out.println("Beat dealer");
 // System.out.println(dealerDeckValue);
 // }
  

System.out.println("");
System.out.println("Hand = " + deckValue);
if (deckValue - dealerDeckValue > 0){
System.out.println("WAHOO - YOU BEAT THE DEALER!!!!!!!!!");}  

if (dealerDeckValue - deckValue > 0){
System.out.println("Nay Luck Neebar!!!!!!!!!");}  
//System.out.println(deckValue-dealerDeckValue);
//System.out.println(winString);
System.out.println("==============================");

 
}

}

//System.out.println("Hand = "+ deckValue);
//System.out.println("==============================");
//System.out.println("=====");

}   //end of class







