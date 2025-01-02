import java.math.BigDecimal;

public class Triangle extends Shape{
  private double base;
  private double height;

  public Triangle(double base,double height,String color){
    super(color);
    this.base = base;
    this.height = height;
  }

  public double getArea(){
    return BigDecimal.valueOf(base)
    .multiply(BigDecimal.valueOf(height))
    .divide(BigDecimal.valueOf(2.0)).doubleValue();
  }
  public static void main(String[] args) {
    Circle c1 = new Circle(3.2, "pink");
    System.out.println(c1.getArea());
    Square s1 = new Square(4.4, "white");
    System.out.println(s1.getArea());
    Triangle t1 = new Triangle(4.4, 4.5, "black");
    System.out.println(t1.getArea());
  }
}
