import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;


//Solution
//1.Native Data Structure (Vector)
//2.Lock the action (synchronized)
public class DemoThread4 {
  private List<Integer> integers;//Not thread-safe

  public DemoThread4(){
    this.integers = new Stack<>();//polymorphism
  }

  public synchronized boolean add(Integer integer){
    return this.integers.add(integer);//lock this line of code
  }

  // public ArrayList<Integer> getIntegers(){
  //   return this.integers;
  // }

  public int size(){
    return this.integers.size();
  }
  public static void main(String[] args) {
    DemoThread4 t4 = new DemoThread4();
    Runnable addToArrTask = ()->{
      for(int i=0;i<100000;i++){
      t4.add(1);
    }
    };
    
    Thread workerB = new Thread(addToArrTask);
    Thread workerC = new Thread(addToArrTask);
    workerB.start();//main thread initilaize thread (workerB) to execute the task.
    //The workerB execute the task only.
    workerC.start();

    //main thread
    try{
      workerB.join();//main thread wait until workerB complete the task
      workerC.join();//main thread wait until workerC complete the task
    }catch(InterruptedException e){

    }
    System.out.println(t4.size());
  }
}
