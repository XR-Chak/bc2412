//Generics
import java.math.BigDecimal;

//The T in "Class ,instance variable,instance method" are same definition
public class Box <T extends Shape>{//extends can control the range of the T type!!!!Now it must be within shape type!
   private T[] shapes;

   public Box(){
    this.shapes = (T[]) new Shape[2];
   }

   //The T in instance method refers to the definition T of Class
   public void addShape(int index, T shape){
    this.shapes[index] = shape;
   }
   public double totalArea(){ //shapes[0].area
      BigDecimal total = BigDecimal.valueOf(0.0);
      for(Shape shape : this.shapes){
        total = BigDecimal.valueOf(shape.area()).add(total);
      }
      return total.doubleValue();
   }

   //The T in Static method is not reffering the T in class!!!
   public static <T extends Shape> double totalArea2(T[] shapes){
    BigDecimal total = BigDecimal.valueOf(0.0);
    for(Shape shape : shapes){
      total = BigDecimal.valueOf(shape.area()).add(total);
    }
    return total.doubleValue();
   }

   public static void main(String[] args) {
    Box<Circle1> box1 = new Box<>();
    box1.addShape(0, new Circle1(3.0));
    box1.addShape(1, new Circle1(4.0));
    System.out.println(box1.totalArea());//78.53981633974483

    Box<Shape> box2 = new Box<>();
    box2.addShape(0, new Square(3.0));
    box2.addShape(1, new Circle1(5.0));//87.53981633974483
    System.out.println(box2.totalArea());

    //Team<Hero>

   }
}
