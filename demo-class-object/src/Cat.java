import java.math.BigDecimal;

public class Cat {
  //static method can be placed to any class
  private int age;

   public static double calculateArea2(double radius){
    BigDecimal bd1 = BigDecimal.valueOf(radius);//use Bigdecimal to do multiply so that the ans will not be wrong
    double area = bd1.multiply(bd1).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
    return area;//double
  }
  public static void main(String[] args) {
    System.out.println(Cat.calculateArea2(3.0));
    Cat c1 = new Cat();
  }
}
