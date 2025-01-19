public class DemoRecursion {
  public static void main(String[] args) {
    //1+2+3+4+5+6+7+8+9+10
    int sum=0;
    for(int i=1;i<=10;i++){
      sum = sum+i;
    }
    System.out.println(sum);//55

    //Recursion -->自己call自己
    System.out.println(sum(10));//55
    int n = 7;
    int result = n%2==0?productOdd(n-1):productOdd(n);
    System.out.println(result);//105
  }

  // 1*3*5*7*...*n
  public static int productOdd(int n){
    if (n%2==0) {
      n=n-1;
    }
    if (n==1) {
      return n;
    }
    return n*productOdd(n-2);
  }

  public static int sum(int value){
    //base criteria (exit)
    if(value<=1){
      return value;
    }
    //Invoke myself
    return value + sum(value-1);//10 + sum(9) -->10+9+sum(8)-->10+9+8+sum(7) -->10+9+..+1
  }
}
