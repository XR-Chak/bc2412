package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Test java file name should be with "test" or "tests" suffix
class StaffTest {
  @Test
  void testStaff_GetterSetter(){
    Staff s1 = new Staff();
    Assertions.assertEquals(0, s1.getAge());
    s1.setAge(18);
    Assertions.assertEquals(18, s1.getAge());
  }

  @Test
  void testStaff_Constructor(){
    Staff s = new Staff("asd", 18);
    Assertions.assertEquals("asd", s.getName());
    Assertions.assertEquals(18, s.getAge());
  }

  @Test
  void testStaffEqual(){
    Staff s1 = new Staff("Steven",30);
    Staff s2 = new Staff("Steven", 30);
    Assertions.assertEquals(s1, s2);
  }

  @Test
  void testStaffToString(){
    Staff s1 = new Staff("Steven",30);
    Assertions.assertEquals("Staff(name=Steven, age=30)", s1.toString());
  }
}
