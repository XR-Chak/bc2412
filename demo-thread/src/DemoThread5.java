import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DemoThread5 {
  private Map<Integer,String> map; //HashMap is not thread-safe
  

  public DemoThread5(){
    //this.map = Collections.synchronizedMap(new HashMap<>());
    this.map =new Hashtable<>();//HashMap = Array + LinkedList
  }

  public String put(Integer key,String value){
    return this.map.put(key,value);
  }

  public int size(){
    return this.map.size();
  }
  public static void main(String[] args) {
    DemoThread5 central = new DemoThread5();
    //put(i,)
    //0-1000000
    Runnable putEntryTask1 = ()->{
      for(int i=0;i<100000;i++){
        central.put(i,"abc");
      }
    };

    Runnable putEntryTask2 = ()->{
      for(int i=100000;i<200000;i++){
        central.put(i,"abc");
      }
    };

    Thread workerB = new Thread(putEntryTask1);
    Thread workerC = new Thread(putEntryTask2);

    workerB.start();
    workerC.start();

    try {
      workerB.join();
      workerC.join();
    } catch (Exception e) {
      
    }
    System.out.println(central.size());
  }
}
