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
    System.out.println(Cat1.calculateArea2(3.0));
    Cat1 c1 = new Cat1();//save it in c1
    new Cat1();//no address save this object,we will lost it
    Cat1 c2 = c1;
    c2.age = 10;
    System.out.println(c1.age);
  }
}
