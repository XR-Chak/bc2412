public class DemoWrapperClass {
  public static void main(String[] args){
    int x=3;// x is a Primitive Type variable
    Integer x2 =x;//auto-box,obj, it have function by itself, Method is presentation!!!!!!!!!!!!!
    System.out.println(x2);//3
    System.out.println(x2.doubleValue());//3.0
    System.out.println(x2.longValue());//3
    System.out.println(x2);//3
    String s = "hello";
    System.out.println("hello".length());//5

    double d =3.3;
    Double d2 = d;//auto-box
    System.out.println(d2);//3.3
    System.out.println(d2.intValue());//3
    System.out.println(d2.longValue());//3
    float f = d2.floatValue();
    System.out.println(f);//3.3

    double d3 = d2.doubleValue();// un-box
    double d4 = d2.doubleValue();

    //char -> Charater 
    //boolean -> Boolean
    //byte -> Byte
    //short -> Short 
    //long ->Long
    //float -> Float

    char c = 'k';
    Character c1 = c;//auto box
    System.out.println(c1.compareTo('a'));// -1,0,1
    //0->equals
    Character c3 = 'c';
    System.out.println(c3.compareTo('a'));//2(ascii of 'c' >ascii of 'a')
    Character c4 = 'A';
    System.out.println(c4.compareTo('a'));//-32 (ascii of 'A' >ascii of 'a')
    
    int asciiOfA = 'A';//65
    int asciiOfa = 'a';//95
    System.out.println(asciiOfa - asciiOfA);//32
    System.out.println('a'-'A');//32 ,char value - char value -> int value -> int value

    char c5 = c4;//unbox
    System.out.println(c5);//A
    

    boolean b = true;
    Boolean b1 = b;
    System.out.println(b1);
    byte B = 127;
    Byte B1 = B;
    short sh = 1000;
    Short Sh = sh ;
    long l = 100;
    Long L = l;
    float f1= 0.2f;
    Float F = f;

    //byte -> Byte
    //short->Short
    //long -> Long
    //float ->Float
    
  }
}
