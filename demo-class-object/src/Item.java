import java.math.BigDecimal;

public class Item {
  private String name;//use private then getter to get the value
  private double price;
  private int quantity;

  public Item() {

  }

  public Item(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public String getName() {
    return this.name;
  }

  public void setQuantity(int quantity) {//can edit,if no setter that mean the object is readable only
    this.quantity = quantity;
  }

  public double totalAmount() {//presentation method
    return BigDecimal.valueOf(this.price) //
        .multiply(BigDecimal.valueOf(this.quantity)) //
        .doubleValue();
  }
  public static void main(String[] args) {
    Customer c1 = new Customer(1);
    System.out.println(c1.test);
  }
}