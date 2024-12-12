import java.util.Scanner;


//JDK vs Java Project(load built-in ,String,Primitives)
//proactively import non-built-in tools (Scanner)
public class DemoScanner {
  public static void main(String[] args){
    String s = "abc";
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input the number: ");
    int num = scanner.nextInt();
    // num = num*2;
    // System.out.println("Please input a String:");
    // String str = scanner.nextLine();
    // System.out.println("str:"+str);
    // for(int i =0;i<num;i++){//if num is 12-->>> i finally will be 11 ,total loop 12 times!!!!!!!!!
    //   System.out.println("Hello");
    // }



    //num --> number of days 
    // for loop 
    int totalMinutes =0;
    for(int i =0;i<num;i++){
      for(int j =0;j<24;j++){
        totalMinutes = totalMinutes+60;
      }
    }

    System.out.println("total Minutes :"+totalMinutes);
  }
}
