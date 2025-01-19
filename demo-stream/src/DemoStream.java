import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
         List<String> newFruit2 = 
         fruits.stream().distinct().collect(Collectors.toList());
         System.out.println(newFruit2);
        String a = "a";
        String b ="a";
        System.out.println(a==b);
        System.out.println("CADAACCAC");
        Book b1 =new Book(a);
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
