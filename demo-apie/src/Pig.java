//Class cannot extend more than Parent class

import java.util.Objects;

public class Pig extends Animal{
  //more attributes
  private int age;
  private Long asd;


  public Pig(){
    //implicitly calling super()
    //super();Animal()
    super("xyz");//Animal("xyz")
  }

  public Pig(String name,int age){
    super(name);
    this.age = age;
  }
  //Implicitly extend Object.class (Object.equals() -> check if they are same memory object)
  @Override
  public boolean equals(Object obj){
    //same object -> they must be same
    if(this == obj){
      return true;
    }if(!(obj instanceof Pig)){
      return false;
    }
    Pig pig = (Pig) obj;//from parent class to child class (int x = (int) 10L)
    return Objects.equals(pig.getAge(),this.age)
    && Objects.equals(pig.getName(),super.getName());
  }

  //Implicitly extend Object.class (Object.hashCode() -> check if they are same memory object)
  @Override
  public int hashCode(){
    return Objects.hash(this.age,super.getName());//hash -> generate a new int number representing the object
  }

  @Override
  public String toString(){
    return "Pig["//
    + "age=" + this.age //
    + ", name="+ super.getName()+"]";
  }

  public int getAge(){
    return this.age;
  }
  public void sleep(){
    System.out.println("the pig is sleeping...");

  }
  public static void main(String[] args) {
    Pig pg = new Pig();
    Pig pg1 = new Pig("asd",3);

    pg.sleep();
    System.out.println(pg.getName());//null
    System.out.println(pg1.getName());//asd
    Object obj = new Object();
    Pig myPig = new Pig("ABC", 3);
    Pig checkPig = new Pig("ABC", 3);
    //equals()
    if(myPig.getAge() == checkPig.getAge()&&myPig.getName()==checkPig.getName()){

    }
    if(myPig.equals(checkPig)){
      System.out.println("SAME");//after override,if they are having the same value of attribute, they should be the same.
    }else{
      System.out.println("NOT SAME");//before override ,because equal() implementation from Object.class
    }
    //toString()
    //hashCode()
    String s = new String("Hello");
    String s1 =new String("Hello");//check value only
    System.out.println(s.equals(s1));//true
    System.out.println(myPig.hashCode());
    System.out.println(checkPig.hashCode());

    System.out.println("hello".toString());//String.class override toString() method
    System.out.println(myPig);//Pig[age=3, name=ABC]
  }
}
