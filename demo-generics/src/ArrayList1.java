import java.util.ArrayList;
import java.util.HashSet;
import javax.print.attribute.HashPrintRequestAttributeSet;

public class ArrayList1<T>{
  private T[] values;

  public ArrayList1(){
    this.values = (T[]) new Object[0];
  }

  public void clear(){
    this.values = (T[]) new Object[0];
  }
  public boolean add(T value){
    for(int i=0;i<this.values.length;i++){
      if (this.values[i].equals(value)) {
        return false;
      }
    }
    T[] newValues = (T[]) new Object[this.values.length+1];
    for(int i=0;i<this.values.length;i++){
      newValues[i] = this.values[i];
    }
    newValues[newValues.length-1] = value;
    this.values = newValues;
    return true;
  }

  public int size(){
    return this.values.length;
  }
  public static void main(String[] args) {
    ArrayList1<Book> books = new ArrayList1<>();
    books.add(new Book("abc"));
    books.add(new Book("ijk"));
    System.out.println(books.size());

    ArrayList<Hero1> heros = new ArrayList<>();
    heros.add(new Archer1());
    heros.add(new Archer1());
    heros.add(new Archer1());
    heros.add(new Archer1());
    heros.add(new Archer1());
    heros.add(new Archer1());
    heros.remove(3);
    Archer1 a1 = new Archer1();
    heros.add(a1);
    heros.add(a1);
    System.out.println(heros.size());
    System.out.println(heros.remove(a1));
    System.out.println(heros.size());
    heros.remove(0);

    HashSet<Weapon> weapons = new HashSet<>();
    weapons.add(new Bow());
    weapons.add(new Bow());
    Bow b1 = new Bow();
    weapons.add(b1);
    System.out.println(weapons.add(b1));//false, it is duplicate item!!!!
    System.out.println(weapons.size());//3
    
  }
}
