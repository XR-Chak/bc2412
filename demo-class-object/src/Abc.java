public class Abc {
  public static void main(String[] args) {
    int x = 3;
    System.out.println(x);
    int[] arr = new int[3];

    String person = "vincent";
    int personAge = 18;

    String person2 = "lucas";
    int personAge2 = 17;

    String[] names = new String[] {"vincent", "lucas"};
    int[] ages = new int[] {18, 17};

    Person p1 = new Person("vincent", 18, "vincent@gmail.com");
    System.out.println(p1.getName()); // vincent
    System.out.println(p1.getAge());
    System.out.println(p1.getEmailAddress());
    
    Person p2 = new Person("lucas", 17, "lucas@gmail.com");
    System.out.println(p2.getName()); // lucas
    System.out.println(p2.getAge());
    System.out.println(p2.getEmailAddress());

    Person p3 = p2;
    System.out.println(p3.getAge()); // 17
    System.out.println(p3.getName()); // lucas

    p2.setAge(30);//As p3 = p2, set p2 age will also change p3 age they are using the same object
    System.out.println(p2.getAge()); // 30
    System.out.println(p3.getAge()); // 30

    Person[] persons = new Person[] {p1, p2, new Person("dicky", 19, "dicky@gmail.com")};
    for (Person p : persons) {
      System.out.println(p.getName() + "," + p.getAge() + "," + p.getEmailAddress());
    }

    String s1 = "hello";
    String[] strings = new String[] {s1, "world"};

    double d1 = Double.valueOf(0.6f);
    System.out.println(d1);
    String asd = String.format(s1, "ASD");
    System.out.println(asd);
  }
}
