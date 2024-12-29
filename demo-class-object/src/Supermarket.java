public class Supermarket {
  private int availableStock;
  private Worker[] workers;

  public Supermarket(int availableStock){
    this.availableStock = availableStock;
  }

  public int getAvailableStock(){
    return this.availableStock;
  }

  public void setAvailableStock(int quantity){
    this.availableStock = availableStock;
  }

  // public void moveIn(int numOfstock){
  //   this.availableStock += numOfstock;
  // }

  // public void moveOut(int numOfstock){
  //   this.availableStock -= numOfstock;
  // }

  public static void move(Supermarket from,Supermarket to,Worker worker,int quantity,boolean isMoveIn){
    System.out.println(from+" "+to+" "+worker+" "+quantity+" "+isMoveIn);
  }//static method canot use this. keyword because static method should be used for any object
    //we can put the above method to a cat.java file to make a cat to do move method....
  public static void main(String[] args) {//main is the playgound
    //Multiple supermarkets
    Supermarket s1= new Supermarket(0);
    Worker worker1 = new Worker(s1);
    Worker worker2 = new Worker(s1);
    worker1.moveIn(30);
    worker2.moveOut(4);
    System.out.println(Worker.getWorkerCount());
    Supermarket s2 = new Supermarket(0);
    move(s1, s2, worker2, 0, false);
    //single supermarket scienario
    
  }
}
