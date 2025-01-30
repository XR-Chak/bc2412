public record Book(String name,double price) {
  //private String author;
  public static final int X = 10;

  public void print(){
    System.out.println(name+price);
  }
  public static void main(String[] args) {
    Book b1 = new Book("ABC", 10.5);
    System.out.println(b1.name());
    System.out.println(b1.price());
    System.out.println(new Book("ABC",10.5).equals(b1));//true
    System.out.println(new Book("ABC",10.5).hashCode());
    System.out.println(b1.hashCode());
    System.out.println(b1);//Book[name=ABC, price=10.5]
    b1.print();
    //All-arg constructor only
    //renamed getter
    //no setter(immutable)
    //Support equals() and hashcode()
    //Support toString()
    //Support static method/variable
    //Support custom instance method
    //Do not support custom attribute
    //Do not support custom constructor
  }
}
