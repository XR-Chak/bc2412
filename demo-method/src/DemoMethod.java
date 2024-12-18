public class DemoMethod {

    //! sum(int x,int y) -> input parameters
    //! int -> return type

    //! "sum(int x, int y )"->method signature
    public static double sum(int x,double y){
        double result = x+y;
        return result;//the return value should align the return type 
    }
    public static int sum(int x,int y){
        return x+y;
    }
    public static double sum(double x,int y){
        double result = x+y;
        return result;//the return value should align the return type 
    }
    //Java doesn't allow "different type" for the same method signature


    //! Not Allowed: Same method signature
    //"sum(int a, int b)" = sum(int x,int y)
    //same method name + same parameter list
    // public static int sum(int a ,int b){
    //     return 1;
    // }

    public static int sum(int a,String b){
        return a+Integer.valueOf(b);//int + int -> int ->double(upcasting)
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

    public static int totalMinutes(int day){
        int minutes =0;
        for(int i =0;i<day;i++){
            for(int j=0;j<24;j++){
                minutes+=60;
            }
        }
        return minutes;
    }

    public static int countEven(int[] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }

    public static int countEven(long[] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
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
        String asd = "asdas";
        
        System.out.println(asd.toCharArray()[0]);
        sum(1,2.0);//sum(int x,double y);
        sum(1,2);//sum(intx ,int y)
        sum(1,2.0);//sum(double x,int y)

        System.out.println(sum(2,"123"));

        System.out.println(countEven(new long[]{1L,3L,2L,6L}));//2
        System.out.println(countEven(new int[]{1,3,2,6}));//2
    }
}
