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
      System.out.print(deck[i]+ " " );

    }
  }


  public void dealCards(){
    Scanner user_input = new Scanner( System.in );
    String numPlayers;
    System.out.print("Enter the number of players: ");
    numPlayers = user_input.next( );
    int result = Integer.parseInt(numPlayers);
    int numCardsEach = Math.round(52 / result) ;
    System.out.println(numCardsEach);
    int ctr=0;
    for(int k = 0; k < result; k++);
      ctr = ctr + 1;
    String playNum=Integer.toString(ctr)  ;   
    int cardCnt=0;
    String deckstr = ("Deck"+playNum );
    System.out.println(deckstr);
    System.out.println(numCardsEach);
    
    int cntr = 0;
    for(int i=0; i < result; i++){
      System.out.println("Player " + (i+1) + ":-");
      System.out.println("==============================");
      
    //System.out.println("Card is: " + deck[i]);
      int g;
      g=0;
      int ctr1 = 0;


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
                System.out.print(deck[cntr] + "" );
                System.out.println(" of Diamonds ♦♦♦♦");
                

                break;
          
              }
              case 2: {
                
                
                System.out.print((deck[cntr]-13) + "" );
                System.out.println(" of Hearts ♥♥♥♥");
          break;      
                
          
              }
              case 3: {
                if (deck[cntr] == 39)
                 System.out.print("King");
               else if (deck[cntr] == 38)
               System.out.print("Queen");
             else if (deck[cntr] == 37)
             System.out.print("Jack");
           else if (deck[cntr] == 27)
           System.out.print("Ace");
               else
                System.out.print((deck[cntr]-26) + "" );
                System.out.println(" of Clubs ♣♣♣♣");
                break;
          
              }
              case 4: {
                
                System.out.print((deck[cntr]-39) + "" );
                System.out.println(" of Spades ♠♠♠♠");
                break;


}}


       
       
       cntr = cntr + 1;
     }
       System.out.println("");

       System.out.println("==============================");

     }
  }



}   //end of class





// Card temp;

    // for ( int i = deck.length-1; i > 0; i-- ) {
    //     int rand = (int)(Math.random()*(i+1));
    //     int temp = deck[i];
    //     deck[i] = deck[rand];
    //       deck[rand] = temp;
    //       System.out.println (temp);


    // }

    // Random rnd = new Random();
    // for (int i = deck.length - 1; i > 0; i--)
    // {
    //   int index = rnd.nextInt(i + 1);
    //   // Simple swap
    //   int a = deck[index];
    //   deck[index] = deck[i];
    //   deck[i] = a;
    //   System.out.println (deck[index]);
    // }



     // If running on Java 6 or older, use `new Random()` on RHS here
      //   Random roond = ThreadLocalRandom.current();
      //   for (int i = deck.length - 1; i > 0; i--)
      //   {
      //     int index = roond.nextInt(i + 1);
      //     // Simple swap
      //     int a = deck[index];
      //     deck[index] = deck[i];
      //     deck[i] = a;
      //     System.out.println (deck[index]);
      //   }
      // }






// public void shuffle() {
//         for ( int i = deck.length-1; i > 0; i-- ) {
//             int rand = (int)(Math.random()*(i+1));
//             Card temp = deck[i];
//             deck[i] = deck[rand];
//             deck[rand] = temp;
//         }

//     }    











  //  get numOfPlayers
  //  get numberperdeck = integer of divide 52/numplayers



  //  for i = 1 to numOfPlayers
  //   for j = 1 to to nummerperdeck

  //     add j to i array somewhere

  //   j = j +1
  //   next  
  //   i = i +1
  //   next


  // }

