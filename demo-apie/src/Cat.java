public class Cat extends Animal{
    //Animal class is a parent class
    //Cat.class is a child class
    //Inherit 'All' attribute from parent class
    private int age;

    //Constructor
    public Cat(String name,int age){
        //this.name = name;
        super(name);//Calling Parent Constructor
        //Must be the first line to call super
        //寫曬super先！！！！！！再寫自己的constructor
        this.age = age;
    }

    //getter
    //Inherit Parernt all instance methods
    //public String getName(){
    // return this.name;
    //} //^^use parent method to call^^

    //walk()
    public void walk(){
        System.out.println("Cat is walking...");
    }
    public static void main(String[] args) {
        Cat cat = new Cat("nobe",8);
        System.out.println(cat.getName());//nobe,the method is in animal class
        cat.walk();

    }
}

