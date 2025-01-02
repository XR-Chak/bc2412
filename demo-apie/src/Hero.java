public class Hero{
  //HP -Health point
  //MP -Magic point
  //Level -> Increase Max HP,Max MP
  private int hp=100;
  private int mp=50;
  private int maxHp = 100;
  private int maxMP = 50;
  private int level =1;
  private boolean alive = true;

  public Hero(){

  }

  public boolean getAlive(){
    return this.alive;
  }

  public int getHp(){
    return this.hp;
  }
  public int getMp(){
    return this.mp;
  }

  public int getMaxHp(){
    return this.maxHp;
  }
  public int getMaxMp(){
    return this.maxMP;
  }

  public int getLevel(){
    return this.level;
  }

  public void getHit(int hitpoint){
    if (this.hp>0 && hitpoint<this.hp) {
      this.hp = this.hp-hitpoint;
      System.out.println("hero hp left:"+this.hp);
    }else if(this.hp>0 && hitpoint==this.hp){
      this.hp=0;
      this.alive=false;
      System.out.println("Hero dead...");
    }
    else if(this.hp>0 && hitpoint>this.hp){
      this.hp=0;
      this.alive=false;
      System.out.println("hero dead...");
    }
    else{
      System.out.println("Hero already dead ,can't get hit!");
    }
    
  }

  public void healing(){
    if (this.hp<this.maxHp && this.hp!=0) {
      if (this.hp+20>=this.maxHp) {
        this.hp = this.maxHp;
        System.out.println("hero hp: "+this.hp);
      }else{
        this.hp+=20;
        System.out.println("hero hp: "+this.hp);
      }
    }else if (this.hp==0) {
      System.out.println("Hero already dead,cannot be healed");
    }else if (this.hp==this.maxHp) {
      System.out.println("Already full HP!");
    }
  }

  public void recoverMP(){
    if (this.mp<this.maxMP) {
      if (this.mp+10>=this.maxMP) {
        this.mp = this.maxMP;
        System.out.println("hero MP: "+this.mp);
      }else{
        this.mp+=10;
        System.out.println("hero MP: "+this.mp);
      }
    }else{
      System.out.println("Already full MP!");
    }
  }

  public void powerPunch(){
    if (this.mp>=4) {
      this.mp -= 4;
      System.out.println("Power Punch!!!!!");
    }
  }

  public boolean isAlive(){
    if(this.hp==0){
      return false;
    }
    else{
      return true;
    }
  }

  public void levelup(){
    this.level= this.level+1;
    this.maxHp +=10;
    this.maxMP +=5;
    System.out.println("Level Up!!");
  }


  //Method:
  //Presentation: isAlive
  //Action: Level Up
  public static void main(String[] args) {
    Hero h1 = new Hero();
    System.out.println(h1.getHp());
    System.out.println(h1.getMp());
    System.out.println(h1.getMaxHp());
    System.out.println(h1.getMaxMp());
    System.out.println(h1.getLevel());
    h1.getHit(50);
    h1.healing();
    h1.healing();
    h1.levelup();
    h1.levelup();
    h1.powerPunch();
    h1.powerPunch();
    System.out.println(h1.maxHp+" "+h1.maxMP);
    System.out.println(h1.hp+" "+h1.mp);
    h1.recoverMP();
    System.out.println(h1.mp);
    h1.healing();
    h1.healing();
    System.out.println(h1.hp);
    h1.getHit(120);
    h1.healing();
  }
}
