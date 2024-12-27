import java.math.BigDecimal;
import java.math.RoundingMode;

public class Bmi {
  //attribute
  private String name ;//instance varible
  private double weight;//instance varible
  private double height;//instance varible
  private char gender;
  
    //can be more than one constructor
    public Bmi(String name,double weight,double height,char gender){
      this.name=name;
      this.weight=weight;
      this.height=height;
      this.gender = gender;
  }
  //empty constructor!!!!!!!!!!!!!!!!
  public Bmi(){

  }
  //constructor is same as method .Not allow same constructor signature
  // public Human(double height){
  //   this.height = height;
  // }

  // public Human(double weight){
  //   this.weight = weight;
  // }

  public double getHeigth(){
    return this.height;
  }
  public double getWeight(){
    return this.weight;
  }

  public char getGender(){
    return this.gender;
  }
  //BMI method
  //instance method
  public double bmiCalculate(){
    return BigDecimal.valueOf(this.weight)
    .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)),2, RoundingMode.HALF_UP)
    .doubleValue();
  }

  //instance method
  //able to call object attribute & instance method
  public String bmiClassify(){
    if (this.bmiCalculate()<18.5) {
      return "under weight!";
    }
    else if (this.bmiCalculate()>=18.5 && this.bmiCalculate()<=24.9) {
      return "Normal";
    }else if (this.bmiCalculate()>=25.0 && this.bmiCalculate()<=29.9) {
      return "overweight";
    }else if(this.bmiCalculate()>=30.0 && this.bmiCalculate()<=34.9){
      return "Obese";
    }else{
      return "Extremely obese";
    }
  }

  public static double bmiCalculate(double weight,double height){
    return BigDecimal.valueOf(weight)
    .divide(BigDecimal.valueOf(Math.pow(height, 2.0)),2, RoundingMode.HALF_UP)
    .doubleValue();
  }

  public static void main(String[] args) {
    Bmi Ray = new Bmi("Ray", 68, 1.74,'M');
    System.out.println(Ray.bmiCalculate());
    System.out.println(Ray.bmiClassify());
    System.out.println(bmiCalculate(50, 1.65));

    //Constructor object by empty constructor
    Bmi h2 = new Bmi();
    System.out.println(h2.getHeigth());
    System.out.println(h2.getWeight());
    System.out.println(h2.getGender());//'\u0000'
    if (h2.getGender()=='\u0000') {
      System.out.println("char default found");
    }
  }
}
