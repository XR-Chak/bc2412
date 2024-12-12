public class DemoComparison {
  public static void main(String[] args){
    //>,<,>=,<=,!=,==
    //"=="-> check if they are equals
    //"=" -> assignment
    int age = 20;
    boolean isAdult = age > 18;
    System.out.println(isAdult);//true
    boolean ischild = age <18;

    double pi = 3.14159;
    boolean isCorrect = pi == 3.14159;
    System.out.println(isCorrect);

    char gender= 'F';
    boolean isMale = gender=='M';
    System.out.println(isMale);

    float price = 10.2f;
    System.out.println(price != 10.2f);//false
    System.out.println(price !=10.2);//true,during comparison,convert price to double before compare!

    //! operator (not)
    boolean result = !(isAdult);
    System.out.println(result);//false
    if(!(age>=18)){//age<18
      //do something
    }
    
    if(!isAdult){
      //do something
    }

    // && AND
    int age2 = 30;
    char gender2 = 'F';
    int age3 = 8;
    boolean result2 =  age2>=30 && gender2 =='M';
    //event1 :age2 >=30 ->true
    //event2 :gender2 =='M'->false
    System.out.println(result2);//false
    // || OR
    boolean result3 = age2 >=30 || gender2 =='M';
    //event1 : age2>=30->true
    //event2 : gender2 == 'M' -> false
    System.out.println(result3);//true
    //||OR(falsae||fasle)
    boolean result4 = age2<30||gender2=='M';
    System.out.println(result4);//false
    // AND OR (true AND (false OR true))
    boolean result5 = age3==8 && (age2>50||gender2=='F');
    System.out.println(result5);

    //the ordering of event checking is different
    //AND go first!!!!!the order of AND>>>>OR!!!!!!!
    boolean result6 = age2 >= 30 && gender2 =='M'||age2>18;//true
    System.out.println(result6);
  }
}
