package questions;

import java.util.Scanner;

public class JavaQuest3 {
  /**
   * Expected Output:
   * 
   * Example 1: Input a month number: 2 Input a year: 2016
   * 
   * February 2016 has 29 days
   * 
   * Example 2: Input a month number: 12 Input a year: 2014
   * 
   * December 2014 has 31 days
   */

  // Program the number of days that the month of a year has.

  public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);

    int number_Of_DaysInMonth = 0;
    String monthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = input.nextInt(); // assume 1 - 12
    
    System.out.print("Input a year: ");
    int year = input.nextInt(); // > 0

    



    // The February has 29 days: (Every 4 years and the year cannot divded by
    // 100) or The year can divided by 400
    // otherwise the February should have 28 days only ..........365/366
    boolean leapYear = false;
    if (year%4==0&&year%100!=0||year%400==0) {
      leapYear = true;
    }else{
      leapYear = false;
    }

    if (month==1) {
      monthOfName="January";
      number_Of_DaysInMonth = 31;
    }else if (month==2) {
      monthOfName="February";
      if (leapYear) {
        number_Of_DaysInMonth = 29;
      }else{
        number_Of_DaysInMonth = 28;
      }
    }else if (month==3) {
      monthOfName="March";
      number_Of_DaysInMonth = 31;
    }else if (month==4) {
      monthOfName="Appril";
      number_Of_DaysInMonth = 30;
    }else if (month==5) {
      monthOfName="May";
      number_Of_DaysInMonth = 31;
    }else if (month==6) {
      monthOfName="June";
      number_Of_DaysInMonth = 30;
    }else if (month==7) {
      monthOfName="July";
      number_Of_DaysInMonth = 31;
    }else if (month==8) {
      monthOfName="August";
      number_Of_DaysInMonth = 31;
    }else if (month==9) {
      monthOfName="September";
      number_Of_DaysInMonth = 30;
    }else if (month==10) {
      monthOfName="October";
      number_Of_DaysInMonth = 31;
    }else if (month==11) {
      monthOfName="November";
      number_Of_DaysInMonth = 30;
    }else if (month==12) {
      monthOfName="December";
      number_Of_DaysInMonth = 31;
    }//can use switch

    switch (monthOfName) {
      case 1:
        
        break;
      case 2:
        if (leapYear) {
          
        }
      default:
        break;
    }


    System.out.println(
        monthOfName + " " + year + " has " + number_Of_DaysInMonth + " days");
  }

}