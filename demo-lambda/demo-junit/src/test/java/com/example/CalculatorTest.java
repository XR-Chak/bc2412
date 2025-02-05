package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//! mvn compile :compile main code
//! mvn test :"mvn compile" + compile test code
//! mvn test: "mvn testCompile"+run all test cases
//! mvn package: "mvn test" + package jar
//! mvn install: "mvn package "+ install jar to m2

//mvn test -> locate "@Test"
public class CalculatorTest {
  //Unit test = Requires a framwork to compare the actual & expected result
  //Definition of Pass
  @Test
  void testSum(){
    //TC1: 1+2 =3
    //TC2: -1+3 =2
    //TC3: 0+0 = 0
    assertEquals(3, Calculator.sum(1, 2));
    assertEquals(2, Calculator.sum(-1, 3));
    assertEquals(0, Calculator.sum(0, 0));
    // if actual result != expected result,maven throw error
    // so that you cannot pass through the "test" cycle.
  }

  @Test
  void testMethodB(){
    assertEquals(24, Calculator.methodB(7));
  }
}
