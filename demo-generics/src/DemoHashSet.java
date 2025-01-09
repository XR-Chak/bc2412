import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();//Similar to arrayList but cannot have duplicate item!!!!!
    strings.add("ABC");
    strings.add("IJK");
    System.out.println(strings.size());//2

    //Difference between Hashset and ArrayList
    System.out.println(strings.add("ABC"));//false
    System.out.println(strings.add("XYZ"));//true
    System.out.println(strings.size());//3, HashSet avoid duplicate item

    strings.remove("XYZ");
    System.out.println(strings.size());//2
    
    //No remove by index method
    int targetRemoveIndex =1;
    String targetRemoveString = null;
    int index =0;
    for(String s : strings){
      if (targetRemoveIndex == index) {
        targetRemoveString = s;
        break;
      }
      index++;
    }
    strings.remove(targetRemoveString);
  }
}
