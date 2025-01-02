import java.math.BigDecimal;

public class Square extends Shape{
  private double side;

  public Square(double side,String color){
    super(color);
    this.side = side;
  }

  public double getArea(){
    return BigDecimal.valueOf(side)
    .multiply(BigDecimal.valueOf(side))
    .doubleValue();
  }
}
