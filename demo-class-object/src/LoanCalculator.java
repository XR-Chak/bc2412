import java.math.BigDecimal;

public class LoanCalculator {
  private double principle;
  private double annualInterestRate;
  private int numOfYears;

  //constructor
  //totalInterestAfterYears()
  public LoanCalculator(double principle,double annualInterestRate,int numOfYears){
    this.principle = principle;
    this.annualInterestRate = annualInterestRate;
    this.numOfYears = numOfYears;
  }


  public double totalInterestAfterYears(){
    double totalInterest =0;
    totalInterest = BigDecimal.valueOf(this.principle)
    .multiply(BigDecimal.valueOf(Math.pow(this.annualInterestRate+1,this.numOfYears)))
    .subtract(BigDecimal.valueOf(this.principle)).doubleValue();
    return totalInterest;
  }

  public static void main(String[] args) {
    LoanCalculator case1 = new LoanCalculator(10000, 0.03, 2);
    System.out.println(case1.totalInterestAfterYears());
  }
}
