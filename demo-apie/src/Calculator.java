public class Calculator {
  private int x;
  private int y;
  public Calculator(int x,int y){
    this.x = x;
    this.y =y;

  }
  public int sum(){
    return this.x + this.y;
  }

  public int sum(double thirdNumber){
    System.out.println("sum(double thirdNumber)");
    return this.x + this.y+ (int) thirdNumber;
  }

  public int sum(int thirdNumber){
    System.out.println("sum(int thirdNumber)");
    return this.x + this.y+ thirdNumber;
  }
  public static void main(String[] args) {
    Calculator c1 = new Calculator(3, 4);
    System.out.println(c1.sum());//7
    System.out.println(c1.sum(10));//17
    System.out.println(c1.sum(10.0));//17
    //Static Polymorphism
    //During compile time,java check the method by method sihnature
  }
}
