public class Book {
  private String title;
  private String author;

  public Book(String title,String author){
    this.title = title;
    this.author = author;
  }

  public String getBookTitle(){
    return this.title;
  }
  public String getBookAuthor(){
    return this.author;
  }

  
}
