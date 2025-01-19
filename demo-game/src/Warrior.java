public class Warrior extends Hero{
  private int maxHp = 80;
  private int maxMp;
  private int hp;
  private int mp;
  private Role role;
  private int level =1;

  private int PA;//Physic attack
  private int PD;//Physic defense
  private int MA;//Magic attack
  private int MD;//Magic defense
  private int AG;//Agility
  private double CC;//Critical chance
  private double CD;//Critical damage
  public Warrior(int id,String name){
    super(id,name);
  }

  public Role getRole(){
    return this.role;
  }

  @Override
  public void levelup(){
    if (this.level<10) {
      System.out.println("Level Up!");
    this.level++;
    this.maxHp = Heros.getMaxHp(Role.WARRIOR, this.level);
    this.maxMp = Heros.getMaxMp(Role.WARRIOR, this.level);
    this.hp = this.maxHp;
    this.mp = this.maxMp;
    System.out.println("The maxHp is:"+this.maxHp+" "+"The maxMp is: "+this.maxMp);
    }else{
      System.out.println("Already max out level!!!");
    }
  }
  
}
