import java.util.Random;
import java.util.Scanner;

public class DemoWhileLopp {
  public static void main(String[] args){
    for(int i=0;i<3;i++){
      System.out.println(i);//0,1,2
    } 

    //! While loop vs for loop
    int j =0;//1.declare the counter outside the loop
    while (j<3) {//continue criteria
      System.out.println(j);//0!!!!!!!!!!!!!!!
      j++;//! 1.More flexible to control the j
      j++;
      j++;
    }

    String s ="hello";
    char target = 'e';
    int k =0;
    boolean found = false;
    int position =-1;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)==target){
        found = true;
        break;
      }
    }
    System.out.println(found);//true
    while (k<s.length()) {
      if(s.charAt(k)==target){
        position = k;
        System.out.println("the target is in: "+position);
        break;
      }
      k++;
    }

    int number = new Random().nextInt(3);//0-2，this method will not show up 3!!! only 0,1,2
    System.out.println(number);


    int marksix = new Random().nextInt(48)+1;//1-49 (0-48) + 1
    System.out.println(marksix);

    //int[] marksix = new int[6];
   
    //! game starts,bomb is 47
    //pls pick a number between 1 -100
    //user 4
    //pls pick a number between 5-100
    //user 67
    //pls pick a number between 5-66
    //user 47
    //bomb!
    //while ,scanner,random
    int minNum = 1;
    int maxNum =100;
    int bomb = new Random().nextInt(100)+1;//random 1-100
    Scanner scanner = new Scanner(System.in);
    System.out.println("please pick a number between 1-100 : "+bomb);
    int num = scanner.nextInt();
    while (num!=bomb) { //唔知幾時完就用while loop!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      while(num<minNum || num>maxNum){
        System.out.println("Invalid input number");
        num = scanner.nextInt();
      }
      if (num<bomb) {
        minNum = num+1;
        System.out.println("please pick a number between "+minNum+" - "+maxNum);
      }else if(num>bomb){
        maxNum = num-1;
        System.out.println("please pick a number between "+minNum+" - "+maxNum);
      }
      num = scanner.nextInt();
    }
    if (num ==bomb) {
      System.out.println("Bomb!!!!!!");
    }
  }
}
