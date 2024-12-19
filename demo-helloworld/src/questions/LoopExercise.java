package questions;

import java.math.BigDecimal;
import java.util.Arrays;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    for(int i=0;i<6;i++){
      System.out.println("hello");
    }
    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    int num =0;
    int[] arr = new int[5];
    for(int i=0;i<5;i++){
      arr[i]=num;
      num++;
    }
    System.out.println(Arrays.toString(arr));
    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    for(int i=0;i<22;i++){
      if(i%2==0 && i!=0){
        System.out.println(i);
      }
    }
    // 4. Print the numbers, which can be divided by 3 or 5
    // Use: for loop + if
    for(int i=0;i<21;i++){
      if (i%3==0 ||i%5==0 ) {
        System.out.println(i);
      }
    }
    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    int sum =0;
    for(int i=0;i<16;i++){
      sum = sum+i;
    }
    System.out.println("print 0-15 sum: "+sum);
    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    int oddNum =0;
    int evenNum =0;
    int product =0;
    for(int i=0;i<11;i++){
      if (i%2==0) {
        evenNum = evenNum +i;
      }
      else{
        oddNum = oddNum +i;
      }
    }
    System.out.println("product: "+evenNum*oddNum);
    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    if (str7.contains("d")) {
      System.out.println("d is found.");
    }else{
      System.out.println("d is not found.");
    }
    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";
    boolean found = false;
    for(int i=0;i<3;i++){
      if (s8a.substring(i,i+2).equals(s8b)) {
        found = true;
      }
      else{
        found = false;
      }
    }
    if (found =true) {
      System.out.println("s8b is a substring.");
    }else{
      System.out.println("s8b is not a substring.");
    }

    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    int count =0;
    for(int i=0;i<s9.length();i++){
      if(s9.charAt(i)==c9){
        count++;
      }
    }
    System.out.println("count="+count);
    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    String[] newarr = new String[5];
    for(int i=0;i<arr10.length;i++){
          
        newarr[i]=arr10[i].replace('x', 'k');
    }
    for(int i=0;i<arr10.length;i++){
          
      arr10[i] = newarr[i]; 
  }
    System.out.println(Arrays.toString(arr10));
    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";
    int count1 =0;
    for(int i=0;i<s11.length();i++){
      if (s11.charAt(i)<97) {
        count1++;
      }
    }
    System.out.println(count1);
    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    for(int i=0;i<3;i++){
      for(int j=0;j<5;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    String s13 = "lrlaudbucp";
    int score=0;
    for(int i=0;i<s13.length();i++){
        switch (s13.charAt(i)) {
        case 'l':
          score++;
          break;
        case 'r':
        score+=3;
        break;
        case 'd':
          score+=2;
          break;
          case 'u':
          score+=4;
          break;
        default:
        score--;
          break;
      }
    }
    System.out.println("score:"+score);
    
    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];
    arr14[0]=1L;
    arr14[1]=4L;
    arr14[2]=9L;
    arr14[3]=-4L;
    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    long max =Integer.MIN_VALUE;
    long min =Integer.MAX_VALUE;
    for (int i=0;i<arr14.length-1;i++) {
      if (arr14[i]<arr14[i+1] && arr14[i]<min) {
        min = arr14[i];
      }
      if (arr14[i]>arr14[i+1] && arr14[i]>max) {
        max = arr14[i];
      }
    }
    System.out.println("min:"+min+"max:"+max);
    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.5
    float[] arr16 = new float[]{0.2f,0.3f,0.5f};
    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.6]

    BigDecimal a = BigDecimal.valueOf(0.2f).add(new BigDecimal(0.1));
    BigDecimal b = BigDecimal.valueOf(0.3f).add(new BigDecimal(0.1));
    BigDecimal c = BigDecimal.valueOf(0.5f).add(new BigDecimal(0.1));
    
    BigDecimal[] bigArr = new BigDecimal[]{a,b,c};
    System.out.println(bigArr);


    for (int i=0;i<arr16.length;i++) {
      arr16[i]+=0.1;
    }
    System.out.println(Arrays.toString(arr16));
    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    // Print "count name=2"
    int count2 =0;
    for (int i=0;i<arr18.length;i++) {
      if (arr18[i].equals(target)) {
        count2++;
      }
    }
    System.out.println("count name="+count2);
    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    int difference =0;
    String s19 = "40289";
    int minNum =-1;
    int maxNum =-1;
    for (int i=0;i<s19.length();i++) {
      for(int j=i+1;j<s19.length();j++){
        if (Math.abs(s19.charAt(i)-s19.charAt(j))>difference) {
        difference = Math.abs(s19.charAt(i)-s19.charAt(j));
          minNum = i;
          maxNum = j;
          System.out.println(i+" "+j);
        }
      }
    }
    
    char minChar = s19.charAt(minNum);
    char maxChar = s19.charAt(maxNum);
    char[] test = s19.toCharArray();
    test[minNum] = maxChar;
    test[maxNum] = minChar;
    System.out.println(test);


    // 20. Find the longest String in the String array
    // Print "longest=programming"
    int longest=0;
    int idx=0;
    String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
    for(int i=0;i<arr20.length;i++){
      if (arr20[i].length()>longest) {
        longest = arr20[i].length();
        idx = i;
      }
    }
    System.out.println("longest="+arr20[idx]);
  }
}
