import java.util.Optional;

public class DemoOptional {
  //Never use Optional type as a attribute type
  //first name still can be null, but what is this meaning?
  private Optional<String> firstName;//<--not a good design!!!!!


  public static void main(String[] args) {
    //caller
    //Advantage: Able to avoid null pointer
    Optional<String> result = concat("abc", "def");
    //isPresent
    if (result.isPresent()) {
      System.out.println(result.get());
    }
    else{
      System.out.println("It is null");
    }
  }

  //1.Optional can only be used as a return type of method
  //If you decided to have a return type of optional,
  //It implies the result may be null

  //If a/b is null, then result is null
  public static Optional<String> concat(String a,String b){
    if (a==null||b==null) {
      return Optional.empty();
    }
    return Optional.of(a.concat(b)) ;
  }

  //2. Never use optional as input parameters 
  //x and y still can be null(not safe)
  public static String concat(Optional<String> x,Optional<String> y){
    if (x==null||y==null) {
      return null;
    }
    if (!x.isPresent()||!y.isPresent()) {
      return null;
    }
    return x.get().concat(y.get());
  }
}
