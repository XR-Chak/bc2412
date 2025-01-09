public interface Walkable {
  //1. No instance varaible
  //2. All methods are abstract(interface = 100% abstract)
  //3. abstract method/everything in interface is Implicitly public
  //4. Support "static final" variable
  //5. No constructor
  //6. After Java 8,we have default and statc method

  int x =3;//Implicitly static final 
  void walk();//abstract method
  
  //After Java 8, we can use default instance method
  default void walkFaster(){
      System.out.println("A way to walk faster ...");
    }
    //After java 8,we can use static method in interface
    static int calculateDistance(){
      return -1;
    }
  public static void main(String[] args) {
    System.out.println(Walkable.x);
    //Walkable.x =4;  //the variable is static final
    //Walkable.walkFaster();
    System.out.println(Walkable.calculateDistance());
    
    
  }
}
