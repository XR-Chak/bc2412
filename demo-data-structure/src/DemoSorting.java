import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoSorting {
  public static void main(String[] args) {
    //bubble sort(Nested loop)

    int x = 10;
    List<Integer> integers = Arrays.asList(1,3,10,-4,2);
    System.out.println(integers);
    Collections.sort(integers);
    System.out.println(integers);//[-4, 1, 2, 3, 10]
    int[] arr = new int[]{10,2,9};
    allZero(arr);
    System.out.println(arr);//[0,0,0]

    //In Java, array & all custom types are always pass by reference.
    //primitive ,wrapper class & String are always pass by value(a copy of value)
    Book book = new Book("Sun");
    changeBookName(book);//pass by book reference
    System.out.println(book);
    
    //Primitives
    int a =3;
    int b =4;
    System.out.println(sum(a, b));//300,passing a copy of values to the method
    System.out.println(a);//3,but not 100,because we pass by value for primitives
    System.out.println(b);//4,but not 200,because we pass by value for primitives

    BigDecimal z = BigDecimal.valueOf(11);
    BigDecimal v = BigDecimal.valueOf(0.3);
    System.out.println(sumBigDec(z,v ));
    System.out.println(z);//Big decimal also pass by value ,so original one will not change!!!!!
    System.out.println(v);
  } 
  public static int sum(int x,int y){
    x =100;
    y =200;
    return x+y;
  }
  public static String concat(String x,String y){
    return x.concat(y);
  }

  //overflow -> int*int ->int
  //long * long ->long-> Long (avoid overflow)
  public static Long multiply(int x, int y){
    return (long) x * (long) y;
  }

  public static void allZero(int[] arr){//pass by object reference
    for(int i=0;i<arr.length;i++){
      arr[i] =0;
    }
  }

  public static void changeBookName(Book book){
    book.setName("hello");
  }

  public static BigDecimal sumBigDec(BigDecimal x,BigDecimal y){
    x = BigDecimal.valueOf(900);
    y = BigDecimal.valueOf(100);
    return x.add(y);
  }

  public static void addBigDecimal(BigDecimal original ,BigDecimal delta){
    //Can you revise the value inside a BigDecimal Object?
    original.add(delta);//always return a new BigDecimal Object
  }
}
