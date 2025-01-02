import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    //compile time
    //run time -> p1.getAge()
    Person p1 =null;//
    //p1.getK();//compile error->p1 come from Person.class,and this class has No getK() method
    //p1.getAge();//compile ok ->p1 come from Person.class, and this class has getAge() method
    //Runtime error -> because p1 object reference finally cannot point to an object .

    String sentence = "hello world";
    String[] subsentence = sentence.split(" ");
    System.out.println(Arrays.toString(subsentence));
    
  }
}
