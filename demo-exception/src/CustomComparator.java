import java.util.Comparator;

public class CustomComparator implements Comparator<Double>{
  @Override
  public int compare(Double price1,Double price2){
    if (price1>price2) {
      return -1;
    }
    return 1;
  }

}