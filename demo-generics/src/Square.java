import java.math.BigDecimal;
import java.util.Objects;

public class Square extends Shape{
  private double side;

  public Square(double side){
    this.side = side;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj) {
      return true;
    }else if(!(obj instanceof Square)){
      return false;
    }
    Square square = (Square) obj;
    return Objects.equals(this.side,square.side);
  }

@Override
public int hashCode(){
  return Objects.hash(this.side);
}

@Override
public String toString(){
  return " the side is :"+this.side;
}
  public double area(){
    return BigDecimal.valueOf(side)
    .multiply(BigDecimal.valueOf(side))
    .doubleValue();
  }
  public double getSide(){
    return this.side;
  }
  public static void main(String[] args) {
    Square s1 = new Square( 3);
    Square s2 = new Square(3);
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s1.equals(s2));
    System.out.println(Objects.equals(s1, s2));
  }
}
