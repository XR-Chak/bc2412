import java.math.BigDecimal;

public class Circle {//blueprint
  private double radius;//attribute,attribute != presentation
  //private String color;
  //Constructor
  public Circle(double radius){
    this.radius = radius;
  }
  //getter
  public double getRadius(){
    return this.radius;
  }
  //setter
  public void setRadius(double radius){
    this.radius = radius;
  }
  //instance method
  public double calculateArea(){//presentation
    BigDecimal bd1 = BigDecimal.valueOf(this.radius);//use Bigdecimal to do multiply so that the ans will not be wrong
    double area = bd1.multiply(bd1).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
    return area;//double
  }


  //static method : cannot call "this"!!!!!
  //Design Definition:input -> output
  public static double calculateArea2(double radius){
    BigDecimal bd1 = BigDecimal.valueOf(radius);//use Bigdecimal to do multiply so that the ans will not be wrong
    double area = bd1.multiply(bd1).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
    return area;//double
  }
  public static void main(String[] args) {
    //area
    Circle c1 = new Circle(3.0);
    //presentation
    System.out.println(c1.calculateArea());//~28.27
    //formula
    System.out.println(Circle.calculateArea2(3.0));//~28.27

  }
}
