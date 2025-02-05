package com.example;

import static org.hamcrest.MatcherAssert.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
public class HamcrestTest {
  @Test
  void testBasic(){
    assertThat(Calculator.sum(1, 2), is(equalTo(3)));
    assertThat(10, is(greaterThan(9)));
    assertThat("Hello World",not(containsString("Hello")));
  }
}
