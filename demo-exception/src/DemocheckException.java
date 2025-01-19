public class DemocheckException {
  //2 types Exception: 1) Checked Exception(Compile-time) 2)Unchecked Exception (Runtime)
  //Define Unchecked Exception

  public static class BusinessException extends Exception{

  }

  //Define Unchecked Exception
  public static class  BusinessRunTimeException extends RuntimeException {
    
    
  }

  //Who is the caller of the main() method?
  //JVM (Java Virtual Machine) call this main method
  public static void main(String[] args){
    int sum =0;
   try {
    sum(1, 2);//throw check exception
   } catch (BusinessException e) {
    // TODO: handle exception
    System.out.println("x and y cannot be null");
   }
    
   try {
    sum2(10, null);//throw check exception
    System.out.println("sum="+ sum);
   } catch (BusinessRunTimeException e) {
    // TODO: handle exception
    System.out.println("x and y cannot be null");
   }
  }

  public static int sum(Integer x, Integer y) throws BusinessException{
    if (x==null || y==null) {
      throw new BusinessException();
    }return x.intValue()+y.intValue();
  }

  public static int sum2(Integer x, Integer y){
    if (x==null || y==null) {
      throw new BusinessRunTimeException();
    }return x.intValue()+y.intValue();
  }
}
