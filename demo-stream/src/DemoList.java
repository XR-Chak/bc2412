import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {
  public static void main(String[] args) {
    //New ArrayList<>()
    //List.of()
    //Arrays.asList()
    List<String> string1 = new ArrayList<>();
    string1.add("ABC");
    string1.add("DEF");

    //1. new arrayList<>()
    //Able to read/add /remove/modify
    List<String> strings2 = new ArrayList<>(Arrays.asList("ABC","DEF"));
    strings2.add("IJK");
    strings2.remove("DEF");
    strings2.set(0, "XYZ");

    //2.Arrays.asList()
    //Can only able to set and read value !!!! 
    //Cannot add and remove!!!!
    List<String> strings3 = Arrays.asList("ABC","DEF","IJK");
    // strings3.add("XYZ");
    // strings3.remove("IJK");
    strings3.set(0,"asddasd");
    strings3.get(0);
    //strings3.add("aaa"); <-----It will have error!!!!!!!!!1
    
    
    //3. List.of()
    //Able to read ONLY
    List<String> strings4 = List.of("ABC","DEF","IJK");
    System.out.println(strings4.get(2));
    
    List<Integer> ans4 = List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
    //ans4.add(1); <-------error!!!!!!
    System.out.println(ans4);
  }
}
