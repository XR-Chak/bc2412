public class DemoSwitch {
  public static void main(String[] args){
    int x= 1;
    if(x==1){
      System.out.println("x=1");
    }else if(x==2){
      System.out.println("x=2");
    }else if(x == 3){
      System.out.println("x=3");//print
    }else{
      System.out.println("something else ...");
    }
    //switch 
    switch (x) {
      case 1://cannot do comparison operator!! checking x==?
        System.out.println("x=1");
        break;
      case 2:
        System.out.println("x=2");
        break;
      case 3:
        System.out.println("x=3");
        break;
      case 4:
        System.out.println("x=4");
        break;
      case 5:
        System.out.println("x=5");
        break;
      default:
        System.out.println("something else...");

    }

    char gender = 'C';//F, M( Well defined value range )
    switch(gender){
      case 'M':
      System.out.println("M is male");
      break;
      case 'F':
      System.out.println("F is female");
      break;
      default:
      System.out.println("something...");
    }
  }
}
