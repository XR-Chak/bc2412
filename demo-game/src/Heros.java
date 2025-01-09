public class Heros {
    //MaxHp
    private static final int[][] ARC_TAB = new int[7][10];//Max is level 10!
    private static final int[][] WAR_TAB = new int[7][10];
    private static final int[][] MAG_TAB = new int[7][10];

    private static final int ROW_MAX_HP =0;
    private static final int ROW_MAX_MP =1;
    private static final int ROW_PA =2;
    private static final int ROW_PD =3;
    private static final int ROW_MA =4;
    private static final int ROW_MD =5;
    private static final int ROW_AG =6;


    static {//static block
      ARC_TAB[ROW_MAX_HP] = new int[]{80,90,100,110,120,130,140,150,160,170};
      ARC_TAB[ROW_MAX_MP] = new int[]{60,68,76,84,92,100,108,116,124,132};
      ARC_TAB[ROW_PA] = new int[]{25,30,35,40,45,50,55,60,65,70};
      ARC_TAB[ROW_PD] = new int[]{15,17,19,21,23,25,27,29,31,33};
      ARC_TAB[ROW_MA] = new int[]{10,16,22,28,34,40,46,52,58,64};
      ARC_TAB[ROW_MD] = new int[]{10,15,20,25,30,35,40,45,50,55};
      ARC_TAB[ROW_AG] = new int[]{100,108,116,124,132,140,148,156,164,172};

      WAR_TAB[ROW_MAX_HP] = new int[]{100,120,140,160,180,200,220,240,260,280};
      WAR_TAB[ROW_MAX_MP] = new int[]{40,44,48,52,56,60,64,68,72,76};
      WAR_TAB[ROW_PA] = new int[]{30,38,46,54,62,70,78,86,94,102};
      WAR_TAB[ROW_PD] = new int[]{20,28,36,44,52,60,68,76,84,92};
      WAR_TAB[ROW_MA] = new int[]{5,7,9,11,13,15,17,19,21,23,25};
      WAR_TAB[ROW_MD] = new int[]{5,7,9,11,13,15,17,19,21,23,25};
      WAR_TAB[ROW_AG] = new int[]{60,62,64,66,68,70,72,74,76,78};

      MAG_TAB[ROW_MAX_HP] = new int[]{80,95,110,125,140,155,170,185,200,215};
      MAG_TAB[ROW_MAX_MP] = new int[]{90,102,114,126,138,150,162,174,186,198};
      MAG_TAB[ROW_PA] = new int[]{15,18,21,24,27,30,33,36,39,42};
      MAG_TAB[ROW_PD] = new int[]{10,12,14,16,18,20,22,24,26,28};
      MAG_TAB[ROW_MA] = new int[]{25,35,45,55,65,75,85,95,105,115};
      MAG_TAB[ROW_MD] = new int[]{15,23,31,39,47,55,63,71,79,87};
      MAG_TAB[ROW_AG] = new int[]{50,54,58,62,66,70,74,78,82,86};
    }
    public static int getMaxHp(Role role,int level){
      switch (role) {
        case ARCHER:
          return ARC_TAB[ROW_MAX_HP][level-1];
          case WARRIOR:
          return WAR_TAB[ROW_MAX_HP][level-1];
          case MAGE:
          return MAG_TAB[ROW_MAX_HP][level-1];
          default:
          break;
      }
      return -1;
    }

    public static int getMaxMp(Role role,int level){
      switch (role) {
        case ARCHER:
          return ARC_TAB[ROW_MAX_MP][level-1];
          case WARRIOR:
          return WAR_TAB[ROW_MAX_MP][level-1];
          case MAGE:
          return MAG_TAB[ROW_MAX_MP][level-1];
          default:
          break;
      }
      return -1;
    }

    public static int getPA(Role role,int level){
      switch (role) {
        case ARCHER:
          return ARC_TAB[ROW_PA][level-1];
          case WARRIOR:
          return WAR_TAB[ROW_PA][level-1];
          case MAGE:
          return MAG_TAB[ROW_PA][level-1];
          default:
          break;
      }
      return -1;
    }


    public static int getPD(Role role,int level){
      switch (role) {
        case ARCHER:
          return ARC_TAB[ROW_PD][level-1];
          case WARRIOR:
          return WAR_TAB[ROW_PD][level-1];
          case MAGE:
          return MAG_TAB[ROW_PD][level-1];
          default:
          break;
      }
      return -1;
    }
    public static int getMA(Role role,int level){
      switch (role) {
        case ARCHER:
          return ARC_TAB[ROW_MA][level-1];
          case WARRIOR:
          return WAR_TAB[ROW_MA][level-1];
          case MAGE:
          return MAG_TAB[ROW_MA][level-1];
          default:
          break;
      }
      return -1;
    }
    public static int getMD(Role role,int level){
      switch (role) {
        case ARCHER:
          return ARC_TAB[ROW_MD][level-1];
          case WARRIOR:
          return WAR_TAB[ROW_MD][level-1];
          case MAGE:
          return MAG_TAB[ROW_MD][level-1];
          default:
          break;
      }
      return -1;
    }
    public static int getAG(Role role,int level){
      switch (role) {
        case ARCHER:
          return ARC_TAB[ROW_AG][level-1];
          case WARRIOR:
          return WAR_TAB[ROW_AG][level-1];
          case MAGE:
          return MAG_TAB[ROW_AG][level-1];
          default:
          break;
      }
      return -1;
    }
    public static void main(String[] args) {
      System.out.println(Heros.getMaxHp(Role.ARCHER, 10));
      System.out.println(Heros.getAG(Role.WARRIOR, 8));

    }
}
