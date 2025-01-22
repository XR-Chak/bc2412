import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2,3,4);
    numbers.forEach(e->{
      System.out.println(e);
    });

    //It implies you won't change the value passing to method
    numbers.forEach(System.out::println);

    Function<String,Integer> StringLength =(s)->{
      return s.length();
    };
    Supplier<Integer> randomNumber =()->new Random().nextInt(10);
    String s ="hello";
    Supplier<Integer> randomNumber2 = s::length;

    //static method
    Function<String,Integer> stringToInteger = Integer::valueOf;
    Function<String,Integer> stringToInteger2 = (str)->Integer.valueOf(str);
  }
}
