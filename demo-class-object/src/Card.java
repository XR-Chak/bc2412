public class Card {
  //String vs char (Single character)
  private char rank;//'A','2',...'T','J','Q','K',-->13
  private char suite;//'D','C','H','S',-->4
  //static :shared values ,與object冇關。。。
  //final: cannot be modified after initialization
  //static final -> constant
  //Constant naming convention --> should be big letter e.g. PI
  public static final char[] RANKS = new char[]{'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
  public static final char[] SUITES = new char[]{'D','C','H','S'};
  
  public static final int x =3;

  public Card(char suite,char rank){
    this.rank = rank;
    this.suite = suite;
  }
  
  public char getRank(){
    return this.rank;
  }

  public char getSuite(){
    return this.suite;
  }

  

}
