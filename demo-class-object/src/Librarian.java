public class Librarian {
  private Library library;
  public Librarian(Library library){
    this.library = library;
  }



   public void addBook(Book book){
    Book[] tempBooks = new Book[this.library.getbooks().length+1];
    for(int i=0;i<this.library.getbooks().length;i++){
      tempBooks[i] = this.library.getbooks()[i];
    }
    tempBooks[this.library.getbooks().length] = book;
    this.library.setBooks(tempBooks);
  }

  //prof-reading:
  //1. Focus negative cases
  //2.Variable scope
  public Book removeByTitle(String title){//null is 空指針！！！！！！！
    int idx =0;
    Book bookRemoved = null;
    for(int i=0;i<this.library.getbooks().length;i++){
      if (this.library.getbooks()[i].getBookTitle().equals(title)) {
        bookRemoved = this.library.getbooks()[i];
        idx = i;
        break;
      }
    }
    if(idx !=-1){
      Book[] tempbooks = new Book[this.library.getbooks().length-1];
      for(int i=0;i<this.library.getbooks().length;i++){
        if (i!=idx) {
          tempbooks[idx++] = this.library.getbooks()[i];
        }else{
          bookRemoved = this.library.getbooks()[i];
        }
        
      }
      this.library.setBooks(tempbooks);
    }
    return bookRemoved;//if not found ,return null

  }
}
