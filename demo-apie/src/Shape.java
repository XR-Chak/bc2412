public abstract class Shape {//abstracted就起不到object
  //abstract class vs class
  //1.Cannot create object for abstract class
  //2.They are both with common attribute for child class
  //3.abstract class's constructor is for child class to "super"

  private Color color;

  public Shape(Color color){
    this.color = color;
  }

  public Shape(){
    
  }

  public Color getColor(){
    return this.color;
  }

  //implicitly public
  //Implication: If the child class cannot provide area implementation ,then it is not a shape.
  abstract double area();//must have this method in child
  public static Shape create(char ref, Color color){//S -> Square, C-> Circle
    if (ref =='S') {
      Square s1 = new Square(color, 3);
      return s1;
    }
    if (ref =='C') {
      Circle1 c1 = new Circle1(color, 3);
      return c1;
    }
    return null;

  }
  public static Shape createCircle(Color color, double radius){
    return new Circle1(color, radius);
  }
  public static void main(String[] args) {
    Shape.create('S', Color.RED);
    Shape.createCircle(Color.BLUE, 3.0);
    
  }
}
