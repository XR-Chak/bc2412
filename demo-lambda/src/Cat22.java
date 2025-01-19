public class Cat22 {
  private int age;
  private String name;
  private CatColor color;


  private Cat22(int age,String name,CatColor color){//private constructor, you cannot new a cat22 object by itself
    this.age = age;
    this.name = name;
    this.color = color;
  }

  public static Builder builder(){//this method is belong to cat22!!!!!!
    return new Builder();
  }

  public static class Builder {
    private int age;
    private String name;
    private CatColor color;
    public Builder(){

    }
    
    public Builder age(int age){
      this.age = age;
      return this;
    }

    public Builder name(String name){
      this.name = name;
      return this;
    }
    
    public Builder color(CatColor color){
      this.color = color;
      return this;
    }

    public Cat22 build(){
      return new Cat22(this.age, this.name, this.color);
    }
  }

 public static void main(String[] args) {
  Cat22 cat22 = Cat22.builder().name("Ar_B").age(8).color(CatColor.ORANGE).build();
  System.out.println(cat22.age);
 }

}
