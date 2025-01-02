public class Animal {
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
}
