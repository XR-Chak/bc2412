import java.math.BigDecimal;

public class Circle extends Shape{//Parent class :color
  //Square,triangle
  private double radius ;

  public Circle(double radius,String color){
    super(color);
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  //area() return double
  public double getArea(){
    return BigDecimal.valueOf(Math.pow(this.radius, 2.0))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }
  
}
