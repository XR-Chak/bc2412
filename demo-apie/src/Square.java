import java.math.BigDecimal;
import java.util.Objects;

public class Square extends Shape{
  private double side;

  public Square(String color,double side){
    super(color);
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
    return Objects.equals(this.side,square.side) &&
    Objects.equals(this.getColor(),square.getColor());
  }

@Override
public int hashCode(){
  return Objects.hash(this.side,this.getColor());
}

@Override
public String toString(){
  return " the side is :"+this.side+" "+" the color is:"+super.getColor();
}
  public double area(){
    return BigDecimal.valueOf(side)
    .multiply(BigDecimal.valueOf(side))
    .doubleValue();
  }
  public static void main(String[] args) {
    Square s1 = new Square("asd", 3);
    Square s2 = new Square("asd", 3);
    System.out.println(s1.hashCode());;
    System.out.println(s2.hashCode());;
    System.out.println(s1.equals(s2));;
    System.out.println(Objects.equals(s1, s2));
  }
}
