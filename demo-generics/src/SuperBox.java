public class SuperBox<T extends Animal,U extends Hero1,V extends Weapon> {
  private T animal;
  private U hero;
  private V weapon;

  public SuperBox(){

  }

  public void setAnimal(T animal){
    this.animal = animal;
  }

  public void setHero(U hero){
    this.hero = hero;
  }

  public void setWeapon(V weapon){
    this.weapon = weapon;
  }

  public double totalAttack(){
    return this.animal.run()+this.hero.attack()+this.weapon.onTopAttack() * 1.5;
  }
  public static void main(String[] args) {
    SuperBox<Animal,Hero1,Weapon> s1= new SuperBox<>();
    s1.setAnimal(new Tiger("asd"));
    s1.setHero(new Archer1());
    s1.setWeapon(new Bow());
    System.out.println(s1.totalAttack());
    s1.setAnimal(new Panda());
    s1.setWeapon(new Sword());
    System.out.println(s1.totalAttack());
  }
}
