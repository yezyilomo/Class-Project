package sample.game;
import java.util.*;

public class DeckWithoutJokers{
  public static Stack<Card> deck;
  public DeckWithoutJokers(){

     deck=new Stack<Card>();

     for(int i=1;i<=13;i++){
       for(int j=1;j<=4;j++){
          deck.push(new Card(i,setSuit(j)));
       }
     }
  }

  public String setSuit(int i){

     if(i==1) return "DIAMONDS";
     if(i==2) return "HEARTS";
     if(i==3) return "SPADES";
     if(i==4) return "CLUBS";

     return "None";
  }

  public static void shuffleCards(){
    new DeckWithoutJokers();
    Card cardArray[]=new Card[52];
    Random rand=new Random();

    for(int i=1;i<=52;i++){

      int test=rand.nextInt(52);
      while(cardArray[test]!=null){
          test=rand.nextInt(52);
      }
      cardArray[test]=deck.pop();
    }

    for(int i=0;i<52;i++){
     deck.push(cardArray[i]);
    }
  }

}
