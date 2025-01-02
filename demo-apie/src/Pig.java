public class Pig extends Animal{
  //more attributes
  private boolean hasHair ;

  public Pig(){
    //implicitly calling super()
    //super();Animal()
    super("xyz");//Animal("xyz")
  }

  public Pig(String name){
    super(name);
  }

  public void sleep(){
    System.out.println("the pig is sleeping...");

  }
  public static void main(String[] args) {
    Pig pg = new Pig();
    Pig pg1 = new Pig("asd");

    pg.sleep();
    System.out.println(pg.getName());//null
    System.out.println(pg1.getName());//asd

    
  }
}
