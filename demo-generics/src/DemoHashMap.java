import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DemoHashMap {

  public static class Book {
    private int id;
    private String name;
    
    public Book(int id, String name){
      this.id =id;
      this.name = name;
    }

    public int getId(){
      return this.id;
    }

    public String getName(){
      return this.name;
    }

    @Override
    public boolean equals(Object obj){
      if (this == obj) {
        return true;
      }else if(!(obj instanceof Book)){
        return false;
      }
      Book bk = (Book) obj;
      return Objects.equals(bk.getName(), this.name) && Objects.equals(bk.getId(), this.getId());
    }

    @Override
    public int hashCode(){
      return Objects.hash(this.getId(),this.getName());
    }
  }
  public static void main(String[] args) {
    // key and value
    HashMap<String,Integer> fruitMap = new HashMap<>();
    //Put an entry to map, put a row
    fruitMap.put("Apple",1);//key ,value
    fruitMap.put("Apple",3);
    //If the key is same, the entry will be replaced

    System.out.println(fruitMap);//{apple=3}
    System.out.println(fruitMap.size());//1
    System.out.println(fruitMap.put("APPLE", 3));
    System.out.println(fruitMap);//{Apple=3, APPLE=3}
    System.out.println(fruitMap.size());//2
    
    
    //entry set mean the key value pair!!!!!!!!1
    for(Map.Entry<String,Integer> entry:fruitMap.entrySet()){//背！！！！！！！
      System.out.println(entry.getKey()+" "+entry.getValue());
    }


    HashMap<String,Integer> h1 = new HashMap<>();
    for(Map.Entry<String,Integer> entry: h1.entrySet()){

    }

    for(String key : fruitMap.keySet()){
      System.out.println(key);
    }

    for(Integer i: fruitMap.values()){
      System.out.println(i);
    }

    //get value by key
    System.out.println(fruitMap.get("APPLE"));//3
    System.out.println(fruitMap.get("Apple"));//3

    //contains()
    fruitMap.containsKey("APPLE");//true

    String target = "Apple";
    //Find the entry of "Apple",and then +1 to the integer.
    if (fruitMap.containsKey(target)) {
      fruitMap.put(target, fruitMap.get(target)+1);
    }
    System.out.println(fruitMap);

   //Can we put null value to the entry?? yes
    fruitMap.put("ABC", null);
    System.out.println(fruitMap.size());//3

    //can put null key to entry?  yes
    fruitMap.put(null, 123);
    fruitMap.put(null, 999);
    System.out.println(fruitMap);//{null=999, Apple=4, ABC=null, APPLE=3}
    System.out.println(fruitMap.size());//4

    System.out.println(fruitMap.getOrDefault("Orange", 0));//0
    System.out.println(fruitMap.getOrDefault("Apple", 0));//4
    Integer removedEntryValue = fruitMap.remove("APPLE");//3
    System.out.println(removedEntryValue);

    fruitMap.put("Cherry",fruitMap.getOrDefault("Cherry", 0)+1);
    fruitMap.clear();//清空HASHMAP
    System.out.println(fruitMap.size());//0 ,entry count
    System.out.println(fruitMap.isEmpty());//true

    //
    
    //create books and put books in map.
    // 1 ABC
    // 2 IJK
    // 3 DEF
    //PRINT MAP SIZE
    Book b1 = new Book(1,"ABC");
    Book b2 = new Book(2,"IJK");
    Book b3 = new Book(3,"DEF");
    HashMap<Integer, Book> bookMap = new HashMap<>();
    bookMap.put(1,b1 );
    bookMap.put(2,b2);
    bookMap.put(3,b3);
    System.out.println(bookMap.size());

    HashMap<String,Integer> set1 = new HashMap<>();
    set1.put("asd", 1);
    set1.put("qwe", 2);
    set1.put("123", 3);

    for(Map.Entry<String,Integer> entry:set1.entrySet()){
      System.out.println("key: "+entry.getKey()+" value:"+entry.getValue());
    }

    //Store the book count
    HashMap<Book,Integer> bookMap2 = new HashMap<>();
    // 1 ABC
    // 2 IJK
    // 3 DEF
    // 3 DEF
    bookMap2.put(b1, b1.getId());
    bookMap2.put(b2, b2.getId());
    bookMap2.put(b3, b3.getId());
    bookMap2.put(b3, b3.getId());
    System.out.println(bookMap2.entrySet());
    System.out.println(bookMap2.size());//3

    bookMap2.get(new Book(1, "DEF"));

    HashMap<Integer,String> h11 = new HashMap<>();

    System.out.println(h11);
  }
}
