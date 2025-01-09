public enum Rank {
  THREE(0),
  FOUR(1),
  FIVE(2),
  SIX(3),
  SEVEN(4),
  EIGHT(5),
  NINE(6),
  TEN(7),
  J(8),
  Q(9),
  K(10),
  A(11),
  TWO(12),;

  private final int order;
  private Rank(int order){
    this.order = order;
  }

  public int getOrder(){
    return this.order;
  }
}
