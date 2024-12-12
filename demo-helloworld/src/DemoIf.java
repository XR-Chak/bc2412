public class DemoIf {
  public static void main(String[] args){
    //If  -> check event -> event result
    int x = 3;
    if(x>2){//"x>2" is an event ->true/fasle
      System.out.println("x is >2.");
    }

    String s = "hello";
    if (s.length()>3){
     System.out.println("s is >3");
    }

    //equals(),charAt()
    if ("hello".equals(s)) {
      System.out.println("they are equals!");
    }
    if(s.charAt(s.length()-1)=='o'){
      System.out.println("char is \"o\"");
    }
    if(x>5){
      System.out.println("x>5.");

    }else{
      System.out.println("x<=5.");
    }

    int y=10;
    //check if y is an even number
    if(y%2==0){
      System.out.println("it is a even number!!");
    }
    
    if(y%2!=0){
      System.out.println("it is an odd number!");
    }

    if(y>3&&y%2==0){
      System.out.println("it is >3 and it is even number!!!");
    }

    char k = 'k';
    if(k =='k'){
      System.out.println("it is k.");
    }

    int age = 18;
    boolean isAdult = age >=18;
    
    if (isAdult == false) {
      System.out.println("it is not adult");
    }else{
      System.out.println("it is an adult");
    }

    int score = 75;
    //score >=90 ,Grade A
    //score between 80 and 89,grade B
    //score between 70 and 79,grade C
    //UNDER 70,grade F
    char grade = ' ';
    if(score>=90){
      grade = 'A';
    }else if (score>=80) {
      grade = 'B';
    }else if (score>=70) {
      grade = 'C';
    }else{
      grade = 'F';
    }
    System.out.println(grade);


  }

}
