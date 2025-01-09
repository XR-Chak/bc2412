public class Calculator<T extends Number> {//Byte,Short,Integer,Long,Float,Double

  //If we achieve the same purpose without generics,
  //ByteCalculator.class
  //ShortCalculator.class
  //IntegerCalculator.class
  //LongCalculator.class
  //FloatCalculator.class
  //LongCalculator.class
  //NumberCalculator.class

  private T x;
  private T y;

  public Calculator(T x ,T y){
    this.x = x;
    this.y = y;
  }


  public Number sum(){
    if (this.x instanceof Byte) {
      return (Byte) this.x + (Byte) this.y;
    }else if(this.x instanceof Short){
      return (Short) this.x + (Short) this.y;
    }else if(this.x instanceof Integer){
      return (Byte) this.x + (Byte) this.y;
    }else if(this.x instanceof Long){
      return (Byte) this.x + (Byte) this.y;
    }else if(this.x instanceof Float){
      return (Byte) this.x + (Byte) this.y;
    }else if(this.x instanceof Double){
      return (Byte) this.x + (Byte) this.y;
    }
    return null;
  }
  public static void main(String[] args) {
    Calculator<Byte> calculator = new Calculator<Byte>(Byte.valueOf("10"), Byte.valueOf("20"));

    Calculator<Number> calculator2 = new Calculator<Number>(Byte.valueOf("10"), Short.valueOf("20"));
  }
}
