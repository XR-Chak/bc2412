public class Person {// blueprint - define a Person
    // attributes
    private String  name;
    private int age;
    private String emailAddress;
    private boolean isMale;
    private char gender;// F/M,!


    // constructor (Not Method)
    // constructor is to create object
    public Person(String name, int age, String emailAddress, char gender) {
      this.name = name;
      this.age = age;
      this.emailAddress = emailAddress;
      this.gender = gender;
    }
    public int getNameLength(){
      return this.name.length();
    }

    public boolean isElderly(){
      return this.age>65;
    }

    public boolean isMale(){
      return this.gender == 'M'?true:false;
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
  
    public static void main(String[] args) {
      
      Person p1 = new Person("Jimmy", 5, "Jimmy@gmail.com",'M');
      System.out.println(p1.isMale());//true
      System.out.println(p1.getName().length());//5
      System.out.println(p1.getNameLength());//5
      System.out.println(p1.isElderly());//false
      p1.setAge(66);
      System.out.println(p1.isElderly());
    }
}
