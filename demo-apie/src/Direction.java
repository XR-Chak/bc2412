public enum Direction {
  EAST(90,1),
  SOUTH(180,-2),
  WEST(270,-1),
  NORTH(360,2);

  private final int angle;
  private final int value;
  private Direction(int angle,int value){
    this.angle = angle;
    this.value = value;
  }

  public int getAngle(){
    return this.angle;
  }


  //Direction North.oppsite()->Direction South
  public Direction opposite(){
    for(Direction d : values()){
      if (d.value == this.value*-1) {
        return d;
      }
    }
    return null;
  }
  public static void main(String[] args) {
    System.out.println(Direction.EAST.getAngle());
  }
}
