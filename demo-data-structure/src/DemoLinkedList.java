import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
  public static void main(String[] args) {//List have order!!!!
    LinkedList<String> strings = new LinkedList<>();
    strings.add("ABC");// add() belongs to collection family
    strings.add("DEF");
    strings.add("ABC");
    System.out.println(strings.size());//3
    strings.remove(0);
    System.out.println(strings);

    strings.remove("ABC");
    System.out.println(strings);

    strings.add("Oscar");
    strings.add("Jenny");
    strings.remove();//remove the head!!!
    System.out.println(strings);//[Oscar,Jenny]
    System.out.println(strings.contains("Jenny"));//true
    System.out.println(strings.contains("Vincent"));//false

    //contains(),add(),remove(Object),etc are common method for arrayList and LinkedList
    strings.isEmpty();//false



    strings.clear();
    System.out.println(strings.size());// 0

    //LinkedList advantages: add/remove head/tail
    //Array/ArrayList advantages: Point to the object directly if you know the position
    //Person.class (name)

    //List<Integer> ss = new ArrayList<>();
    List<Integer> ss = new LinkedList<>();
    ss.add(100);
    ss.add(1000);

    System.out.println("asdasdasdsad"+ss.size());
    //Becasue of Interface List, ss object can invoke add() at compile time.
    //During runtime, we found that the object is LinkedList,the add method will be the LinkedList one.
  
    //ss.remove();//Not ok ,List doesn't contain remove() method
    LinkedList<Integer> ss2 = (LinkedList<Integer>) ss;
    ss2.remove();
    
    List<Animal> animals = new ArrayList<>();
    // animals.add(new Panda());//100
    // animals.add(new Tiger("asd"));//1
    // animals.add(new Tiger("qwe"));//1
    for(Animal animal : animals){
      System.out.println(animal.run());
    }
    System.out.println(animals.size());//3
  }
}
