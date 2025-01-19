import java.util.Objects;

public abstract class Weapon {
  private int level=1;
  private int PA;
  private int MA;
  private int CC;//Critical chance
  private WeaponType weaponType;
  public Weapon(WeaponType weaponType){
    this.weaponType = weaponType;
  }

  public void levelup(){
    if (this.level<3) {
      this.level++;
      System.out.println("Level up!");
    }
    else{
      System.out.println("Already max out level");
    }
  }



  public WeaponType getWeaponType(){
    return this.weaponType;
  }

  
  public class Weapons{

    private static final int[][] ARCHANGEL_TAB = new int[3][3];//3 values,3 level
    private static final int[][] LIANDRY_TAB = new int[3][3];
    private static final int[][] DORAN_TAB = new int[3][3];
    private static final int[][] HEXDRINKER_TAB = new int[3][3];
    private static final int[][] RECURVE_TAB = new int[3][3];
    private static final int[][] GUINSOO_TAB = new int[3][3];

    private static final int ROW_PA = 0;
    private static final int ROW_MA = 1;
    private static final int ROW_CC = 2;
    static {
      ARCHANGEL_TAB[ROW_PA] = new int[]{5,10,15};
      ARCHANGEL_TAB[ROW_MA] = new int[]{10,15,20};
      ARCHANGEL_TAB[ROW_CC] = new int[]{5,10,15};

      LIANDRY_TAB[ROW_PA] = new int[]{6,11,16};
      LIANDRY_TAB[ROW_MA] = new int[]{6,11,16};
      LIANDRY_TAB[ROW_CC] = new int[]{6,11,16};

      DORAN_TAB[ROW_PA] = new int[]{5,10,15};
      DORAN_TAB[ROW_MA] = new int[]{5,10,15};
      DORAN_TAB[ROW_CC] = new int[]{5,10,15};

      HEXDRINKER_TAB[ROW_PA] = new int[]{6,11,16};
      HEXDRINKER_TAB[ROW_MA] = new int[]{6,11,16};
      HEXDRINKER_TAB[ROW_CC] = new int[]{6,11,16};

      RECURVE_TAB[ROW_PA] = new int[]{5,10,15};
      RECURVE_TAB[ROW_MA] = new int[]{5,10,15};
      RECURVE_TAB[ROW_CC] = new int[]{5,10,15};

      
      GUINSOO_TAB[ROW_PA] = new int[]{6,11,16};
      GUINSOO_TAB[ROW_MA] = new int[]{6,11,16};
      GUINSOO_TAB[ROW_CC] = new int[]{6,11,16};
    }
  }
public static void main(String[] args) {
  
}
}
