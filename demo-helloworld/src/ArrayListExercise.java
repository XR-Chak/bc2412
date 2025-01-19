import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class ArrayListExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.
    ArrayList<Integer> a1 = new ArrayList<>();
    a1.add(10);
    a1.add(20);
    a1.add(30);
    a1.add(40);
    a1.add(50);
    System.out.println(a1);
    a1.remove(2);
    System.out.println(a1.size());
    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.
    ArrayList<String> a2 = new ArrayList<>();
    a2.add("Apple");
    a2.add("Banana");
    a2.add("Mango");
    a2.add("Orange");
    System.out.println(a2.contains("Apple"));
    if (!a2.contains("Grapes")) {
      a2.add("Grapes");
    }
    a2.set(2, "Peach");
    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.
    ArrayList<Integer> a3 = new ArrayList<>();
    a3.add(10);
    a3.add(20);
    a3.add(10);
    a3.add(30);
    a3.add(40);
    a3.add(20);
    a3.add(50);
    System.out.println("a3 :"+a3);
    HashSet<Integer> h1 = new HashSet<>();

    for(int i=0;i<a3.size();i++){
      System.out.println(a3.get(i));
      h1.add(a3.get(i));
    }
    System.out.println("Hashset is:"+h1);


    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.

    HashSet<String> h2 = new HashSet<>();
    h2.add("USA");
    h2.add("India");
    h2.add("China");
    h2.add("Japan");

    h2.add("Canada");
    System.out.println(h2.add("India"));
    System.out.println(h2);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of integers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.

    HashSet<Double> h3 = new HashSet<>();
    h3.add(1.1);
    h3.add(2.2);
    h3.add(3.3);
    h3.add(4.4);
    h3.add(5.5);
    System.out.println(h3.contains(3.3));
    h3.remove(2.2);
    System.out.println(h3.size());
    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.
    HashSet<Integer> h4 = new HashSet<>();
    h4.add(10);
    h4.add(20);
    h4.add(30);
    h4.add(40);
    HashSet h5 = new HashSet<>(); 
    h5.add(30);
    h5.add(40);
    h5.add(50);
    h5.add(60);
    ArrayList a4 = new ArrayList<>();
    for(int i=0;i<h4.size();i++){
      for(int j=0;j<h5.size();j++){
        if (h4.toArray()[i]==h5.toArray()[j]) {
          a4.add(h4.toArray()[i]);
        }
      }
    }
    System.out.println(a4);
    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.
    HashSet h6 = new HashSet<>();
    h6.add("Cherry");
    h6.add("Steve");
    h6.add("Chole");
    h6.add("Jenny");
    h6.add("Vicky");
    
    ArrayList a5 = new ArrayList<>();

    for(int i=0;i<h6.size();i++){
      a5.add(h6.toArray()[i]);
    }
    System.out.println(a5);

 

    System.out.println("asdasdasdasdasdasd:"+testing);

    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'
    Student s1 = new Student(1, "Alice");
    Student s2 = new Student(2, "Bob");
    Student s3 = new Student(3, "Charlie");
    ArrayList<Student>arrStudents = new ArrayList<>();
    arrStudents.add(s1);
    arrStudents.add(s2);
    arrStudents.add(s3);
    for(Student s:arrStudents){
      System.out.println("student ID: "+s.getID()+" student name:"+s.getNmae());
    }
    System.out.println(arrStudents.remove(s2));
    System.out.println(Student.searchById(1, arrStudents));
    ArrayList<Student> a7 = new ArrayList<>();
    for(int i=0;i<arrStudents.size();i++){
      if (arrStudents.get(i).getNmae().startsWith("A")) {
        a7.add(arrStudents.get(i));
      }
      
    }
    System.out.println(a7.get(0).name);
    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
   HashSet<Student> set1 = new HashSet<>();
   HashSet<Student> set2 = new HashSet<>();
   Student s4 = new Student(4, "David");
   set1.add(s1);
   set1.add(s2);
   set1.add(s3);

   set2.add(s2);
   set2.add(s3);
   set2.add(s4);

   
   for(int i=0;i<set1.size();i++){
    for(int j=0;j<set2.size();j++){
      if (set1.toArray()[i].equals(set2.toArray()[j])) {
        System.out.println(set1.toArray()[i].toString());
      }
    }
   }
  }

  public static class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id,String name){
      this.id = id;
      this.name = name;
    }

    public int getID(){
      return this.id;
    }

    public String getNmae(){
      return this.name;
    }

    @Override
    public boolean equals(Object obj){
      if (this == obj) {
        return true;
      }else if(!(obj instanceof Student)){
        return false;
      }
      Student s = (Student) obj;

      return Objects.equals(s.name, this.name) && Objects.equals(s.id, this.id);
    }

    @Override
    public String toString(){
      return "Student name is:"+this.getNmae()+". Student ID: "+this.getID();
    }

    public static String searchById(int id,ArrayList<Student> students){
      for(int i=0;i<students.size();i++){
        if (students.get(i).getID()==id) {
          return students.get(i).getNmae();
        }
      }
      return "Student not found!";
    }

    // getter, setter, etc.
  }
}
