public class DemoInteger {
  public static void main(String[] args) {
    Integer x =3;//auto Box
    Integer x2 =3;
    //2 reference, 1 object (Internal Cache)
    System.out.println(System.identityHashCode(x));//1841205829
    System.out.println(System.identityHashCode(x2));//1841205829

    Integer x3 = new Integer(3);
    System.out.println(System.identityHashCode(x3));//112810359
    Integer x4 = Integer.valueOf(3);
    System.out.println(System.identityHashCode(x4));//1841205829

    //Cache Range: -128 to 127
    Integer x5 = 128;
    Integer x6 = 128;
    System.out.println(System.identityHashCode(x5));//2124308362
    System.out.println(System.identityHashCode(x6));//146589023
    Integer x7 = new Integer(128);
    Integer x8 = new Integer(128);
    System.out.println(System.identityHashCode(x7));//1482968390
    System.out.println(System.identityHashCode(x8));//349885916

    //same situations for Byte ,Short,Long,Character
    Character1 c1 ='a';
    Character1 c2 ='a';
    System.out.println(System.identityHashCode(c1));//344639057
    System.out.println(System.identityHashCode(c2));//344639057

    Character1 c3 = '你';
    Character1 c4 = '你';
    System.out.println(System.identityHashCode(c3));//414493378
    System.out.println(System.identityHashCode(c4));//1984697014

    Boolean b1 = true;
    Boolean b2 = true;
    System.out.println(System.identityHashCode(b1));//205029188
    System.out.println(System.identityHashCode(b2));//205029188

    //Not support Internal Cache: Float & Double
    Double d1 =10.3;
    Double d2 =10.3;
    System.out.println(System.identityHashCode(d1));//1309552426
    System.out.println(System.identityHashCode(d2));//1943105171


    Float f1 = 10.3f;
    Float f2 =10.3f;
    System.out.println(System.identityHashCode(f1));//1704856573
    System.out.println(System.identityHashCode(f2));//705927765

    //Most Important !!!
    //>,<,>=,<=,==,!= for primitive only!!(integer,double,long,short,boolean) non primitive(Integer,Double,Boolean...)
    Double d3 =12.0;
    Double d4 =11.9;
    if (d3>10.0) {//Not ok!!!!
      
    }
    if (d3.compareTo(d4)>0) { 
      System.out.println(d3.compareTo(d4));
      System.out.println("d3>d4");
    }
    if (d3.compareTo(d4)<0) {
      System.out.println(d3.compareTo(d4));
      System.out.println("d3<d4");
    }

    Double d7 = 10.1;
    Double d8 = 10.1;
    if (d7.equals(d8)) { //or d7.compareTo(d8) ==0;
      System.out.println("d7=d8");
    }

    //ok
    if(d3>3.0){//3.0->double
      //because 3.0 -> primitive double -> d3 auto convert to double
      System.out.println("d3>3.0");
    }
  }
}
