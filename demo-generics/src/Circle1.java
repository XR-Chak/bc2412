import java.math.BigDecimal;
import java.util.Objects;

public class Circle1 extends Shape{//Parent class :color
  //Square,triangle
  private double radius ;

  //If you don't specify the constructor ,implicitly you have an empty constructor
  public Circle1(double radius){
    //If you don't specify super() here ,by default implicitly you are calling super()
    //super(color);//because  you have "extends",you have to "super"
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  @Override
  public boolean equals(Object obj){
    //same object -> they must be same
    if(this == obj){// == mean if they have the smae address ,they must have same value
      return true;
    }if(!(obj instanceof Circle1)){
      return false;
    }
    Circle1 circle = (Circle1) obj;//from parent class to child class (int x = (int) 10L) downcast
    return Objects.equals(circle.getRadius(),this.getRadius());
  }

  //Implicitly extend Object.class (Object.hashCode() -> check if they are same memory object)
  @Override
  public int hashCode(){
    return Objects.hash(this.radius);//hash -> generate a new int number representing the object
  }

  @Override
  public String toString(){
    return "Circle["//
    + "radius=" + this.getRadius() //
    +"]";
  }

  //area() return double
  @Override 
  //Override th parent given method
  //compiler will help to check if the parent class has a area() method
  public double area(){//same name with the shape.class abstract method!!!!
    return BigDecimal.valueOf(Math.pow(this.radius, 2.0))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }
  public static void main(String[] args) {
    Circle1 c1 = new Circle1( 3.0);
    Circle1 c2 = new Circle1(3.0);
    System.out.println(c1.equals(c2));
    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
    System.out.println(c1.toString());//Circle[radius=3.0, color=pink]
    char[] asd = new char[]{'a','s','c','c'};
    System.out.println(asd.toString());
  }
}
