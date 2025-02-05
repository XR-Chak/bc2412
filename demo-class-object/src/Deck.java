import java.util.Arrays;
import java.util.List;

public class Deck {
  //52 cards
  private Card[] cards;

  public Deck(){
    this.cards = new Card[Card.RANKS.length*Card.SUITES.length];
    int idx = 0;
    for(int i=0;i<Card.SUITES.length;i++){
      for(int j=0;j<Card.RANKS.length;j++){
        this.cards[idx++] = new Card(Card.SUITES[i],Card.RANKS[j]);
      }
    }
  }

  public List<Card> getCards(){
    return Arrays.asList(this.cards);
  }

  // public Card[] getCards(){
  //   return this.cards;
  // }
  public static void main(String[] args) {
    Deck deck = new Deck();//52 cards
    for(int i=0;i<deck.getCards().length;i++){
      System.out.println(deck.getCards()[i].getSuite()+" "+deck.getCards()[i].getRank());
    }
    System.out.println(Math.PI);//public and static
    Card card = new Card('A', 'S');
    Card card2 = new Card('A', 'S');
    if(card.equals(new Card('A', 'S'))){

    }
    //Card.x = 10;//
    //Card.ranks = new char[3];--> the ranks is final variable ,cannot be changed
  }
}
