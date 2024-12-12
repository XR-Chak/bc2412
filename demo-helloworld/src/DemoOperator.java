public class DemoOperator {
  public static void main(String[] args){
    //+1
    int x = 3;
    x = x+1;
    x++;
    ++x;
    x+=1;
    System.out.println(x);//7

    //-1
    int y =4;
    y=y-1;
    y--;
    --y;
    y-=1;
    System.out.println(y);//0

    //+2
    int b=20;
    b = b+2;
    b+=2;
    System.out.println(b);//24

    //-2
    int c=20;
    c = c-2;
    c-=2;
    System.out.println(c);//16

    //*=, /=
    int m = 5;
    m = m*2;
    m*=2;
    System.out.println(m);//20
    int u = 4;
    u = u/2;
    u /=2;
    System.out.println(u);//1

    int remainder = 10%3;
    System.out.println("remainder: "+remainder);

    // ++x vs x++(this will add x by 1 but it is the last step)
    int a = 8;
    int result1 = ++a +3;
    System.out.println(result1);//12
    //step1 : a become 9
    //step 2: a + 3 (9+3)
    //step3: assign 12 to reslut1
    
    /////////////////////////////////////

    int q = 8;
    int result2 = q++ +3;
    //the above can separte to belowVVVVV
    //int result2 = q+3;
    //q = q+1;
    
    System.out.println(result2);//11
    //step1: q +3 (8+3)
    //step2: q++, q become 9
    //step3: assign 11 to result2!!!!!!!

    //String +=
    String s = "hello";
    s+= "!";
    System.out.println(s);//hello!
    //int +double = double
    //String+ anything = String

    s+='a';
    System.out.println(s);//hello!a

    s+=1;
    System.out.println(s);//hello!a1

    s+= true;
    System.out.println(s);//hello!a1true

    int x10 =5;
    int y10 = 10;
    int z10 = x10+=3*y10;
    System.out.println(z10);//35

    int x1 = 3;
    int y1 =(x1++ +3)*x1++;//24
    System.out.println(y1);
    //step1: 3+3
    //step2: x1 become 4
    //step3: 6*4 =24
    //step4: assignment
    //step5: x1 become 5

    //example:
    int y2 = (x1++ +3)*++x1;
    System.out.println(y2);
    //step1: 5+3->8
    //step2: x1 become6
    //step3: ++x1 will execute first, x1 become 7
    //step 4: 8*7=56
  }
}
