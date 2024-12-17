public class DemoMethod {

    //! sum(int x,int y) -> input parameters
    //! int -> return type
    public static int sum(int x,int y){
        int result = x+y;
        return result;//the return value should align the return type 
    }
    public static double del(double x, double y){
                double result = x-y;
                return result;
    }


    public static double substract(double x,double y){
        return x-y;
    }

    //source -> hello
    //target 'l'
    //return 2
    public static int countCharacter(String source,char target){

        int count=0;
        for(int i=0;i<source.length();i++){
            if (source.charAt(i)==target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int x =3;
        int a = 10;
        int b= 11;
        int y = a+b;
        System.out.println(y);//21
        a = 19;
        b=21;
        y = a+b;
        System.out.println(y);//40

        //call
        y= sum(10,11);
        System.out.println(y);//21
        y= sum(19,21);
        System.out.println(y);//40

        //call del method
        double z = del(5.0, 1.0);
        System.out.println(z);

        System.out.println(substract(100, 98));//100.0-98.0->2.0
        System.out.println(countCharacter("hello", 'l'));
        System.out.println(countCharacter("abc", 'l'));
    }
}
