package com.example;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class UppercaseMatcher extends TypeSafeMatcher<String> {
  //Regular expression = the rule of String

  public static UppercaseMatcher containUppercaseOnly(){
    return null;
  }
  @Override
  public boolean matchesSafely(String item){
    return item.matches("[A-Z]+");
  }
  @Override
  public void describeTo(Description description){//pass by reference
    description.appendText("Contain Uppercase Only!!");
  }
}
