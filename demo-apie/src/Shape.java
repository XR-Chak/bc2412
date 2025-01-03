public abstract class Shape {//abstracted就起不到object
  //abstract class vs class
  //1.Cannot create object for abstract class
  //2.They are both with common attribute for child class
  //3.abstract class's constructor is for child class to "super"

  private String color;

  public Shape(String color){
    this.color = color;
  }

  public Shape(){
    
  }

  public String getColor(){
    return this.color;
  }

  //implicitly public
  //Implication: If the child class cannot provide area implementation ,then it is not a shape.
  abstract double area();//must have this method in child
}
