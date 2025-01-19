import java.util.Comparator;


public class SortByAge implements Comparator<DemoPQ.Person>{
    @Override
    public int compare(DemoPQ.Person person1,DemoPQ.Person person2){
      if (person1.getAge()>person2.getAge()) {
        return -1;
      }
      return 1;
    }

}
