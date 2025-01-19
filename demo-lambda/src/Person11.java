/**
 * Purpose: 
 * @author vincent.lau
 * @since
 * @version
 * Date: 
 */



public class Person11 {
    private String name;
    private int age;

    private Person11(String name,int age){
        this.name = name;
        this.age =age;
    }

    public String getNme(){
        return this.name;

    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age =age;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String name;
        private int age;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age =age;
            return this;
        }

        public Person11 build(){
            return new Person11(this.name, this.age);
        }
    }

    public static void main(String[] args) throws Exception {
        Person11 p1 = new Person11("Vincent", 18);


        //Advantage :
        //1. You no longer need to pass null for those unnecessary attribute
        //2.If there are many attribute (i.e. 20+ String), you have to manually check if the value is 
        //passed to the right parameters
        Person11 p2 = Person11.builder().name("Vincent").age(18).build();

        Person11 p4 = Person11.builder().build();
        System.out.println(p4.getAge());
    }
}
