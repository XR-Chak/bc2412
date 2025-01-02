public class DemoString {
  public static void main(String[] args) {
    //s ,s2 are the same object
    String s ="hello";//Literal pool
    String s2 = "hello";//Literal pool
    String s3 = s;//s3 and s pointing the same object
    String s4 = "hello!";
    String s5 = new String("hello");
    String s6 = String.valueOf("hello");//Leverage Literal Pool
    String s7 = new String("hello");


    //identityHashCode -> Object reference (address)
    System.out.println(System.identityHashCode(s3)); //112810359
    System.out.println(System.identityHashCode(s));  //112810359
    System.out.println(System.identityHashCode(s2));  //112810359
    System.out.println(System.identityHashCode(s4));  //2124308362
    System.out.println(System.identityHashCode(s5));  //146589023
    System.out.println(System.identityHashCode(s6));  //112810359
    System.out.println(System.identityHashCode(s7));  //1482968390


    //String is immutable 不可改(Purpose: Reduce risk)
    //Question after appending "?", is s still the same object? No
    s= s+"?";//it is a new object
    System.out.println(System.identityHashCode(s));//414493378

    //equals()-->check value 本身, == --> check 地址
    
    //If you use "==" for non-primitive, you are checking the object reference
    //s.equals() is checking the String value itself
    System.out.println(s == s2);//true
    System.out.println(s.equals(s2));//true
    System.out.println(s == s5);//false,this checking the object reference(地址)
    System.out.println(s.equals(s5));//true
    System.out.println(s5 == s7);//false


  }
}
