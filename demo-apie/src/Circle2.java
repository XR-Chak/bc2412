import java.math.BigDecimal;

public class Circle2 implements Shape2{
  

  @Override
  public double area(){//same name with the shape.class abstract method!!!!
    return BigDecimal.valueOf(Math.pow(3.0, 2.0))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }
}
