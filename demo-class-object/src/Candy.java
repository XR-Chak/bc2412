public class Candy {
  private char color;//'R,B,Y'
  public static int redCount =0;
  public static int blueCount =0;
  public static int yellowCount =0;

  public Candy(char color){
    this.color = color;
    if (color == 'r') {
      redCount++;
    }
    if (color == 'b') {
      blueCount++;
    }
    if (color == 'y') {
      yellowCount++;
    }
  }

  public static int totalCount(){
    return redCount+blueCount+yellowCount;
  }

  public char getColor(){
    return this.color;
  }



}
