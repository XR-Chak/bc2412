public enum Currency {//enums vs Strings usage...
  //Scenario for enum:
  //1.Finite numbers of values(Weekdays, months,)
  //2. Values not likely to have a new value 不常更新-> 可用enum
  HKD("Hong Kong Dollar",1),// <--this similar to constructor
  USD("US Dollar",2),//
  CNY("Chinese Yuan Renminbi",3),;//

  private final String desc;
  private final int value;
  //carry more than one attribute...
  private Currency(String desc,int value){
    this.desc = desc;
    this.value = value;
  }

  public String getDesc(){
    return this.desc;
  }

  public int getValue(){
    return this.value;
  }

  public static String getDescription(Currency currency){
    //before Java 14
    if(currency == Currency.HKD){//enum should use == ,do not use .equal()!!!
     return "Hong kong dollor"; 
    }else if(currency == Currency.CNY){
      return "Chinese Yuan Renminbi";
    }else if(currency == Currency.USD){
      return "US Dollar";
    }
    return "";
    // switch(currency){
    //   case HKD:
    //     return "Hong Kong Dollar";
    //   case USD:
    //     return "US Dollar";
    //   case CNY:
    //     return "Chinese Yuan Renminbi";
    //   default:
    //    return "";
    // }
  }
  public static void main(String[] args) {
    System.out.println(getDescription(Currency.CNY));
   // new Currency("ABC")//You can not create this object
   System.out.println(Currency.CNY.getDesc());//cny
   System.out.println(Currency.CNY.getValue());//3

   System.out.println(Currency.USD.getValue());//2
  }
}
