import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoDeque {//水管
  public static void main(String[] args) {
    Deque<String> strings = new LinkedList<>();
    strings.add("Lucas");//add last
    strings.add("Vincent");
    strings.add("Oscar");
    strings.addFirst("Jenny");
    System.out.println(strings);//[Jenny, Lucas, Vincent, Oscar]
    strings.poll();// Jenny, poll first()
    System.out.println(strings);//[Lucas, Vincent, Oscar]
    System.out.println(strings.pollLast());//Oscar
    System.out.println(strings.peek());//peekFirst,Lucas,peek ==>just look at the first element not take it out.
    System.out.println(strings.peekLast());//Vincent

    //Support for loop
    //support remove
    //contains
    
    //Practise ArrayDeque
    Deque<String> ss2 = new ArrayDeque<>();
    Queue<String> ss3 = new ArrayDeque<>();

    
   }
}
