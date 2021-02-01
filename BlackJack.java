import java.util.* ;
public class BlackJack
{public static void main(String[] args)
 {String goAgain = "y";
 String hit ;
 int playerTotal, dh;
 while (goAgain.equals("y"))
  {Scanner myInput = new Scanner(System.in);
  playerTotal=0;
  
  System.out.print("\n\nCard 1: ");
  playerTotal = playerTotal + getCard() ;
  System.out.print("\n\nCard 2: ");
  playerTotal = playerTotal + getCard() ;
  System.out.print("\n\nTotal is: "+playerTotal);
  System.out.print("\n\nHit? (y or n)");
  hit = myInput.next();
  while(hit.equals("y"))
    {System.out.print("\n\n new card: ");
     playerTotal = playerTotal + getCard() ;
     System.out.print("\n\nTotal is: "+playerTotal);
     if (playerTotal>21)
         {System.out.println("You went over 21.\n  You lose.\n\n");
          break; }
     System.out.print("\n\nHit? (y or n)");
     hit = myInput.next();
    }
  
  System.out.print("\n\nPlayerTotal:\t"+playerTotal+"\n\n");
  dh = getDealersHand();
  System.out.print("\n\nPlayerTotal:\t"+playerTotal);
  System.out.print("\n\nDealerTotal:\t"+dh+"\n\n");
  if ((playerTotal>dh)&&(playerTotal<=21)) System.out.println("You win !!!\n");
  if((dh>playerTotal)&&(dh<=21)) System.out.println("You lose.\n");
  else if((playerTotal==dh)||((playerTotal>21)&&(dh>21)))System.out.println("Tie. No winner.\n");
  
    
  System.out.print("\n\ngo again? ");
  goAgain = myInput.next();
  }
 }
 
 public static int getCard()
  {Random x = new Random(); 
  int suit , card , value ; 
  suit = x.nextInt(4);
  card = x.nextInt(13)+1;
  if(card==1)System.out.print("Ace");
  if(card==2)System.out.print(card);
  if(card==3)System.out.print(card);
  if(card==4)System.out.print(card);
  if(card==5)System.out.print(card);
  if(card==6)System.out.print(card);
  if(card==7)System.out.print(card);
  if(card==8)System.out.print(card);
  if(card==9)System.out.print(card);
  if(card==10)System.out.print(card);
  if(card==11)System.out.print("Jack");
  if(card==12)System.out.print("Queen"); 
  if(card==13)System.out.print("King");
  System.out.print(" of ");
  if(suit==0)System.out.println("Diamonds");
  if(suit==1)System.out.println("Clubs");
  if(suit==2)System.out.println("Hearts");
  if(suit==3)System.out.println("Spades");
  if (card<=10) value = card; else value = 10;
  return value;
  }
 
public static int getDealersHand()
 {int dealerTotal ;
  System.out.println("\n\nNow drawing dealer's hand . . .");
  dealerTotal=0;
  dealerTotal = dealerTotal + getCard() ;
  dealerTotal = dealerTotal + getCard() ;
  while(dealerTotal<=16)
    {dealerTotal = dealerTotal + getCard() ;
     if (dealerTotal>21)
         {System.out.println("Dealer went over 21.\n  You Win!!\n\n");
          break; }
    }
 return dealerTotal;
 }   

 
 
} 