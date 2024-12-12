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
    char gender ='M';
    //score >=90 ,Grade A
    //SCORE BETWEEN 85 AND 89 for female ,GRADE T
    //score between 87 and 89 for male, grade T
    //score between 80 and 84 for female,grade B
    //score between 80 and 86 for male, grade B
    //score between 70 and 79,grade C
    //UNDER 70,grade F
    char grade = ' ';

    if(score>=90){
      grade = 'A';
    }else if ((gender =='M'&&score>=87&&score<=89)||(gender =='F'&&score>=85&&score<=89)) {
      grade = 'T';
    }
    else if ((gender =='M'&&score>=80 && score <=86)||(gender=='F'&&score>=80&&score<=84)) {
      grade = 'B';
    }else if (score>=70 && score<=79) {
      grade = 'C';
    }else{
      grade = 'F';
    }
// Tets cases
//1.M 90
//2.F 90
//3.M 89
//4.M 87
//5.M 86
//6.F 87
//7.F 86
//8.F 85
//9.M 85
//10.M 79
//11.F 79 ->
//12.M 69 ->f
//13.F 69 ->f





    if(gender == 'M'){
      if(score>=90){
            grade = 'A';
          }else if (score>=87&&score<=89) {
            grade = 'T';
          }
          else if (score>=80 && score <=86) {
            grade = 'B';
          }else if (score>=70 && score<=79) {
            grade = 'C';
          }else{
            grade = 'F';
          }
    }else if(gender=='F'){
      if(score>=90){
        grade = 'A';
      }else if (score>=85&&score<=89) {
        grade = 'T';
      }
      else if (score>=80 && score <=84) {
        grade = 'B';
      }else if (score>=70 && score<=79) {
        grade = 'C';
      }else{
        grade = 'F';
      }
    }
    
    System.out.println(grade);


  }

}
