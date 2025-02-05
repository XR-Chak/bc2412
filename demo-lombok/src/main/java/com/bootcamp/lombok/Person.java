package com.bootcamp.lombok;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
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
    int[] asd = new int[]{1,2,4,1};
    Arrays.sort(asd);
    System.out.println(Arrays.toString(asd));
    int a = 121;
    String qwe = String.valueOf(a);
    System.out.println(qwe.length());
    System.out.println(Integer.parseInt(qwe));
    int s =123;
    System.out.println(Math.floor(a/2));
    int[] asd1 = new int[]{-1,2,2,-1};
    int[] asd2 = new int[]{2,2};
    asd1 = asd2;
    System.out.println(Arrays.toString(asd1));
    System.out.println(7/2);
    HashMap<Integer,Integer> map = new HashMap<>();
    String c = "123";
    char test = c.charAt(1);
    String test2 = ""+test;
    System.out.println(c.indexOf("s"));
    System.out.println(c.toCharArray().toString());
   System.out.println(map.size());
   String[] test3 = "asdasd asd".split(" ");
   System.out.println(Arrays.toString(test3));

   
  }
}
