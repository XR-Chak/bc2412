import java.math.BigDecimal;

public class Square2 implements Shape2{
  private double length;
  public Square2(double length){
    this.length = length;
  }

  @Override
  public double area(){
    return BigDecimal.valueOf(this.length)
    .multiply(BigDecimal.valueOf(this.length))
    .doubleValue();
  }

  public static void main(String[] args){
    Square2 s2 = new Square2(4.4);
    System.out.println(s2.area());
    System.out.println(s2.calculate());
  }
}
  

