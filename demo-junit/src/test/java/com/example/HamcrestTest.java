package com.example;

import static org.hamcrest.MatcherAssert.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import java.util.Arrays;
import java.util.List;
public class HamcrestTest {
  @Test
  void testBasic(){
    assertThat(Calculator.sum(1, 2), is(equalTo(3)));
    assertThat(10, is(greaterThan(9)));
    assertThat("Hello World",not(containsString("!")));
    assertThat("Hello World",not(containsString("World")));
    String s = null;
    assertThat(s, nullValue());
    assertThat("Hello",notNullValue());
    String s1 = "hello";
    String s2 = "hello";
    assertThat(s1, is(sameInstance(s2)));
    assertThat(10, is(greaterThanOrEqualTo(10)));
    assertThat("", is(emptyString()));
  }

  //List
  @Test
  void testList(){
    List<String> names = Arrays.asList("John","Steve","Vincent");
    assertThat(names, hasItem("Steve"));
    assertThat(names, hasItems("Vincent","John"));

    //contains()-> with ordering
    assertThat(names,contains("John","Steve","Vincent"));
    assertThat(names,containsInAnyOrder("Vincent","Steve","John"));

    //hasSize()
    assertThat(names,hasSize(3));

    @Test
    void testNumber(){
      double tolerance = 0.01d;
      double actual = 3.14149d;
      assertThat(actual, not(closeTo(3.13149, tolerance)));
    }

    @Test
    void testInstance(){
      //Check
      Number num = new Double("3.0");
      assertThat(num, instanceOf(Double.class));

      //Chekc Child Class vs Parent Class
      assertThat(Long.class,typeCompatibleWith(Number.class));
      assertThat(String.class,typeCompatibleWith(CharSequence.class));
      assertThat(, false);
    }

    @Test
    void testCustomerMatcher(){
      assertThat("HELLO",UppercaseMatcher.containUppercaseOnly());
      assertThat("vincent009@gmail.com", false);
    }

  }
}
