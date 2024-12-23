public class Person {// blueprint - define a Person
    // attributes
    private String  name;
    private int age;
    private String emailAddress;
  
    // constructor (Not Method)
    // constructor is to create object
    public Person(String name, int age, String emailAddress) {
      this.name = name;
      this.age = age;
      this.emailAddress = emailAddress;
    }
  
    // getter (instance = object)
    // instance Method is able to return self value
    public String getName() {
      return this.name;
    }
  
    public int getAge() {
      return this.age;
    }
  
    public String getEmailAddress() {
      return this.emailAddress;
    }
  
    // setter
    // void -> return type (return nothing)
    public void setAge(int age) {
      this.age = age;
    }
  
    public static int sum(int x, int y) {
      return x + y;
    }
  
    
}
