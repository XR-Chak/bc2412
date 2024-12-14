public class DemoForLoop {
  public static void main(String[] args){
    //2^4
    int x = 2;
    x = x *2;
    x*=2;
    System.out.println(x);//8

    //i <3 -> continue criteria
    //i++ -> modifier
    //You have to let the modifier work with "continue criteria",so that continue criteria at the end become false
    //For loop
    for(int i =0;i<3;i++){
      System.out.println("hello");
    }
    //Step1: int i =0;
    //Step2: i<3(question)->true
    //step3: if true,enter into code block
    //Step4: i++,i become 1
    //Step5: i<3(question) -> true
    //Step6: if true,print hello
    //Step7: i++, i become 2
    //Step8: i<3(question) -> true
    //Step9: if true,print hello
    //Step10:i++, i become 3
    //Step11:i<3(question)->false
    //Step12:false,exit the loop

    

    int x1 = 2;
    for(int i =0;i<10;i++){
      x1*= 2;
      System.out.println(x1);
    }
    System.out.println("The final x1 is:"+x1);
    
    for(int i =0;i<5;i++){
          System.out.println(i);
    }

    for(int i = 0;i<10;i++){
      if (i%2==0 && i!=0) {
        System.out.println("The even number is: "+i);
      }
    }

    //print 0-100, divided by 3 and divided by4
    for(int i =0;i<101;i++){
      if(i%3==0 &&i%4==0){
        System.out.println("divided by 3 and divided by 4:"+i);
      }
    }

    //sum up 0-20:0+1+2+3..+20
    int sum = 0;
    for(int i =0;i<=20;i++){
      sum = sum + i;
      
    }
    System.out.println(sum);//i is declared within the for loop!!


    //sum up all odd number between 0 -10
    //sum up all even number between 0 -10
    //Find the difference between evenSum and oddSum ->positive number

    int sumOdd =0;
    int sumEven =0;
    for(int i =0;i<11;i++){
      if (i%2!=0) {
        sumOdd+=i;
      }else if (i%2==0) {
        sumEven+=i;
      }
    }
    int diff = -1;//int diff = sumOdd>sumEven?sumOdd-sumEven:sumEven-sumOdd;
    if(sumOdd>sumEven){
      diff = sumOdd-sumEven;
    }else{
      diff = sumEven-sumOdd;
    }
    System.out.println("The differnece between evenSum & oddSum: "+diff);//5

    //Searching
    String str = "abcdefijk";
    boolean isCharExist = false;
    //Check if 'd' exits in the string
    for(int i =0;i<str.length();i++){
        System.out.println(str.charAt(i));
      if (str.charAt(i)=='d') {
        System.out.println("the char 'd' exits !!!!");
        isCharExist = true;
        break; //break function: break the nearest loop!!!!!
      }
      
    }
    System.out.println(isCharExist);
    //Test Cases:
    //1."abcdefijk"
    //2."abcefijk"
    //3.""
    //4."abcdefijkd"

    //2.check if the string value contains given sub-string
    String substr = "loq";
    String str2 = "hello";
    //for loop + substring
    boolean isSubstringExist = false;

    for(int i =0; i<str2.length()-substr.length()+1;i++){
      System.out.println(str2.substring(i,i+substr.length()));
      if (str2.substring(i,i+substr.length()).equals(substr)) {//String need to use equals() to compare cannot use "=="!!!!
        isSubstringExist = true;
        System.out.println(isSubstringExist);
        break;
      }
    }
    System.out.println(isSubstringExist);//true

    // Counting
    String s = "hello";
    //Count the number of 'l'
    //for + if
    int count = 0;
    for(int i = 0; i<s.length();i++){
      if (s.charAt(i)=='l') {
        count++;
      }
    }
    System.out.println("the number of 'l' is:"+count);
    // Test case :"heo","","hello"

    //continue - skip the rest , go to next iteration
    count = 0;
    for(int i = 0;i<s.length();i++){
      if(s.charAt(i)!='l'){
        continue; // skip count ++, go to i++
      }
      count++;
    }
    System.out.println("count"+count);

    //1-100 , print out all the number which can be divided by 3 and 4
    //continue
    for(int i = 1;i <=100;i++){
      if(i%3!=0||i%4!=0){
        continue;
      }
      System.out.println(i);
      // 100 things.... use continue can skip 
    }

  }
}
