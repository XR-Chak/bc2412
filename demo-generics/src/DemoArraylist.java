import java.util.ArrayList;

public class DemoArraylist {
  public static void main(String[] args) {
     ArrayList<String> strings = new ArrayList<>();
    strings.add("ABC");
    strings.add("IJK");
    System.out.println(strings.size());//2
    System.out.println(strings.get(1));//ijk

    //Book[]
    ArrayList<Book> books = new ArrayList<>();
    books.add(new Book("asd"));
    books.add(new Book("ijk"));
    books.remove(0);//remove book by index
    System.out.println(books.size());//1
    books.add(new Book("XYZ"));
    books.remove(new Book("ijk"));
    //ArrayList.remove(Object obj) -> Book.equals()
    //Generics Design ensure the type must contains 
    System.out.println(books.size());//1,after @override the equals method in Book.class 

    //Require @Override equals()
    System.out.println(books.contains(new Book("XYZ")));//true
    System.out.println(books.isEmpty());//false
    System.out.println(books.indexOf(new Book("XYZ")));//0
    books.clear();//Create a new array with size 0
    

    //Search FOR LOOP "ABCD"
    boolean found = false;
    String bookname ="";
    for(Book book : books){//for each loop is support arraylist
      if (book.getName().contains("BC")) {
        found = true;
        bookname = book.getName();
        break;
      }
    }
    if (found) {
      System.out.println("Book: "+bookname+ "is found!");
    }
  }
}
