public enum Suite {
  DIAMONDS(0),
  CLUBS(1),
  HEARTS(2),
  SPADES(3),;

  private final int order;

  private Suite(int order){
    this.order = order;
  }

  public int getOrder(){
    return this.order;
  }

  public static void main(String[] args) {
    
  }
}
