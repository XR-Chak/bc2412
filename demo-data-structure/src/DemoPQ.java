import java.util.Comparator;
import java.util.PriorityQueue;

public class DemoPQ {

  public static class Person{
    private int age;

    public Person(int age){
      this.age = age;
    }

    public int getAge(){
      return this.age;
    }

    public boolean isElderly(){
      if (this.getAge()>65) {
        return true;
      }
      return false;
    }

    @Override
    public String toString(){
      return "Person age: "+this.age;
    }
  }

  public static class sortByElderly implements Comparator<Person> {
    @Override
    public int compare(Person p1,Person p2){
      if (p1.isElderly() && !p2.isElderly()) {
        return -1;
      }
      else if (!p1.isElderly() && p2.isElderly()) {
        return 1;
      }
      return -1;
    }
    
  }
  public static void main(String[] args) {
    //Queue
    PriorityQueue<String> pq = new PriorityQueue<>();
    pq.add("Vincent");
    System.out.println(pq);
    pq.add("Oscar");
    System.out.println(pq);
    pq.add("Lucus");
    pq.add("ABC");
    System.out.println(pq);//[Lucas,Vincent,Oscar](No ordering)
    System.out.println(pq.size());//3
    System.out.println(pq);//[Lucus, Vincent, Oscar] (No ordering)

    //fOR POLL(), Ordering -> String natural order
    System.out.println("peekkkkkkk"+pq.peek());//ABC
    System.out.println(pq.poll());//Lucus  Poll時先會ordering!!!!!!
    System.out.println(pq.poll());//Oscar
    System.out.println(pq.poll());//Vincent

    PriorityQueue<Person> pq2 = new PriorityQueue<>(new SortByAge());
    Person p1 = new Person(88);
    Person p2 = new Person(1);
    Person p3 = new Person(99);
    Person p4 = new Person(65);
    Person p5 = new Person(3);

    pq2.add(p1);
    pq2.add(p2);
    pq2.add(p3);
    pq2.add(p4);
    pq2.add(p5);
    System.out.println(pq2);//no ordering
    System.out.println(pq2.poll());//ordered
    System.out.println(pq2);//ordered

    PriorityQueue<Person> pq3 = new PriorityQueue<>(new sortByElderly());
    pq3.add(p1);
    pq3.add(p2);
    pq3.add(p3);
    pq3.add(p4);
    pq3.add(p5);

    System.out.println(pq3);
    System.out.println(pq3.poll());
    System.out.println(pq3.poll());
  }
}
