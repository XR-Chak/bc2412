public class Printer {
  private Integer x;
  public Printer(Integer x){
    this.x = x;
  }

  public String print(){
    return "this is "+ this.x;//String + int => String ,int +double => double!!!
  }
  public static void main(String[] args) {
    Printer p1 = new Printer(10);
    System.out.println(p1.print());//this is 10

    //What if Double Printer?Long printer?BigDecimal Printer? -> New class...

    //Another solution :Generics 
    //10 -> Integer 10 -> Long 10 (Not ok)
    //10L ->Long 10
    GeneralPrinter<Long> longPrinter = new GeneralPrinter<>(10L);
    System.out.println(longPrinter.print());//this is 10
    //You defined T as Long

    GeneralPrinter<Book> bookPrinter = new GeneralPrinter<Book>(new Book("ABC"));
    System.out.println(bookPrinter.print());//this is Book[name=ABC]

  }
}
