public enum OrderStatus {
  PAID(1),
  READY_FOR_SHIP(2),
  DELIVERING(3),
  DELIVERED(4),;

  private final int order;

  private OrderStatus(int order){
    this.order = order;
  }

  public int getOrder(){
    return this.order;
  }
  public OrderStatus next(){
    for(OrderStatus orderstat : values()){
      if (orderstat.getOrder()==this.order+1) {
        return orderstat;
      }
     
    }
     return null;
  }
  public static void main(String[] args) {
    System.out.println(OrderStatus.PAID.next().name());//toString()
    System.out.println(OrderStatus.PAID.name());
    System.out.println(OrderStatus.valueOf("PAID")==OrderStatus.PAID);//return a enum datatype
    System.out.println(OrderStatus.PAID.ordinal());//0
  }
}
