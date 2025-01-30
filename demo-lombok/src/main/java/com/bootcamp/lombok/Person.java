package com.bootcamp.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// JDK(Java development kit) = dev library/Tool(have javac ) + JRE +JVM
// Dev Lib => javac ,class Library (Big decimal)
// Some of the library auto-imported by java Project(i.e. java.lang)
// But some of them have to be manually imported.
// Maven: download external (outside JDK) library from maven public (i.e. lombok)


// How Lombok get it work?
//Class Level annotation
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode // what if extends?
@Builder
public class Person {
  @ToString.Exclude
  public int age;

  public String name;


  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setAge(20);
    p1.setName("Peter");
    Person p2 = new Person(10, "Tommy");
    System.out.println(p2.getAge());
    System.out.println(p2.getName());

    Person p3 = new Person(10, "Tommy");
    System.out.println(p2.equals(p3));
    System.out.println(p2.hashCode() == p3.hashCode());
    Person p4 = Person.builder().name("Tommy").age(10).build();
    System.out.println(p4);
  }
}
