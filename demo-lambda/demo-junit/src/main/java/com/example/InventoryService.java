package com.example;

//Singleton Pattern (Coding Pattern)
public class InventoryService {
  private static InventoryService uniqueInstance = new InventoryService();

  private int stockCount;

  //
  private InventoryService(){

  }

  public static InventoryService getInventoryService(){
    return uniqueInstance;
  }

  public static int getInstanceStockCount(){
    return uniqueInstance.getStockCount();
  }

  public int getStockCount(){
    return this.stockCount;
  }

  public int checkAvailableStock(){
    return 10;
  }

  public boolean deductStock(){
    this.stockCount--;
    return false;
  }
}
