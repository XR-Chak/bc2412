import java.util.Arrays;

public class Animal implements Eatable{
  //common attribute of Cat and Dog
  private String name;

  public Animal(){
    
  }
  public Animal(String name){//Constructor
    this.name = name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){//cat & dog can use this public method
    return this.name;
  }

  @Override
  public void eat(){//must have this method ,because of the interface eatable
    System.out.println("Animal is eating ...");
  }public static void main(String[] args) {
    new Animal();//ok ,it is a normal class

    Cat1 cat1 = new Cat1("Jimmy", 3);
    System.out.println(cat1.getName());

    //1. During the compile time,
    // "Animal cat2" imply the object can be accessed in "Animal Scope"
    Animal cat2 = new Cat1("Mary", 2);//child can place inside a parent...
    cat2.eat();//Cat is eating ...
    //cat2.sleep(); cannot sleep and walk because hidden by the Animal type
    //cat2.walk();
    //Hide the objecgt instance method walk() & sleep()

    //Rule 2. RunTIME
    cat2.eat(); //Find the object during runtime.
    //Found that the object actually is a cat object.
    //So cat2.eat() -> Cat.class's eat()

    Animal cat3 = new Animal("Vincent");
    cat3.eat();//Animal is eating

    //cat3.sleep();//violate rule 1

    //Cannot place a parent object to a child reference
    //Cat cat4 = new animal("Lucas");不可以將parent放置在child中

    //Example 1:
    Animal[] animals = new Animal[4];//Cat,dog,Pig
    animals[0] = new Cat1("Ar_B", 10);
    animals[1] = new Dog("Happy");
    animals[2] = new Pig("Piggy",2);
    animals[3] = new Animal("asd");//Set animal classs to be abstract class so that animal()obj cannot be new!!!!
    //but! animal[] can be new!!!!!!
    Cat1[] cats = new Cat1[3];
    cats[0] = new Cat1("123", 2);

    System.out.println(Arrays.toString(animals));

    //example 2:
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle1(Color.BLUE, 3.2);
    shapes[1] = new Triangle(2.2, 3.0, Color.BLUE);
    shapes[2] = new Square(Color.BLUE, 2.0);

    for(int i=0;i<shapes.length;i++){
      System.out.println("The shapes area : "+shapes[i].area());
    }
    for(Shape shape:shapes){
      System.out.println("area"+shape.area());
    }

    //Example 3:Downcast
    for(Shape shape:shapes){
      if(shape instanceof Circle1){//check if shape is instance of Circle??
        System.out.println(((Circle1)shape).getRadius());//rule 1
        Circle1 circle1 = (Circle1) shape;//similar to "double y =2.0; int x =(int) y;"
        System.out.println(circle1.getRadius());//Rule 1
      }else if(shape instanceof Square){
        Square square = (Square) shape;
        System.out.println(square.getSide());//comply woth the rule 1
      }
    }
    //Example 4:FOR INTERFACE
    Eatable cat4 = new Cat1("Tommy", 9);//Eatable decide what method can do,what cannot not do.!!!!!!
    cat4.eat();//Cat is eating ..
    //cat4.walk();

    Sleepable[] animals2 = new Sleepable[3];
    animals2[0] = new Cat1("Steve", 2);
    animals2[1] = new Dog("Owen");
    //animals2[2] = new Animal();//animal didnt implement Eatable
    animals2[1].sleep();
    animals2[0].sleep();
    //animal2[0].eat();


    Animal animal = new Cat1("ABC", 3);
    animal.eat();//Cat is eating
    animal = new Dog("jil");
    animal.eat();//Dog is eating
    //Hero heros = new Hero[3];

    //Polymorphism
    //Hero hero = new Archer();
    //hero.attack();//should have physic attack 
    //hero = new Mage();
    //hero.attack();//should have Magic attack 

    
  }

}
