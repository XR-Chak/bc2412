import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambda {
  public static void main(String[] args) {
    //Java Lambda Expression-> Stream,Optional
    //2014 Java 8
    //Stream,Optional
    //
    //stringLength -> functionName
    //define function
    //s(input)
    //s.length()(output)
    Function<String,Integer> StringLength = s -> s.length();//It is a run-time program !!!

    System.out.println(StringLength.apply("hello"));//5

    StringLength = s->s.length()+10;//skip "return" keyword, but it still return implicitly

    //Input (String & String) s1 & s2
    //Output (Integer)
    BiFunction<String,String,Integer> totalLength = (s1,s2) -> s1.length()+s2.length();
    System.out.println("asd".equals("asd"));
    System.out.println(totalLength.apply("hello", "world"));

    //SuperFunction (Interface) ,3 input 1 output
    SuperFunction<String,Integer,String,String> sf1 = (String name, Integer number,String level) -> "My name is:"+name+". My number is: "+number+" I am in level: "+level;

    System.out.println(sf1.respon("Ray", 1, "3A"));

    Consumer<String> printString = s-> System.out.println("The string is: "+s);
    printString.accept("asd");


    Supplier<Integer> randomMarkSixNumber = ()->new Random().nextInt(49)+1;
    System.out.println(randomMarkSixNumber.get());

    //Custom FunctionInterface Swimable
    //Java before 8: Interface -> Class -> Object 
    //Java after 8:Interface ->Object
    Swimable lucas = () -> System.out.println("Lucas is swimming");
    lucas.swim();//Lucas is swimming

    //Lambda Assumption: FunctionInterface -> one method only ->lambda expression

    //MathOperation
    MathOperation mathPlus = (int x,int y) -> x+y;
    MathOperation mathMinus = (int x,int y) -> x-y;
    MathOperation mathMultiply = (int x,int y) -> x*y;
    MathOperation mathDivide = (int x,int y) -> x/y;

    System.out.println(mathPlus.operate(10, 3));


    List<Book> books = new ArrayList<>();
    Book b1 = new Book(1);
    Book b2 = new Book(2);
    Book b3 = new Book(5);
    Book b4 = new Book(10);
    Book b5 = new Book(11);
    books.add(b1);
    books.add(b2);
    books.add(b3);
    books.add(b4);
    books.add(b5);
    for(Book book:books){
      System.out.println(book.getId());
    }
    books.forEach(b->System.out.println(b.getId()));
    //more than one line
    books.forEach(b ->{
      String message = "hello";
      System.out.println(b.getId()+" "+message);

    });

    Map<String,String> fruitMap = new HashMap<>();
    fruitMap.put("orange", "abc");
    fruitMap.put("apple", "def");
    fruitMap.forEach((key,value)->{
      System.out.println("The key is: "+key+". the Value is: "+value);
    });

    //Predicate
    //x > 8->boolean
    //x -> x>8 ->Predicate (formula)


    int x1 =-1;
    boolean isLargerthanEight = x1>8;//false

    Predicate<Integer> isLargerthan8 = x -> x>8;
    System.out.println(isLargerthan8.test(9));//true
    System.out.println(isLargerthan8.test(8));//false

    //check if the integer is even number
    Predicate<Integer> isEvenNumber = x -> x%2==0;

    System.out.println(isLargerthan8.and(isEvenNumber).test(10));//true
    System.out.println(isLargerthan8.or(isEvenNumber).test(9));//true

    
    books.removeIf(book -> book.getId()>10);
    System.out.println(books.size());

    BiFunction<String,String,String> appendHello = (oldV,newV)->oldV+newV;

    fruitMap.merge("lemon", "xyz", appendHello);
    fruitMap.merge("apple", "mno", appendHello);
    fruitMap.merge("orange", "yyy", appendHello);
    System.out.println(fruitMap);

    // Hashset<String> stringSet = new HashSet<>();
    SuperFunction<String,String,String,Integer> formula = (s1,s2,s3)->{
      int result = s1.length()+s2.length()+s3.length();
      return result;};

    System.out.println(formula.respon("asd", "hi", "opop"));

    UnaryOperator<String> toUpperCase = s -> s.toUpperCase();
    System.out.println(toUpperCase.apply("Hello"));//HELLO

    UnaryOperator<String> transform = s -> {
      if (s.length()>5) {
        return s.substring(0, 5);
      }else{
        if (s.startsWith("a")) {
          return "Wrong string";
        }
        else{
          return s;
        }
      }
    };
System.out.println(transform.apply("abcdef"));//abcde
System.out.println(transform.apply("abcde"));//Wrong string
System.out.println(transform.apply("edcba"));//edcba

  }

  public static class  Book {
    private int id;
    public Book(int id){
      this.id = id;

    }
    public int getId(){
      return this.id;
    }
    
  }

//Similar to Consumer.class
public void printString(String s){
  System.out.println("The String is"+s);
}

//Similar to supplier.class
public static int randomMarkSixNumber(){
  return new Random().nextInt(49)+1;//1-49
}
// similar to function.class
public static Integer stringLength(String s){
  return s.length();
}
}
