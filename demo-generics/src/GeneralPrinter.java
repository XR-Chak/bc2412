//Generic Design -> Reduce number of class
public class GeneralPrinter<T> {//<T> present the scope of "T" inside the class
  private T value;

  public GeneralPrinter(T value){
    this.value = value;
  }

  public T getValue(){
    return this.value;
  }

  public String print(){
    return "This is " + this.value.toString();
  }
  public static void main(String[] args) {
      GeneralPrinter<Integer> printer = new GeneralPrinter<Integer>(Integer.valueOf(3));

      GeneralPrinter<Object> printer2 = new GeneralPrinter<Object>(Integer.valueOf(3));
      Object obj =3;
      if(obj instanceof Integer){
        Integer integer = (Integer) obj;
        System.out.println(integer.compareTo(2));//true
      }
  }
}
