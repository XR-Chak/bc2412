public class Cat1 extends Animal{
    //Animal class is a parent class
    //Cat.class is a child class
    //Inherit 'All' attribute from parent class
    private int age;

    //Constructor
    public Cat1(String name,int age){
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

    @Override 
    public void eat(){
        System.out.println("Cat is eating ...");
    }
    public static void main(String[] args) {
        Cat1 cat = new Cat1("nobe",8);
        System.out.println(cat.getName());//nobe,the method is in animal class
        cat.walk();
        cat.eat();//Override Parent methoid implementation
    }
}

