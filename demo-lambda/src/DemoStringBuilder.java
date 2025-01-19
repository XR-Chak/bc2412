import java.text.NumberFormat.Style;

public class DemoStringBuilder {
  public static void main(String[] args) {
    String s = "hello";
    s+="!!!";
    s+="???";

    System.out.println(System.currentTimeMillis());//1737012383795
    long before =System.currentTimeMillis();
    for(int i=0;i<100_000;i++){
      s+="!";
    }
    long after = System.currentTimeMillis();
    System.out.println(after-before);//1737012598579

    StringBuilder sb = new StringBuilder("");
    before = System.currentTimeMillis();
    for(int i=0;i<100_000;i++){
      sb.append("!");

    }
    System.out.println(sb.length());//1000000
    after = System.currentTimeMillis();
    System.out.println(after-before);//3ms

    sb = new StringBuilder("abcd");
    System.out.println(sb.reverse());
  
    System.out.println(sb.replace(0, 2, "yy"));
    sb.deleteCharAt(2);

    sb.setCharAt(2, 'o');
    System.out.println(sb);

    sb.insert(1, "!!!");
    System.out.println(sb);//y!!!yo

    
  }
}
