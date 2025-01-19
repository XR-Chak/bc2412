import java.time.LocalDate;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class RealStockPriceTracker {

  // You should complete StockPriceTracker first.
  
  // In RealStockPriceTracker, we should consider the stock price is by Stock Code & Trade date
  // For example, the stock price of GOOGL on 13 Jan is $191.01

  // Tips: You should still use PriorityQueue, HashMap, Deque

  // Complete getHighestPrice(String stockCode) and getLatestPrice(String stockCode)
  public static class Stock {
    private String stockCode;
    private LocalDate date;
    private double price;

    public Stock(String stockCode,LocalDate date, double price){
      this.stockCode = stockCode;
      this.date = date;
      this.price = price;
    }
    
    public String getStockCode(){
      return this.stockCode;
    }

    public LocalDate getLocalDate(){
      return this.date;
    }

    public double getPrice(){
      return this.price;
    }
  }

  private final Queue<Stock> maxPricePQ = new PriorityQueue<>(new CustomComparator2());

  private final Map<String, Stock> LatesttradeRecords = new HashMap<>();
  private final Deque<LocalDate> tradeDates = new LinkedList<>();
  // private final Map<String,Map<LocalDate,Double>> tradeRecords2 = new HashMap<>();
  public void addRecord(Stock stock) {
    // code here ...
    // 1. Add the trade record to the hashMap
    // 2. Add the price to PQ
    // 3. Add the trade date to Deque
    LatesttradeRecords.put(stock.getStockCode(), stock);
    maxPricePQ.add(stock);
    //tradeDates.add();
    System.out.println("Recorded: " + stock.getLocalDate() + " -> $" + stock.getPrice()+" ->StockCode:"+stock.getStockCode());
  }

  // public Map<LocalDate, Stock> getTradeRecord(){
  //   return this.tradeRecords;
  // }

  // public Deque<LocalDate> getTradeDate(){
  //   return this.tradeDates;
  // }

  public double getLatestPrice(String stockCode) {
    // code here ...
    // Tips: use tradeDates & tradeRecords
    return LatesttradeRecords.get(stockCode).getPrice();
  }

  public double getHighestPrice(String stockCode) {
    // code here ...
    // Tips: use maxPricePQ
    return -1;
  }

  public static void main(String[] args) {
    RealStockPriceTracker tracker = new RealStockPriceTracker();
    Stock s1 = new Stock("GOOGL", LocalDate.of(2025, 1, 15), 199.99);
    Stock s2 = new Stock("GOOGL", LocalDate.of(2025, 1, 16), 201.99);
    Stock s3 = new Stock("TESLA", LocalDate.of(2025, 1, 17), 159.99);
    Stock s4 = new Stock("TESLA", LocalDate.of(2025, 1, 18), 201.99);
    // code here ... for testing
    tracker.addRecord(s1);
    tracker.addRecord(s2);
    tracker.addRecord(s3);
    tracker.addRecord(s4);
    System.out.println(tracker.getHighestPrice("GOOGL"));
    System.out.println(tracker.maxPricePQ);
  }

}