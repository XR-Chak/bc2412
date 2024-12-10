public class DemoDataType{
    public static void main(String[] args){
        // comment. Wellcome to boootcamp! @*!@asdhk()
        //asdd Datatype(8 primitives)
        // int --> integer
        //x, dayofWeek -> varible
        int x = 3;
        int dayOfWeek = 7;
        //int y = 0.33;// ! not ok,y is a varible that can store integer only.
        double y2 = 3.2 ;
        //double 2w = 3.2; ! not ok
        //varible naming convention
        // caml case: dayOfWeek, y2


        //int x=102; cannot declare twice
        //Re-assignment
        x = 101;// re-assign 101 to x ,from right to left
        x = x+10;// right:101 +10, left: assign 111 to x
        x = x-40;//111-40-> 71
        x = x*3;//71*3->213
        x = x/213;// 213/213
        System.out.println(x);//1
        x = x+ 8*2 /4 +1;
        System.out.println(x);//6
        x= (x+2) * 2 /(3+1);
        System.out.println(x);//4
        x = ((x+3)/(6+1))*(x+1);
        
        //variable declaration
        int x100;
        //Value Assignment
        x100 = 9;

        System.out.println(x);//5
        //divide
        int x2= 5/4;
        //step 1: 3->int value, 2->int value

        //step 2: int value /int value ->int value

        //step 3: 3/2 -> 1
        //step 4: assign 1 (int value) to int type variable (ok!)
        System.out.println(x2);

        double x3 = 3.0/2;
        //step 1: 3->double,2->int
        //step 2: double value/ int value-> double value
        //step 3: 3.0/2.0 ->1.5
        //step 4: assign 1.5(double value) to double type varible
        System.out.println(x3); // 1.5

        //divide by zero
        // int f = 10/0;
        // System.out.println(f); //! error

        // 0/10
        System.out.println(0/10);

        //int x5 = 3.0/2;
        //step 1: 3->double,2->int
        //step 2: double value/ int value-> double value
        //step 3: 3.0/2.0 ->1.5
        //step 4: assign 1.5(double value) to int type varible(downcasting)
        // not allow assign a hjigher level value to a lower type of varible
        //int -> double(upcast)
        //double -> int (downcast) downcast is not allowed in Java!!!!!

        //Store integer.Java: int ,byte,short,long
        int value = 1000000;
        int value2 = 1_000_000;
        int maxInteger = 2147000000;
        System.out.println(value2);
        //!Byte -128 to 127
        //assign an int value to byte type variable
        byte b1 = -128;
        byte b2 =127;
        
        //-32768 -> int value
        short s1 = -32768;
        short s2 = 32767;
        // !long
        //2_147_483_648 -> int value
        int x1 = 10;
        //! Declare a hardcode long value, you should always add "L"
        
        //long l1 = 2147483648
        //Step 1: declare an int value (not ok!!!!)
        //Step 2: convert an int value to long type
        long l1 = 2_147_483_648L;// "L" ->declare it is a long value

        //float->double(double is more accurate than float!!!!!!!!)
        double d1 = 10.2;//10.2 ->double value
        double d2 =10.2d;//10.2d -> double value
        float f1 = 10.2f;//10.2f -> float value,float must need a f inside
        float f2 = 100000000000000000000.22222222222222222222222222222222222f;
        float f4 =10.2f;
        //conversion
        double d3 = 10.23f;//we can assign a float value to double variable

        double d4 = 10.2f;//upcasting(float->double)
        double d5 = f4 + 10.2d;
        System.out.println(d5);//20.3999998092651
        double d6 = 0.2+0.1;
        System.out.println(d6);//0.3000000000004
        double d7 = 0.2+0.2;
        System.out.println(d7);

        //char
        char c = 'x';
        char c2 = '1';
        char c3 = '!';
        char c4 = ' ';
        //char c5 = '';//!at least one character

        //boolean
        boolean b = true;
        boolean b10 = false;
        boolean isSmoker = false;
        int age =66;
        boolean isElderly = age > 65;// asking if age>65?
        System.out.println(isElderly);

        int age2 = 18;
        boolean isAdult = age2>=18;
        System.out.println(isAdult);//true



    }
}
