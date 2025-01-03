import java.math.BigDecimal;
import java.util.Objects;

public class Triangle extends Shape{
  private double base;
  private double height;

  public Triangle(double base,double height,String color){
    super(color);
    this.base = base;
    this.height = height;
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.base,this.height,super.getColor());//hash -> generate a new int number representing the object
  }
  @Override
  public boolean equals(Object obj){
    if (this == obj) {//checking they are the same address
      return true;
    }else if(!(obj instanceof Triangle)){
      return false;
    }
    Triangle triangle = (Triangle) obj;
    return Objects.equals(triangle.base, this.base) &&
    Objects.equals(triangle.height, this.height) &&
    Objects.equals(triangle.getColor(), this.getColor())
    ;
  }

  @Override
  public String toString(){
    return " Height: "+this.height+" "+" Base: "+this.base;
  }
  public double area(){
    return BigDecimal.valueOf(base)
    .multiply(BigDecimal.valueOf(height))
    .divide(BigDecimal.valueOf(2.0)).doubleValue();
  }
  public static void main(String[] args) {
    Circle1 c1 = new Circle1("asd",3.2);
    System.out.println(c1.area());
    Square s1 = new Square("white",4.4);
    System.out.println(s1.area());
    Triangle t1 = new Triangle(4.4, 4.5, "black");
    System.out.println(t1.area());
  }
}
