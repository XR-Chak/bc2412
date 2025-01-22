import java.lang.StackWalker.Option;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.management.RuntimeErrorException;

public class DemoStream {
    public static void main(String[] args){
        //traditional
        int[]arr = new int[]{1,2,3,4};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int integer: arr){
            System.out.println(integer);
        }

        //int[],Integer[],ArrayList<Integer>
        //Java8 (2014): Stream style:List -> Stream -> List
        //before java 8: for loop(list)
        List<Integer> integers = Arrays.asList(1,2,3,4);
        List<Integer> newIntegers = integers.stream()//Stream<Integer>
        .filter(e -> e%2==0)//"e -> e%2==0" -> predicate
        .collect(Collectors.toList()); //always return new ArrayList

        System.out.println(integers);
        System.out.println(newIntegers);

        //Declare String Array with some elements
        //filter string length>5

        List<String> stringArr = Arrays.asList("a","asd","asdasda","helloworld","a123","as","adassda");
        
        List<String> newStringArr = stringArr.stream().
        filter(e->e.length()>5||e.contains("a")).collect(Collectors.toList());


        System.out.println(stringArr);
        System.out.println(newStringArr);

        //define a bookList
        List<Book> books = Arrays.asList(new Book("HerryPotter"),new Book("Potter")
        ,new Book("herryPotter"),new Book("HERRYPotter"),new Book("ASD"),new Book("VVV"));



        //filter book name contain "Herry" case insensitive

        List<Book> newBooks = books.stream().filter(e -> e.getName().toUpperCase().contains("HERRY")).collect(Collectors.toList());
        System.out.println(newBooks);
    
         //map(): Change the object type, but the quantity of element won't change
        List<String> booksName = books.stream().map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(booksName);

        List<String> bookNames = List.of("abc","herry","def");
        List<Book> books2 = bookNames.stream().map(e->new Book(e)).toList();

        System.out.println("BOOKS2"+books2);

        //Stream sorted()
        //Collections.sort() + Comparator
        //Arrays.sort()

        //Integer[] vs int[], int vs Integer
        Integer[] arr2 = new Integer[]{2,4,-1,1,-3};
        Arrays.sort(arr2,(i1,i2)->i1>i2?-1:1);//Lambda expression of comparator
        System.out.println(Arrays.toString(arr2));//[4, 2, 1, -1, -3]

        //Integer[] ->Stream<Integer>
      List<Integer> arr3 =  Arrays.stream(arr2).sorted().collect(Collectors.toList());//accending order
       List<Integer> sortedIntegers = Arrays.stream(arr2).sorted((i1,i2)->i1>i2?-1:1).collect(Collectors.toList());
        System.out.println(sortedIntegers);

        //fruit
        List<String> fruits = Arrays.asList("orange","apple","orange","lemon");
         Set<String> newFruits = fruits.stream().collect(Collectors.toSet());
         System.out.println(newFruits);

         //distinct() ->remove dulplicates
         //What if List<Book> by distinct()
         List<String> newFruit2 = 
         fruits.stream().distinct().collect(Collectors.toList());
         System.out.println(newFruit2);
        String a = "a";
        String b ="a";
        System.out.println(a==b);
        System.out.println("CADAACCAC");
        Book b1 =new Book(a);

        Stream.of("abc","def");
        Stream<Book> books22 = Stream.of(new Book("abc"),new Book("def"));

        List<Book> books3 = books22.filter(e->e.getName().contains("a"))
        .collect(Collectors.toList());

        LocalDate date1 = LocalDate.of(2025, 01, 20);
        String str = String.valueOf(123);

        Stream<String> ss = Stream.empty();
        System.out.println(ss.count());//0

       Optional<Book> targetBookBox = Stream.of(new Book("abc"),new Book("def")).
       filter(e->"abc".equals(e.getName())).findFirst();//Find the first one only!!!

       //OPtional (Java 8)
       //1.Target book never be null
       //2. targetBook is an Optional Object, so it can Optional method only
       //3.You have to check the content of Optional object before using it.
       //4.isPresent() & ifPresent are the ways to resolve Optional in safe mode.
       //5.Never to resolve the optional object by get() only
       int x =10;
       if (targetBookBox.isPresent()) {//something like peek
        Book targetBook = targetBookBox.get();
        System.out.println(targetBook.getName());//abc
        System.out.println(x);//10
        //x=100;
       }
       
       //similar to for-each
       targetBookBox.ifPresent(e->{
        System.out.println(e.getName());
        System.out.println(x);//10 
       });

       //stream for-each
       String name= "oscar";
       Stream.of(100,120,"asd").forEach(e->{
        System.out.println(e);
        System.out.println(name);//read the name
        //but cannot write the name variable
        //name = "abc";   !!!!!!!reminder: 進入stream之後，會封裝入來的data，因此不能改外界的variable!!!!
        //要離開stream才可以改main的local/global variable
       });

       //Another way to resolve the Optional
       Book targetBook2 = targetBookBox.orElse(new Book("default"));
       Book targetBook3 = targetBookBox.
       orElseThrow(()->new RuntimeException("Book is not found."));
       
      Book targetBook4 =  targetBookBox.orElseGet(()->new Book("default"));//similar to orElse
       
       //of(), ofNullable()
       String name3 ="ABC";
       Optional<String> os1 =Optional.of(name3);//inside .of() cannot put a null inide!!!!will error!!!!


       String name4 = null;
       Optional<String> os2 = Optional.ofNullable(name4);

       Optional<String> os3 = Optional.empty();
       if (os3.isPresent()) {
        System.out.println(os3.get());
       }else{
        System.out.println("The String is null.");
       }
       
       //1.Stream intermediate operation won't execute itself, until terminal operation.
       //2.Once the terminal operation executed, the stream object can no longer be used again
       Stream<Integer> integersLargerThan10 = 
       Stream.of(10,100,-1).filter(e->e>10);

       System.out.println(integersLargerThan10.count());//1
       //integerLarganThan10.collect(Collectors.toList());
       //RunTime Exception: stream has already been operated  upon or cloesd


       Stream<Integer> plusOne = Stream.of(1,2,3).map(i->{
        System.out.println(i);
        return i+1;
       });
      // List<Integer> plusOneList=plusOne.collect(Collectors.toList());//2,3,4
       long count = plusOne.count();//3
       //Because Java thinks map() doesn't change the result of count()
       //So it won't execute map() ,when the terminal operation is count().
       System.out.println(count);//3
    }
    public static class Book{
        private String name;
        private static char c ='c';
        public Book(String name){
            this.name =name;
        }

        public String getName(){
            return this.name;
        }
        @Override
        public String toString(){
            return "Book name is :"+this.getName();
        }
    }

    

    

    //Convert from List of Object A (more fields) to list of Object B (less fields)
    public static List<Book> getBookListForSearch(List<Book2> books){
        return books.stream().map(e->new Book(e.getName())).collect(Collectors.toList());
    }

    public static class Book2{
        private String name;
        private double price;
        int level =2;
        public Book2(String name,double price){
            this.name =name;
            this.price = price;
        }

        public String getName(){
            return this.name;
        }

        public double getPrice(){
            return this.price;
        }

        @Override
        public String toString(){
            return "Book name is :"+this.getName();
        }
    }
}
