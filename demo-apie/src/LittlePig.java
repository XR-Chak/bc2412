public class LittlePig extends Pig{
  
  public LittlePig(String name,int age){
      super(name, age);
  }

  public void fly(){
    System.out.println("the littlePig can fly");
  }

  @Override
  public void sleep(){
    System.out.println("the little pig is sleeping");
  }
}
