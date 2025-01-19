import java.math.BigDecimal;
public class Archer extends Hero{
  private int maxHp = 70;
  private int maxMp = 60;
  private int hp;
  private int mp;
  private Role role = Role.ARCHER;
  private int level =1;
  private int PA = 25;//Physic attack
  private int PD = 15;//Physic defense
  private int MA = 10;//Magic attack
  private int MD=10;//Magic defense
  private int AG = 100;//Agility
  private double CC = 0.3;//Critical chance
  private double CDM = 1.4;//Critical damage multiplyer
  private double CD = BigDecimal.valueOf(this.PA).multiply(BigDecimal.valueOf(CDM)).doubleValue();//Critical damage
  private Weapon weapon = null;

  public Archer(int id,String name){
    super(id, name);
  }

  public Role getRole(){
    return this.role;
  }

  public int getMaxHp(){
    return Heros.getMaxHp(Role.ARCHER, super.getLevel());
  }

  public double[] getInfo(){
    double maxHp = this.maxHp;
    double maxMp = this.maxMp;
    double level = this.level;
    double PA = this.PA;
    double PD = this.PD;
    double MA = this.MA;
    double MD = this.MD;
    double AG = this.AG;
    double[] summary = new double[]{maxHp,maxMp,level,PA,PD,MA,MD,AG,CC,CD};
    return summary;
  }

  @Override
  public void levelup(){
    if (this.level<10) {
      System.out.println("Level Up!");
    this.level++;
    this.maxHp = Heros.getMaxHp(Role.ARCHER, this.level);
    this.maxMp = Heros.getMaxMp(Role.ARCHER, this.level);
    this.hp = this.maxHp;
    this.mp = this.maxMp;
    System.out.println("The maxHp is:"+this.maxHp+" "+"The maxMp is: "+this.maxMp);
    }else{
      System.out.println("Already max out level!!!");
    }
  }
  @Override
  public boolean equipWeapon(Weapon weapon){
    if (this.weapon==null && weapon.getWeaponType()==WeaponType.BOW) {
      this.weapon = weapon;
      System.out.println("Equiped!");
      return true;
    }else if (this.weapon==null && weapon.getWeaponType()!=WeaponType.BOW) {
      System.out.println("Archer can only equip bow");
      return false;
    }
    System.out.println("Already have weapon...");
    return false;
    
  }
  @Override
  public boolean removeWeapon(){
    if (this.weapon==null) {
      System.out.println("You don't have weapon..");
      return false;
    }else{
      this.weapon=null;
      System.out.println("removed weapon!");
      return true;
    }
  }
  @Override
  public boolean changeWeapon(Weapon weapon){
    if (this.weapon!=null && this.weapon==weapon) {
      System.out.println("They are the same weapon");
      return false;
    }else if (this.weapon!=null && this.weapon.getWeaponType()==WeaponType.BOW) {
      this.weapon = weapon;
      System.out.println("Weapon changed!");
      
      return true;
    }
    System.out.println("You don't have weapon ,cannot use this method");
    return false;
  }

  public static void main(String[] args) {
    Archer a1 = new Archer(1,"asd");
    a1.levelup();
    
  }

}
