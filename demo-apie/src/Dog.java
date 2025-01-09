public class Dog extends Animal implements Keepalive{
  
  //Constructor (Class cannot inherit Parent constructor)
  public Dog(String name){
    super(name);//the super will point to the constructor of the parent class
    
  }

//getter

@Override
public void eat(){
  System.out.println("Dog is eating...");
}

@Override
public void sleep(){
  System.out.println("Dog is sleeping...");
}

@Override
public void drink(){
  System.out.println("Dog is drinking...");
}

//walk()
public void walk(){
    System.out.println("Dog is walking...");
}

public static void main(String[] args) {
  Dog dog = new Dog("happy");
  dog.eat();
  dog.drink();
  dog.sleep();
}
}
