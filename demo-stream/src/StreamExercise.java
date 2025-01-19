import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise {
  public static void main(String[] args) {
    // 1. Basic Stream Operations
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
    // sort the result in descending order.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [100, 64, 36, 16, 4]
    List<Integer> newNumbers = numbers.stream().filter(e->e%2==0).map(e->e*e).sorted((e1,e2)->e1>e2?-1:1).collect(Collectors.toList());
    //List<Integer> newNumbers2 = numbers.stream().filter(e->e%2==0).map(e->e*e).sorted((e1,e2)->e1>e2?-1:1).toList();
    System.out.println(newNumbers);
    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    List<String> names =
        Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    // // Output: [Alice, Annie, Alex]
    List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
    System.out.println(newNames);
    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);
    // Optional<Integer> box = numbers2.stream().max(null);
    // int maxNum = Integer.MIN_VALUE;
    // if(box.isPresent()){
    //   maxNum = box.get();
    // }
    // System.out.println(maxNum);
    // int minNum = numbers2.stream().min(null).orElse(-1);
    // Output: Max: 30
    // Output: Min: 5
    List<Integer> decendingNumbers2 = numbers2.stream().sorted((e1,e2)->e1>e2?-1:1).toList();
    System.out.println(decendingNumbers2);
    System.out.println("Max:"+decendingNumbers2.get(0));
    System.out.println("Min:"+decendingNumbers2.get(decendingNumbers2.size()-1));
    // 4. Mapping to a List of Lengths
    // Task: Given a list of strings, map each string to its length and collect the lengths into a
    // List<Integer>
    List<String> words = Arrays.asList("apple", "banana", "pear");
    // Output: [5, 6, 4] (List)
    List<Integer> wordsInt = words.stream().map(e->e.length()).toList();
    System.out.println(wordsInt);
    // 5. Counting Elements
    // Task: Given a list of strings, count how many strings have a length greater than 3.
    List<String> words2 = Arrays.asList("hi", "hello", "world", "java", "stream");
    // Output: 4
    List<String> words2new = words2.stream().filter(e->e.length()>3).toList();
    System.out.println(words2new.size());



    // Here are more advanced exercises focused on using filter, map, and collect to transform data into
    // different data structures:
    // 6. Filtering and Collecting to a Set
    // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a
    // Set.
    List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
    // // Output: [15, 20]
    Set<Integer> newNumbers2 = numbers3.stream().filter(e->e>10).collect(Collectors.toSet());
    System.out.println(newNumbers2);



    // 7. Mapping to a Map (Key-Value Pairs)
    // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
    // where the key is the student's name and the value is their score.
    // Create Student Class
    
    // new Student("Alice", 85)
    // new Student("Bob", 75)

    //Java 9:List.of() you can readthe objects, but you cannot add/remove/modify
    //It is an immutable List Object
    List<Student> students = List.of(new Student("Alice", 85),new Student("Bob", 75));
    // students.get(0).setScores(80);
    
    Map<String,Integer> studentMap = students.stream().collect(Collectors.toMap(stu->stu.getName(), stu->stu.getScores()));
    System.out.println(studentMap);
    // Output: {Alice=85, Bob=75}

    // 8. Filtering and Mapping to a List of Objects
    // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
    // map them to a list of their names.

    // Create Employee Class
    // new Employee("John", 65000)
    // new Employee("Jane", 55000)
    // new Employee("Doe", 40000)
    List<Employee> employees = Arrays.asList(new Employee("John", 65000),new Employee("Jane", 55000),new Employee("Doe", 40000));
    List<String> employeeList = employees.stream().filter(e->e.getSalary()>50000).map(e->e.getName()).toList();
    // Output: [John, Jane]
    System.out.println(employeeList);
    // 9. Grouping and Collecting to a Map (Group by Age)
    // Task: Given a list of people with their names and ages, group them by age and collect the result
    // into a Map<Integer, List<String>> where the key is the age and the value is a list of names.

    // Create Person Class
    // new Person("Alice", 30),
    // new Person("Bob", 25),
    // new Person("Charlie", 30)
    List<Person> persons = Arrays.asList(new Person("Alice", 30),new Person("Bob", 25),new Person("Charlie", 30));
    Map<Integer, List<String>> groupedByAge = persons.stream().collect(Collectors.
    groupingBy(e->e.getAge(),Collectors.mapping(Person::getName, Collectors.toList())));
    
    System.out.println(groupedByAge);
    
    //Map<Integer,List<String>> nestedMap = persons.stream().collect(Collectors.toMap(s->s,))
    // // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)


    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    // Task: Given a list of Staff with their names and genders, partition them into two groups: male
    // and female, and collect the result into a Map<Boolean, List<Person>>.

    // Create Staff Class
    // new Staff("Alice", Gender.Female)
    // new Staff("Bob", Gender.Male)
    // new Staff("Charlie", Gender.Male)
    List<Staff> staffs = Arrays.asList(new Staff("Alice", Gender.Female),new Staff("Bob", Gender.Male),new Staff("Charlie", Gender.Male));
    
    
    Map<Boolean,List<String>> resultMap = staffs.stream().collect(Collectors.
    partitioningBy(e->e.getGender().getVal()==1,Collectors.mapping(Staff::getName, Collectors.toList())));
    System.out.println(resultMap);
    // // Output: {false=[Alice], true=[Bob, Charlie]} (Map)

    // 11. Filtering, Mapping, and Collecting to a List
    // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers
    // by 2, and collect the result into a List.

    List<Integer> numbers4 = Arrays.asList(5, 15, 20, 7, 30);
    List<Integer> newNumbers4 = numbers4.stream().filter(e->e>=10).map(e->e*2).collect(Collectors.toList());
    System.out.println(newNumbers4);
    // Output: [30, 40, 60]

    // 12. Mapping to a Custom Object and Collecting to a List
    // Task: Given a list of names and a constant default value, map each name to a Person object (name
    // and default value for age) and collect the result into a list.

    List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie");
    int defaultAge = 30;
    List<Person> q12List = names1.stream().map(e->new Person(e, defaultAge)).collect(Collectors.toList());
    System.out.println(q12List);
    
    // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]

    // 13. Mapping and Collecting to a Deque
    // Task: Given a list of words, map each word to its uppercase form and collect the result into a
    // Deque.

    List<String> words1 = Arrays.asList("hello", "world", "java");
    ArrayList<String> newWords1 = (ArrayList<String>) words1.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
    Deque<String> dequeOfnewWords1 = new LinkedList<>(newWords1);
    System.out.println(dequeOfnewWords1);
    // Output: [HELLO, WORLD, JAVA] (Deque)

    // 14. Transforming and Collecting to an Array
    // Task: Given a list of integers, square each number and collect the result into an array.

    List<Integer> numbers55 = Arrays.asList(1, 2, 3, 4);
    List<Integer> newNumbers55 = numbers55.stream().map(e->e*e).toList();
    Integer[] numbers55Arr = newNumbers55.toArray(new Integer[0]);
    System.out.println(Arrays.toString(numbers55Arr));
    // Output: [1, 4, 9, 16]

    // 15. Map and Reduce
    // Task: Given a list of products with their prices, use the map and reduce methods to calculate the
    // total price of all products.

    // Create Product Class
    // new Product("Book", 10)
    // new Product("Pen", 5)
    // new Product("Notebook", 7)
    List<Product> products = Arrays.asList(new Product("Book", 10),new Product("Pen", 5),new Product("Notebook", 7));
    Integer reduced = products.stream().map(e->e.getPrice()).reduce(0, (a,b)->a+b);
    System.out.println(reduced);
    // Output: 22

    // 16. Grouping
    // Task: Given a list of employees with their department names, use groupingBy method to group the
    // employees by department.

    // Create Worker Class
    // new Worker("Alice", "HR")
    // new Worker("Bob", "IT")
    // new Worker("Charlie", "HR")
    // new Worker("David", "IT")
    List<Worker> employees1 = Arrays.asList(new Worker("Alice", "HR"),new Worker("Bob", "IT")
    ,new Worker("Charlie", "HR"),new Worker("David", "IT"));

    Map<String,List<String>> mapOf16 = employees1.stream().collect(Collectors.
    groupingBy(e->e.getDepartment(),Collectors.mapping(e->e.getName(), Collectors.toList())));
    System.out.println(mapOf16);

    // Output: {HR=[Alice, Charlie], IT=[Bob, David]}

    // 17. Parallel Streams
    // Task: Given a list of numbers, use a parallel stream to calculate the sum of all elements.
    List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Integer ans17 = numbers5.stream().reduce(0, (a,b)->a+b);
    System.out.println(ans17);
    // Output: 55


    // 18. FlatMap
    // Task: Given a list of lists of numbers, flatten them into a single list and filter only the
    // numbers greater than 5.

    List<List<Integer>> listOfIntegers = Arrays.asList( //
        Arrays.asList(1, 2, 3), //
        Arrays.asList(4, 5, 6), //
        Arrays.asList(7, 8, 9) //
    );

    List<Integer> flatlistOfIntegers = listOfIntegers.stream().flatMap(e->e.stream())
    .filter(e->e>5).collect(Collectors.toList());
    System.out.println(flatlistOfIntegers);
    // Output: [6, 7, 8, 9]


    // 19. Distinct and Sorting
    // Task: Given a list of strings with some duplicates, remove the duplicates and return the result
    // in alphabetical order.

    List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
    // Output: [apple, banana, grape, orange]
    
    List<String> fruitsByORder = fruits.stream().distinct().sorted((a,b)->a.compareTo(b)<0?-1:1).collect(Collectors.toList());
    System.out.println(fruitsByORder);


    // 20. Partitioning By
    // Task: Given a list of Childrens with their scores, partition the Childrens into passing and failing
    // groups (pass if score >= 50).
    // Create Student first.
    
    // Create Children Class
    // new Children("Alice", 45)
    // new Children("Bob", 55)
    // new Children("Charlie", 40)
    // new Children("David", 70)
    List<Children> childrens = Arrays.asList(new Children("Alice", 45),new Children("Bob", 55)
    ,new Children("Charlie", 40),new Children("David", 70));

    Map<Boolean,List<String>> mapOfpassfailChildrens = childrens.stream().
    collect(Collectors.partitioningBy(e->e.getScore()>=50,Collectors.mapping(e->e.getName(), Collectors.toList())));
    System.out.println(mapOfpassfailChildrens);


    // Output: {false=[Alice, Charlie], true=[Bob, David]}

    // 21. Joining Strings
    // Task: Given a list of words, join them into a single string separated by commas.
    
    List<String> languages = Arrays.asList("Java", "Python", "Rust", "R", "Go");
    // Output: "Java, Python, Rust, R, Go"
    String languagesString = languages.stream().reduce((a,b)->a+", "+b).toString();
    System.out.println(languagesString);///////////////////////////////////////Optional[Java, Python, Rust, R, Go]
    
    
    // 22. Find First and Any
    // Task: Given a list of integers, find the first number that is divisible by 3.
    List<Integer> ages = Arrays.asList(4, 7, 9, 12, 16, 21);
    int first =0;
    for(int i=0;i<ages.size();i++){
      if(ages.get(i)%3==0){
        first = ages.get(i);
        break;
      }
    }
    System.out.println(first);
    // Output: 9

    // 23. Limit and Skip
    // Task: Given a list of numbers, skip the first 3 elements and return the next 5 elements.
    
    List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> range = elements.stream().filter(e->e>3&&e<9).toList();
    System.out.println(range);
    // Output: [4, 5, 6, 7, 8]
    //limit x



    // 24. Peek
    // Task: Given a list of integers, double each element and use the peek method to log the
    // intermediate results to the console.
    
    List<Integer> amounts = Arrays.asList(1, 2, 3, 4);
    // Intermediate output: 2, 4, 6, 8
    // Final Output: [2, 4, 6, 8]
    List<Integer> amounts2 = amounts.stream().map(e->e*2).toList();
    System.out.println(amounts2);
    
    // 25. Optional and Streams
    // Task: Given a list of strings, use Streams to find the first string longer than 4 characters.
    // Handle the case where no such string exists using Optional.
    
    List<String> animals = Arrays.asList("cat", "tiger", "panda", "dog");

    System.out.println(animals.stream().filter(e->e.length()>4).findFirst());
    // Output: Optional[tiger]

    List<String> animals2 = Arrays.asList("cat", "dog", "bird");
    // Output: Optional[null]
    System.out.println(animals2.stream().filter(e->e.length()>4).findFirst());//Optional.empty
    // 26. Custom Collector
    // Task: Create a custom collector that collects the elements of a stream and remove all duplicates
    
    List<Integer> duplicates = Arrays.asList(2, 1, 2, 3, 4, 3, 5, 5, 6);
    System.out.println(duplicates.stream().distinct().collect(Collectors.toSet()));
    // Output: [1, 2, 3, 4, 5, 6] (Set)

    // 27. String Length Calculation
    // Task: Given a list of strings, calculate the total number of characters in all the strings
    // combined.
    
    List<String> keywords = Arrays.asList("stream", "filter", "map", "sorted", "collect");
    String sumofLength = keywords.stream().reduce((a,b)->a+b).orElse("");
    System.out.println(sumofLength.length());
    // Output: 28

    //Aggregate function max(),min(),average(),sum()
  }

  public static class Student {
    private String name;
    private int scores;

    public Student(String name,int scores){
      this.name = name;
      this.scores = scores;
    }

    public String getName(){
      return this.name;
    }

    public int getScores(){
      return this.scores;
    }
    
    public void setScores(int scores){
      this.scores = scores;
    }
  }

  public static class Employee{
    private String name;
    private Integer salary;

    public Employee(String name, Integer salary){
      this.name = name;
      this.salary = salary;
    }

    public String getName(){
      return this.name;
    }

    public Integer getSalary(){
      return this.salary;
    }
  }

  public static class Person {
    private String name;
    private Integer age;

    
    @Override
    public String toString(){
      return "Person(name="+this.name+", age="+this.getAge()+")";
    }
    public Person(String name,Integer age){
      this.name = name;
      this.age = age;
    }

    public String getName(){
      return this.name;
    }

    public Integer getAge(){
      return this.age;
    }
    
  }

  enum Gender{
    Male(1),
    Female(0),;

    private final int val;

    private Gender(int val){
      this.val = val;
    } 

    public int getVal(){
      return this.val;
    }
  }

  public static class Staff {
    private String name;
    private Gender gender;

    public Staff(String name,Gender gender){
      this.name = name;
      this.gender = gender;
    }

    public String getName(){
      return this.name;
    }

    public Gender getGender(){
      return this.gender;
    }
    
  }

  public static class Product{
    private String name;
    private int price;

    public Product(String name,int price){
      this.name = name;
      this.price = price;
    }

    public String getName(){
      return this.name;
    }

    public int getPrice(){
      return this.price;
    }
  }

  public static class Worker{
    private String name;
    private String department;

    public Worker(String name, String department){
      this.name = name;
      this.department = department;
    }

    public String getName(){
      return this.name;
    }

    public String getDepartment(){
      return this.department;
    }
  }

  public static class Children {
    private String name;
    private int score;

    public Children(String name,int score){
      this.name = name;
      this.score = score;
    }

    public String getName(){
      return this.name;

    }

    public int getScore(){
      return this.score;
    }
    
  }


}