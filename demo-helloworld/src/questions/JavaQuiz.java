package questions;

public class JavaQuiz {
  public static void main(String[] args) {
    String str = "";
    for(byte i=127;i<128;i++){
      if(i<0){
        continue;

      }
      str+=i;
    }
    System.out.println(str);
    System.out.println("hello".indexOf("he"));//BDCABDDCEA

  
  }
}
