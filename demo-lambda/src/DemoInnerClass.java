public class DemoInnerClass {//Outter class
  private int x;
  
  public void setX(int x){
    this.x =x;
  }

  public void print(){//demoInnerclass and student class is not parent and child relationship!!!!!!
    //Student object is able to read outer class object attribute directly
    //cannot print y!!!!!!//System.out.println("Student.print(): x="+this.x+", y="+ y);//the x reference the Outter class object attribute
    System.out.println("Can only print x:"+this.x);

    //Local class
   class Cat {
      private int age;

      public Cat(int age){
        this.age =age;

      }
      public int getAge(){
        return this.age;
      }
      
    }
    Cat cat = new Cat(10);
    System.out.println(cat.getAge());//10
  }
  public static class Library {// static nested class
    
    
  }

  public static class Builder {// static nested class
    
    
  }

  public class Student {//Inner class
    private int y;
    public void print(){//demoInnerclass and student class is not parent and child relationship!!!!!!
      //Student object is able to read outer class object attribute directly
      System.out.println("Student.print(): x="+x+", y="+ this.y);//the x reference the Outter class object attribute
    }

    public void setY(int y){
      this.y = y;
    }
  }
  public static void main(String[] args) {
    DemoInnerClass.Library library = new DemoInnerClass.Library();
    DemoInnerClass dic = new DemoInnerClass();
    DemoInnerClass.Student student = dic.new Student();//Not Parent-child relationship
    dic.setX(10);
    student.setY(1);
    student.print();

    //Anonymous Inner class
    Swimable person = new Swimable() {
      int count =0;
      @Override
      public void swim(){
        this.count++;
        System.out.println("Anonymous object");
      }

      public int getCount(){
        return this.count;
      }
    };
    //person.getCount();//static Polymorphism
    //But if you create Person.class implements swimable,
    //then the person object may contain additional methods

    //Lambda Expression (After java 8)
    Swimable person2 = ()->{System.out.println("Lambda Expression Object");};
  }
  @FunctionalInterface
  private static interface Swimable {
    void swim();
    
  }
}
