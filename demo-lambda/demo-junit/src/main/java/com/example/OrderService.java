package com.example;

//Person has name and age
public class OrderService {
  private PaymentService paymentService;
  private InventoryService inventoryService;


  //Dependency Injection(Spring)
  public OrderService(PaymentService paymentService,InventoryService inventoryService){
    this.paymentService = paymentService;
    this.inventoryService = inventoryService;
  }

  // Unit test?
  // TestCase: checkAvailableStock <=0
  // TestCase: checkAvailableStock >0, pay->true,deductStock ->true
  // TestCase: checkAvailableStock >0, pay->false,deductStock ->true
  // TestCase: checkAvailableStock >0, pay->false,deductStock ->false
  // TestCase: checkAvailableStock >0, pay->true,deductStock ->false
  public boolean order(){
    if (this.inventoryService.checkAvailableStock()<=0) {
      throw new IllegalStateException();
    }
    return this.paymentService.pay() && this.inventoryService.deductStock();
      
    
  }
  public static void main(String[] args) {
    PaymentService ps = new PaymentService();
    InventoryService is = new InventoryService();
    OrderService os1 = new OrderService(ps, is);
    OrderService os2 = new OrderService(ps, is);
  }
}
