public class Worker {
   private static int workerCount =0;
   private Supermarket supermarket;
   private static boolean haveLicense = false;
   private int workerCount2 =0;
   
   public Worker(Supermarket supermarket){
    this.supermarket = supermarket;
    workerCount++;
    haveLicense = !haveLicense;
    workerCount2++;
   }



   //if read "private static" varible,we should use a static method
   public static int getWorkerCount(){
    return workerCount;
   }
   public int getWorkerCount2(){
      return workerCount2;
     }
   public void addWorker(){
      workerCount++;
   }

   public void moveIn(int quantity){
    this.supermarket.setAvailableStock(supermarket.getAvailableStock()+quantity);
   }

   public void moveOut(int quantity){
    this.supermarket.setAvailableStock(supermarket.getAvailableStock()-quantity);
   }
   public static void main(String[] args) {
      Supermarket s1= new Supermarket(0);
      Worker w3 = new Worker(s1);
      System.out.println(w3.haveLicense);
      w3.addWorker();//worker count is 2
      Worker w4 = new Worker(s1);//worker count is 3
      System.out.println(w4.getWorkerCount());//3
      System.out.println(w3.getWorkerCount2());//1
      System.out.println(w4.getWorkerCount2());//1
   }
}