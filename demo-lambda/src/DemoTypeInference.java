import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.lang.model.util.SimpleAnnotationValueVisitor9;

public class DemoTypeInference {

  public static void main(String[] args) {
    //java 10
    //Once you assign the value to var variable, the variable type will be defined as usual.
    var x =3;//x is an int varaiable
    //x =3.3;
    var y =3.3;
    y=3;// upcast
    System.out.println(y);//3.0

    List<List<String>> stringList = new ArrayList<>();
    stringList.add(Arrays.asList("abc","def"));
    stringList.add(Arrays.asList("vincent","Lucas"));

    for(var list: stringList){
      for(var str:list){
        System.out.println(str);
      }
    }

    //Stream flatMap
    //List<List<String>> ->List<String>
    List<String> result = stringList.stream().
    flatMap(e->e.stream()).collect(Collectors.toList());
    System.out.println(result);

    List<Customer> customers = Arrays.asList(new Customer("vincemt", "vlau")
    ,new Customer("lucas", "lll"));

    List<String> usernames = customers.stream()
    .map(e->e.getUsername()).collect(Collectors.toList());
    System.out.println(usernames);//[vlau,lll]

    //Find all nicknames of my customers
    List<Customer> customers2 = Arrays.
    asList(new Customer("vincemt", "vlau",Arrays.asList("asd","dsa","vvv")),
    new Customer("steven", "swong",Arrays.asList("ab","ijkm")),
    new Customer("Ray", "RayC",Arrays.asList("rrr","aaa","yyy")));
    List<String> nicknames = customers2.stream().map(e->e.getNickName())
    .flatMap(e->e.stream()).collect(Collectors.toList());

    List<String> nicknames2 = customers2.stream().filter(e->e.getName().length()>5)
    .flatMap(e->e.getNickName().stream()).filter(e->e.length()>3).collect(Collectors.toList());
    System.out.println(nicknames);//[asd, dsa, vvv, ab, ijkm, rrr, aaa, yyy]
    System.out.println(nicknames2);//[ijkm]
    
    
  }
  //Java doesn't allow defining var as variable type
  //because Java is Strong type (type has to be determined during compile time)
  // public static int sum(var x,var y){
  //   return x+y;
  // }
  
  //return type cannot be defined as var type
  //becasue caller doesn't know the return of sum2() method during compile time
  public static class Customer {
    private String name;
    private String username;
    private List<String> nicknames;

    public Customer(String name,String username,List<String> nicknames){
      this.name = name;
      this.username = username;
      this.nicknames = nicknames;
    }

    public Customer(String name,String username){
      this.name = name;
      this.username = username;

    }

    public String getUsername(){
      return this.username;
    }

    public List<String> getNickName(){
      return this.nicknames;
    }
    public String getName(){
      return this.name;
    }
  }
}
