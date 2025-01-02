public class Dog extends Animal{
  
  //Constructor (Class cannot inherit Parent constructor)
  public Dog(String name){
    super(name);//the super will point to the constructor of the parent class
    
  }

//getter


//walk()
public void walk(){
    System.out.println("Dog is walking...");
}
public static void main(String[] args) {
  Dog dog = new Dog("Happy");
  dog.walk();
}
}
