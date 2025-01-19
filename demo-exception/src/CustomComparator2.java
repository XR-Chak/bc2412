import java.util.Comparator;

public class CustomComparator2 implements Comparator<RealStockPriceTracker.Stock>{
  @Override
  public int compare(RealStockPriceTracker.Stock s1,RealStockPriceTracker.Stock s2){
    
    if (Integer.parseInt(s1.getStockCode())==Integer.parseInt(s2.getStockCode())) {
      if (s1.getPrice()>s2.getPrice()) {
        return -1;
      }else{
        return 1;
      }
    }
    if (Integer.parseInt(s1.getStockCode())>Integer.parseInt(s2.getStockCode())) {
      return -1;
    }else return 1;


  }
    
  }

