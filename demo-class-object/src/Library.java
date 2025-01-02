import java.util.Arrays;

public class Library {
  //a library has many books
  //a book has attribute,title and author
  //The library has functions:
   //1) add a Book,return void.
   //2) removeByTitle,return Book.
   //3) searchByTitle,return Book[]
   //4) Librarian(add/remove) ,Library(search),Book
  private Book[] books = new Book[0];
  //private Librarian[] librarians ;
  public Library(Book[] books){
    //this.librarians = librarians;
    this.books = books;
  }



  // public Librarian[] getlibrarians(){
  //   return this.librarians;
  // }
  // public void addBook(Book book){
  //   Book[] tempBooks = new Book[this.books.length+1];
  //   for(int i=0;i<this.books.length;i++){
  //     tempBooks[i] = books[i];
  //   }
  //   tempBooks[this.books.length] = book;
  //   this.books = tempBooks;
  // }

  // public Book removeByTitle(String title){
  //   Book[] tempbooks = new Book[this.books.length-1];
  //   int idx =0;
  //   Book bookRemoved = new Book(null, null);
  //   for(int i=0;i<this.books.length;i++){
  //     if (this.books[i].getBookTitle().equals(title)) {
  //       bookRemoved = this.books[i];
  //       continue;
  //     }
  //     tempbooks[idx++] = this.books[i];
  //   }
  //   this.books = tempbooks;
  //   return bookRemoved;
  // }

  public Book[] getbooks(){
   return this.books;
  }

  public void setBooks(Book[] books){
    this.books = books;
  }

  //search a substring of a title
  public Book[] searchByTitle(String title){//Didn't change the value of this.books
    Book[] newBooks = new Book[this.getbooks().length];
    int idx =0;
    for(int i=0;i<this.books.length;i++){
      if (this.books[i].getBookTitle().contains(title)) {
        newBooks[idx++] = this.books[i];
      }
    }
    return newBooks;
  }

  public static void main(String[] args) {
    Book b1 = new Book("abc", "Ray");
    Book b2 = new Book("abc2", "Ray1");
    Book b3 = new Book("a3bc", "Ray2");
    Book b4 = new Book("abeec", "Ray33");
    Book b5 = new Book("abeeeeec", "Ray4");
    Book b6 = new Book("abeeeeecTest", "Ray555");
    
    Library lib1 = new Library(new Book[]{b1,b2,b3,b4,b5});
    Librarian l1 = new Librarian(lib1);
    Librarian l2 = new Librarian(lib1);
    System.out.println("First time:     "+lib1.getbooks()[4].getBookTitle());
    
    l1.addBook(b6);
    System.out.println(lib1.getbooks()[5].getBookTitle());
    System.out.println(l1.removeByTitle("abc").getBookTitle());//deleted abc
    System.out.println(Arrays.toString(lib1.getbooks()));//correct

    System.out.println(lib1.searchByTitle("ab")[0].getBookTitle());
    String[] sArr =  "asd asd wrewrwer".split(" ");
    System.out.println(Arrays.toString(sArr));
    String[] newArr = new String[]{"asd","asd","qwe"};
    System.out.println(Arrays.toString(newArr));
    System.out.println(String.join(" ", newArr));
  }
}
