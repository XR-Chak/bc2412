public class DemoString {
  public static void main(String[] args){
    String s ="hello";
    System.out.println(s.length());//5
    System.out.println(s.charAt(1));//e
    System.out.println("hello".equals(s));//true ,string check equal ned this can't use ==
    System.out.println(s.contains("ll"));//true,check contain the substring or not..
    System.out.println(s.contains("lll"));//false
    System.out.println(s.substring(0, 2));//he
    System.out.println(s.concat("!!!"));//hello!!! ,s still remain unchange
    System.out.println(s.startsWith("h"));//true
    System.out.println(s.startsWith("ha"));//false
    System.out.println(s.startsWith("hell"));
    System.out.println(s.endsWith("lo"));//true
    System.out.println(s.endsWith("oo"));//false
    System.out.println(s.toUpperCase());//HELLO
    System.out.println("HellO".toLowerCase());//hello

    System.out.println(s.replace("ll", "xxx"));//hexxxo
    System.out.println(s.replace('l', 'm'));//hemmo
    System.out.println(s.equalsIgnoreCase("HeLLo"));//true
    
    //****
    System.out.println(s.indexOf('e'));//1
    System.out.println(s.indexOf('h'));//0
    System.out.println(s.indexOf('x'));//-1
    System.out.println(s.indexOf("ll"));//2
    System.out.println(s.lastIndexOf('l'));//3
    System.out.println("hellollo".lastIndexOf("ll"));//5
    System.out.println(s.isEmpty());//false
    System.out.println("".isEmpty());//true
    System.out.println(" ".isEmpty());//true

    System.out.println(s.isBlank());//false
    System.out.println("".isBlank());//true
    System.out.println(" ".isBlank());//true

    System.out.println(" hel lo ".trim());//"hel lo" ,remove the space of head and tail
    System.out.println("abc".compareTo("bbb"));//-1 (a vs b)
    System.out.println("abc".compareTo("dbb"));//-3 (a vs d)
    System.out.println("abc".compareTo("azb"));//-25 (a vs z)

    //Chain method
    System.out.println("hello".concat("ijk").concat("def").toUpperCase());//HELLOIJKDEF
    //charAt() -> Find cahr by index
    //indexOf() -> Find index by char
  }
}
