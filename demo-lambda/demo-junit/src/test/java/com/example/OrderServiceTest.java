package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

// !Mockito

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {

  @Mock
  private PaymentService paymentService;//Mok object (Without real implementation)
  @Mock
  private InventoryService inventoryService;//mock object (Without real implementation)

  @Test
  void testOrder_whenstockcountLARGERthanZero(){
    // !For this scenario ,how do we perform Unit test?
    //OrderService ->Inventory Service
    //-> Payment Service
     Mockito.when(this.inventoryService.checkAvailableStock()).thenReturn(10);
     Mockito.when(this.inventoryService.deductStock()).thenReturn(true);
     Mockito.when(this.paymentService.pay()).thenReturn(true);
    OrderService os = 
      new OrderService(this.paymentService, this.inventoryService);
    
    boolean orderResult =  os.order();

    assertEquals(true, orderResult);

    verify(this.inventoryService,times(1)).checkAvailableStock();
    verify(this.inventoryService,times(1)).deductStock();
    verify(this.paymentService,times(1)).pay();
  }
  
  //assertThrow
  @Test
  void testOrder_whenStockCountIsZero(){
    Mockito.when(this.inventoryService.checkAvailableStock()).thenReturn(0);
    OrderService os = 
      new OrderService(this.paymentService, this.inventoryService);

    assertThrows(IllegalStateException.class, ()->os.order());
    verify(this.inventoryService,times(1)).checkAvailableStock();
    verify(this.inventoryService,times(0)).deductStock();
    verify(this.paymentService,times(0)).pay();
  }
}
