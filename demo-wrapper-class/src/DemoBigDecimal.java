import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args){
    double result = 0.2+0.1;
    System.out.println(result);
    if (result ==0.3) {
      System.out.println("Result is 0.3");//0.3000000000004
    }else{
      System.out.println("Result is not 0.3.");
    }

    //Solution
    BigDecimal bd1 = BigDecimal.valueOf(0.2);
    BigDecimal bd2 = BigDecimal.valueOf(0.1);
    BigDecimal bd3 = bd1.add(bd2);
    System.out.println(bd3.doubleValue());//0.3

    System.out.println(0.3-0.1);//0.19999999999
    //subtract
    BigDecimal bd4 = BigDecimal.valueOf(0.3);
    BigDecimal bd5 = BigDecimal.valueOf(0.1);
    BigDecimal bd6 = bd4.subtract(bd5);//0.3-0.1=0.2!!!!!!!!!!!!!
    System.out.println(bd6);

    System.out.println(0.1* 0.2);//0.02000000000000004
    System.out.println(0.3/0.1);//2.9999999999996
    BigDecimal bd7 = BigDecimal.valueOf(0.1);
    BigDecimal bd8 = BigDecimal.valueOf(0.2);
    BigDecimal bd9 = bd7.multiply(bd8);
    BigDecimal bd100 = bd4.divide(bd7);//0.3/0.1
    System.out.println("bd100:::::::"+bd100);//3
    System.out.println(bd9);

    BigDecimal bd10 = BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1));
    System.out.println(bd10);

    BigDecimal asd = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3),BigDecimal.ROUND_DOWN);//round down
    System.out.println(asd.doubleValue());

    BigDecimal bd16 = BigDecimal.valueOf(4.565).setScale(2, RoundingMode.HALF_DOWN);
    System.out.println(bd16.doubleValue());//4.56
    
    BigDecimal bd17 = BigDecimal.valueOf(4.566).setScale(2, RoundingMode.HALF_DOWN);//setScale (2),the 2 represent the round down position after the point
    System.out.println(bd17.doubleValue());//4.57

    BigDecimal bd19 = BigDecimal.valueOf(4.565);
    System.out.println(bd19.setScale(2,RoundingMode.HALF_DOWN));//4.56
    System.out.println(bd19.setScale(2, RoundingMode.HALF_UP));//4.57

    BigDecimal bd20 = BigDecimal.valueOf(4.566);
    System.out.println(bd20.setScale(2,RoundingMode.HALF_DOWN));//4.57
    System.out.println(bd20.setScale(2,RoundingMode.HALF_UP));//4.57

    BigDecimal bd21 = BigDecimal.valueOf(4.561);
    System.out.println(bd21.setScale(2,RoundingMode.UP));//4.57
    System.out.println(bd21.setScale(2, RoundingMode.DOWN));//4.56

    double length =4.2;
    double squareArea = BigDecimal.valueOf(length).multiply(BigDecimal.valueOf(length)).doubleValue();
    System.out.println(squareArea);//17.64;

    //Math
    double pi = 3.14159;
    double radius = 4.5;
    double circleArea = BigDecimal.valueOf(radius)
    .multiply(BigDecimal.valueOf(radius))
    .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
    //double circleArea = radius*radius*Math.PI;
    System.out.println(circleArea);
    circleArea = BigDecimal.valueOf(Math.pow(radius, 2.0))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
    System.out.println(circleArea);
    
    int x= 8;
    int y =9;
    int max = Integer.MIN_VALUE;
    max = Math.max(x,max);//if (x>max) {max = x;}
    max = Math.min(y,max);

    int[] arr = new int[]{10,9,3};
    max = Integer.MIN_VALUE;//-210000000000000000
    for(int i =0;i<arr.length;i++){
      max = Math.max(arr[i], max);//Compare arr[i] and max value and keep th bigger one!!!!!
    }

    //Math.min()
    System.out.println(Math.sqrt(9));//java auto convert int value to double value
    System.out.println(Math.sqrt(10));//3.16227766016
    System.out.println(Math.sqrt(-10));//Nan

    // round() --> nearest to integer 
    double u =3.456;
    
    System.out.println(Math.round(u));//3

    //nearest 2 d.p ->3.46
    System.out.println(Math.round(Math.round(u*100))/100.0);//346/100-->3.46

    
    double u2 = 3.556;
    System.out.println(Math.round(u2));//4
    System.out.println(Math.abs(-9L));//9
    
    char test = 'a';
    test = (char)1293;//downcasting will cause run time problem
    System.out.println(test);


    BigDecimal bd = BigDecimal.valueOf(test);
    System.out.println(bd);
    //Do a calculation using (3.3/8.8)^3 + 8.7:
    
    BigDecimal testing = BigDecimal.valueOf(Math.pow(BigDecimal.valueOf(3.3).divide(BigDecimal.valueOf(8.8)).doubleValue(),3.0));
    System.out.println(testing);

    BigDecimal testing123 = BigDecimal.valueOf(3.3);

    
  }
}
