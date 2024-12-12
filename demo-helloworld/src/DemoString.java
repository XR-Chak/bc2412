

public class DemoString {
  public static void main(String[] args){
    char x ='a';
    x = 1;//???????
    //x =true;
    x = 'x';
    // not ok! -->char x = 'o';
    //define a char value by single quote '' !
    //define a string value by double quote "" !
    //String is not a primative data type !!
    String password = "abcd1234!";
    String emailAddress = "abc@gmail.com";
    // + operation, only + operation
    //password = password + "!";
    System.out.println("helloworld");
    System.out.println(password);//abcdq1234

    // Java method (Instance method)
    //action/tools
    char result = password.charAt(0);//0 represents the first position of the string value
    System.out.println(result);//a 
    //! index start from zero to length-1
    System.out.println(password.charAt(8));// !
    //System.out.println(password.charAt(-1));//error
    //System.out.println(password.charAt(9));//error

    //equals()
   String s1 = "abc";
   String s2 = "abc";
   boolean result2 = s1.equals(s2);
   System.out.println(result2);
   //example:
   String s3 = "123";
   String s4 = "124";
   boolean result3 = s3.equals(s4);
   System.out.println("example :"+result3);

   String password2 = "helloworld";//index always start from 0!!!
   char lastChar = password2.charAt(password2.length()-1);
   System.out.println("lastChar is:"+lastChar);
   //length()
   
   int result4 = password.length();
   System.out.println(result4);

   //Empty string
   String emptyString = "";
   boolean isStringEmpty1 = emptyString.length()==0;
   boolean isStringEmpty2 = "".equals(emptyString);//asking if emptyString equals to ""
   System.out.println(isStringEmpty1+" "+isStringEmpty2);
   String s = "hello";
   System.out.println("hello".equals(s));//asking if s equals to "hello"
   System.out.println("hello".length());//5
   System.out.println("hello".charAt(2));//l                         
   //System.out.println(emptyString.charAt(0));

   //'c'.charAt()// Primitive has no method(tool)


   //isEmpty()
   String s5 = "abc";
   boolean isEmpty = s5.length()==0;
   System.out.println(isEmpty);
   System.out.println(s5.isEmpty());

   if (!s5.isEmpty()) {
    
   }
   
   System.out.println(s5.substring(0, 2));//ab
   String substr = s5.substring(0, 2);
   //s5's value doesn't change
   //substr is storing a new String value returned by "substring"
   System.out.println(substr); //ab
   System.out.println(s5.substring(0, s5.length()));//abc
   System.out.println(s5.substring(0,3));
   System.out.println(s5.substring(1));//bc
  }
}
