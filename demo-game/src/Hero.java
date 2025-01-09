public abstract class Hero{
  private int id;
  private int level =1;
  private String name;
  // private int maxHp;
  // private int maxMp;
  private int hp;
  private int mp;
  private Role role;

  private int PA;//Physic attack
  private int PD;//Physic defense
  private int MA;//Magic attack
  private int MD;//Magic defense
  private int AG;//Agility
  private double CC;//Critical chance
  private double CD;//Critical damage

  //HP -Health point
  //MP -Magic point
  //Level -> Increase Max HP,Max MP
  //Static final 
  //private int maxHp;
  //private int maxMp;

  public Hero(int id,String name){
    this.id = id;
    this.name= name;
  }
  public int getId(){
    return this.id;
  }

  public int getMp(){
    return this.mp;
  }

  public int getHp(){
    return this.hp;
  }

  public int getLevel(){
    return this.level;
  }

  public int getPA(){
    return this.PA;
  }

  public int getPD(){
    return this.PD;
  }

  public int getMA(){
    return this.MA;
  }

  public int getMD(){
    return this.MD;
  }

  public int getAG(){
    return this.AG;
  }

  public double getCC(){
    return this.CC;
  }
  public double getCD(){
    return this.CD;
  }

  //Method:
  //Presentation: isAlive
  //Action: Level up: +MaxHp,+MaxMp,+AttackPower
  public boolean isAlive(){
    if (this.hp>0) {
      return true;
    }
    return false;
  }
  //Hero is a Parent Class;
  //Child Class : Archer,Mage,Warrior

  //attackPower
  //Weapon(1 weapon),

  public static Hero1 createCharacter(int id,Role role){
    switch (role) {
      case ARCHER:
        return new Archer1();
      case WARRIOR:
        return new Warrior(id);
      case MAGE:
        return new Mage(id);
      default:
        return null;
    }
  }

  public void levelup(){
    this.level++;
  //different role, will have different increase of HP & MP,need to write override method
  }




  //Method:
  //Presentation: isAlive
  //Action: Level Up
  public static void main(String[] args) {

  }
}
