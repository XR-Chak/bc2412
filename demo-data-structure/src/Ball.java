import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ball implements Comparable<Ball>{
  private Color color;
  private int value;

  public Ball(Color color,int value){
    this.color = color;
    this.value = value;
  }

  public Color getColor(){
    return this.color;
  }

  public int getValue(){
    return this.value;
  }

  public void setColor(Color color){
    this.color = color;
  }

  @Override
  public int compareTo(Ball ball){
    //compare two ball
    //this.ball(-1),ball(1) <---------背！！！！！！！


    //Order by color : RED>BLUE>YELLOW.For same color ,descending order of value
    if (this.color == ball.color && this.value>ball.value) {
      return -1;
    }
    if (this.color == ball.color && this.value<ball.value) {
      return 1;
    }
    if (this.color==Color.RED){
      return -1;
    }
    if (ball.color==Color.RED) {
      return 1;
    }
    if (this.color==Color.BLUE && ball.color==Color.YELLOW) {
      return -1;
    }
    if (this.color== Color.YELLOW && ball.color == Color.BLUE) {
      return 1;
    }
    return 1;
  }

  public static enum Color{
    RED,YELLOW,BLUE,;
  }

  @Override
  public String toString(){
    return "The color: "+this.color+" the value: "+this.getValue();
  }
  public static void main(String[] args) {
    //Ball List
    //RED 1
    //YELLOW 9
    //BLUE 7
    //YELLOW 9
    //BLUE 7
    //YELLOW 3
    //RED 8
    List<Ball> ballList = new ArrayList<>();
    ballList.add(new Ball(Color.RED, 1));
    ballList.add(new Ball(Color.YELLOW, 9));
    ballList.add(new Ball(Color.BLUE, 7));
    ballList.add(new Ball(Color.YELLOW, 9));
    ballList.add(new Ball(Color.BLUE, 7));
    ballList.add(new Ball(Color.YELLOW, 3));
    ballList.add(new Ball(Color.RED, 8));
    System.out.println(ballList.size());
    System.out.println(ballList);

    //Sort by values
    //APPROACH 1: Comparable<Ball> (Disadvantage: One rule for sort)
    Collections.sort(ballList);//Ball Class comply with the contract of Collections.sort()
    System.out.println(ballList);
    //[The color: RED the value: 8, The color: RED the value: 1, The color: BLUE the value: 7, The color: BLUE the value: 7, The color: YELLOW the value: 9, The color: YELLOW the value: 9, The color: YELLOW the value: 3]
  
  
    //Approach 2: Comparator<Ball> (Better Design)
    Comparator<Ball> sortFormula;
    int x = 0;
    if (x>2) {
      sortFormula = new SortByColor();
    }else{
      sortFormula = new SortByValue();
    }



    Collections.sort(ballList, sortFormula);
    System.out.println(ballList);
  }
}
