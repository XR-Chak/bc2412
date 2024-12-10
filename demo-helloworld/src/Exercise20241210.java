public class Exercise20241210{
  public static void main(String[] args){
    int test = 10;
    double priceOfApple = 7.3;
    double priceOfOrange = 6.5;
    int quantityOfApple = 3;
    int quantityOfOrange = 4;
    double totalAmount = priceOfApple*quantityOfApple+priceOfOrange*quantityOfOrange;
    System.out.println("totalAmount: "+totalAmount);

    int mathScore = 73;
    int engScore = 60;
    int historyScore = 61;
    double averageScore = (mathScore+engScore+historyScore)/3.0;
    System.out.println("averageScore is: "+averageScore);


    //(lower level type)byte->short->int->long(high level type)
    byte maxByte =127;
    
    //int value -> byte
    maxByte = (byte)(maxByte+2);//java: is it safe? not safe
    //byte value + int value -> int value
    //can we assign int to byte variable? (downcasting),downcasting is not allowed!!!

    System.out.println(maxByte);//overflow
    int x = maxByte;//Java: is it safe? it is safe

    byte minByte = -128;
    //minByte = minByte-1;
    int a = minByte-1;
    int b = maxByte+1;
    //! Java:(1) Compile time + Run time
    //(1) java file(.java)->class file(.class): java code ->byte code(~machine)
    //(1.1)compile fail. for example (missing; -> syntax error)
    //(1.2) compile success -> class file
    //(2) Java Virtual Machine(JVM) -> convert class file to machine code -> execute machine code
    
  }
}
