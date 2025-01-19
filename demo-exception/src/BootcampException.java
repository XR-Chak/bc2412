public class BootcampException extends RuntimeException{
  //Once u extends Exception family,your class become an exception class
  //you can now throw the object of this class
  private int count;
  private String kind = "IT";

  public BootcampException(int count){
    this.count = count;
  }

  public int getCount(){
    return this.count;
  }
  public static void main(String[] args) {
    BootcampException b1 =new BootcampException(99);
    throw new BootcampException(88);

 
    //throw new Cat3();//Class cat3() didn't extend Exception family, it cannot be thrown.
  }

  //Write a method to throw BootcampException
  public static Object throwMethod(BootcampException b){
    if (b.getCount()>10) {
      throw new BootcampException(10);
    }
    return null;
  }
}
