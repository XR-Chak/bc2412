public class Ironman {
   private double version;
   private boolean haveWeapons;
   private String name;

   //constructor
   public Ironman(double version ,boolean haveWeapons,String name){
        this.version = version;
        this.haveWeapons = haveWeapons;
        this.name = name;
   }

   //getter
   public double getVersion(){
    return this.version;
   }

   public boolean getHaveWeapons(){
    return this.haveWeapons;
   }

   public String getName(){
    return this.name;
   }

   //setter
   public void setName(String name){
        this.name= name; 
   }

   public static int sum(int x,int y){
    return x+y;
   }

   public static void main(String[] args) {
    Ironman ironman1 = new Ironman(3.1, true, "MarkIII");
    System.out.println(ironman1.getVersion());
    System.out.println(ironman1.getHaveWeapons());
    System.out.println(ironman1.getName());

    Ironman ironman2 = ironman1;
    ironman2.setName("MarkIV");
    System.out.println(ironman2.getName());
   }
}
