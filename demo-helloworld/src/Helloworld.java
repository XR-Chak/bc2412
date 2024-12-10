public class Helloworld{
    public static void main(String[] args){
        // comment. Wellcome to boootcamp! @*!@asdhk()
        //asdd Datatype(primitive)
        // int --> integer
        //x, dayofWeek -> varible
        int x = 3;
        int dayOfWeek = 7;
        //int y = 0.33;// ! not ok,y is a varible that can store integer only.
        double y2 = 3.2 ;
        //double 2w = 3.2; ! not ok
        //varible naming convention
        // caml case: dayOfWeek, y2

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
    }
}
