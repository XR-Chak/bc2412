public class Card {
  //String vs char (Single character)
  private Rank rank;//'A','2',...'T','J','Q','K',-->13
  private Suite suite;//'D','C','H','S',-->4
  //static :shared values ,與object冇關。。。
  //final: cannot be modified after initialization
  //static final -> constant
  //Constant naming convention --> should be big letter e.g. PI
  // public static final char[] RANKS = new char[]{'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
  // public static final char[] SUITES = new char[]{'D','C','H','S'};
  
  public static final int x =3;

  public Card(Suite suite,Rank rank){
    this.rank = rank;
    this.suite = suite;
  }
  
  public Rank getRank(){
    return this.rank;
  }

  public Suite getSuite(){
    return this.suite;
  }

  public int[] getSuiteRank(){
    int[] summary = new int[2];
    summary[0] = this.getSuite().getOrder();
    summary[1] = this.getRank().getOrder();
    return summary;
  }

  @Override
  public String toString(){
    return "The suite :"+this.getSuite()+" "+"The rank :"+this.getRank();
  }

  public String compareCard(Card card){
    if (this.getRank().getOrder()>card.getRank().getOrder()) {
      return this.toString();
    }else if(this.getRank().getOrder()==card.getRank().getOrder()){
      if(this.getSuite().getOrder()>card.getSuite().getOrder()){
        return this.toString();
      }
    }
    return card.toString();
  }

  public static void main(String[] args) {
    Card c1 = new Card(Suite.SPADES, Rank.A);
    Card c2 = new Card(Suite.CLUBS, Rank.A);
    Card c3 = new Card(Suite.SPADES, Rank.TEN);
    System.out.println(c1.compareCard(c2));
    System.out.println(c2.compareCard(c3));
  }

}
