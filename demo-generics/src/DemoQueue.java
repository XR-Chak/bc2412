import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DemoQueue {
  public static void main(String[] args) {
    //FIFO
    Queue<String> strings = new LinkedList<>();//linkedlist --> add/remove head/tail
    //add last,remove first ==>Queue
    strings.add("Oscar");//add last
    strings.add("Vincent");//add last
    strings.add("Lucas");//add last
    System.out.println(strings);

    String head = strings.poll();//remove first
    System.out.println(head);
    System.out.println(strings);

    //Queue Interface hidden lots of functions of LinkedList
    strings.remove();//similar to poll()
    System.out.println(strings.contains("Lucas"));//true

    //Look up the head element, not pick up
    System.out.println(strings.peek());//Lucas
    System.out.println(strings.size());//1

    strings.offer("Jenny");
    
   Queue<String> qq = new ArrayBlockingQueue<>(3);//Length must be 3
   System.out.println(qq.offer("ABC"));//true
   System.out.println(qq.offer("DEF"));//true
   System.out.println(qq.offer("IJK"));//true
   System.out.println(qq.poll());
   System.out.println(qq.offer("XYZ"));//False

   //for each is suppirt queue
    for(String s : strings){
      System.out.println(s);
    }

    List<String> newStrings = new ArrayList<>();

    newStrings.add("AAA");
    newStrings.add("BBB");
    strings.addAll(newStrings);
    System.out.println(strings);//[Lucas,Jenny,AAA,BBB]
    
  }
}
