import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) throws Exception {
        int x1 = 3;
        int x2 = 10;
        int x3 = 11;

        //declare array
        int[] arr = new int[3];
        //assign value to array 
        arr[0]=3;
        arr[1]=10;
        arr[2]=11;
        // for loop -> read array values
        // print all values ,which >=10
        for (int i =0;i<arr.length;i++){ //i=0,1,2
            if (arr[i]>=10) {
                System.out.println(arr[i]);
            }
        }

        //declare double array ,length =5
        //assign 10.4,4.3,3.3,1.9,9.9
        //sum up all values in the double array
        double[] arr2 = new double[5];
        arr2[0] = 10.4;
        arr2[1] = 4.3;
        arr2[2] = 3.3;
        arr2[3] = 1.9;
        arr2[4] = 9.9;

        double sum=0 ;
        for(int i =0;i<arr2.length;i++){
            sum = sum + arr2[i];
            System.out.println(sum);
        }

        //"abc","def","ijk"
        //"abc"
        String[] arr3 = new String[3];
        arr3[0] = "abc";
        arr3[1] = "def";
        arr3[2] = "ijk";
        String target = "abc";
        boolean isTargetExist = false;
        for(int i =0;i<arr3.length;i++){
            if (target.equals(arr3[i])) {
                isTargetExist = true;
            }
            System.out.println(isTargetExist);
        }

        char[] arr4 = new char[]{'b','c','a'};// the same as upward array assign step!
        //convert the char value to int value,and then assign them to a new int array
        //98,99,97

        int[] arr5 = new int[3];
        for(int i =0;i<arr4.length;i++){
            arr5[i]=arr4[i];//char value -> int variable
        }
        for(int i =0;i<arr5.length;i++){
            System.out.println(arr5[i]);
        }
        //find the max ascii value in the int value
        //Step 1:i=0, 98>0 ->true->put 98 to max
        //Step 2:i=1,99>98 ->true->put 99 to max
        //Step 3:i=2,97>99 ->false->exit
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr5.length-1;i++){
            if (arr5[i]>arr5[i+1]&& arr5[i]>max) {
                max = arr5[i];
            }else if (arr5[i]<arr5[i+1]&& arr5[i+1]>max) {
                max = arr5[i+1];
            }
        }
        
        System.out.println("max is :"+max);//99
        //find the min value in the int array
        int min =Integer.MAX_VALUE;//int max value
        int[] arr6 = new int []{9,-8,-99,98};
        for(int i = 0;i<arr6.length-1;i++){
            if (arr6[i]<arr6[i+1]&& arr6[i]<max) {
                min = arr6[i];
            }else if (arr6[i]>arr6[i+1]&& arr6[i+1]<max) {
                min = arr6[i+1];
            }
        }
        System.out.println("min is :"+min);//-99

        //array sum
        int[] arr7 = new int[]{9,8,99,98};
        int sum2= 0;
        for(int i =0;i<arr7.length;i++){
           sum2 =  sum2 + arr7[i];
        }
        System.out.println("the array sum:"+sum2);

        //swap
        int left = 7;
        int right =9;
        int tempOfLeft= left;//back up the left
        left = right;
        right = tempOfLeft;
        System.out.println(left+" "+right);
        
        //array
        int[] arr9 = new int[]{9,-8,109,99,98};
        int sum3 = 0;
        for(int i = 0;i<arr9.length-1;i++){
            sum3 = arr9[i]+arr9[i+1];
            System.out.println("sum3 is : "+sum3);
        }
        //print 1 (9+ -8)
        //print 101 (-8+109)
        //...
        //print 197(99+98)
        
        //array swap
        int[] arr8 = new int[]{9,-8,109,99,98};
        //move max value to the tail;
        //for loop + swap
        //9,-8,109,99,98
        //-8,9,109,99,98
        //-8,9,109,99,98
        //-8,9,99,109,99,98
        //
        int temp=0;
        for(int i =0;i<arr8.length-1;i++){
            if (arr8[i]>arr8[i+1]) {
                temp = arr8[i];//back up
                arr8[i]=arr8[i+1];
                arr8[i+1]=temp;
            }
            
        }
        


        System.out.println(Arrays.toString(arr8));//expected output:[x,x,x,x,109]
        
        Integer[] arr22 = new Integer[]{9,6,4};
        //products for all number
        int products = 1;
        for(int i =0;i<arr22.length;i++){
            products = products * arr22[i];
        }
        System.out.println(products);

        double[] prices = new double[]{8.2,6.5,10.5};
        int[] quantities = new int[]{9,8,3};
        //8.2x9+6.5x8+10.5x3
        double sumProduct =0;
        for(int i =0;i<prices.length;i++){
            sumProduct = sumProduct+prices[i]*quantities[i];
            System.out.println(sumProduct);
        }

        String s = String.valueOf(123);
        System.out.println(s);//"123"
        s =String.valueOf(true);
        s= String.valueOf(s);//true
        System.out.println(s);
        System.out.println(String.valueOf('A'));//"A"

        Integer i1 = Integer.valueOf("123");
        System.out.println(i1);//123
        //Integer i2 = Integer.valueOf("h");java.lang.NumberFormatException
        //"hello" -> 'h','e','l','l','o'
        char[] chArr ="hello".toCharArray();
        char cTemp;
        for(int i=0;i<chArr.length/2;i++){
            //chArr[i] vs chArr[chArr.length-i]
            cTemp = chArr[i];
            chArr[i]=chArr[chArr.length-1-i];
            chArr[chArr.length-1-i] = cTemp;
        }
        System.out.println(chArr);
        String result = "";
        for(int i=0;i<chArr.length;i++){
            result = result + chArr[i];
        }
        System.out.println(result);


        //System.out.println(chArr);
        //h -> i,e ->f,l->m,o->p
        //ifmmp
        chArr = "hello".toCharArray();
        int asii = 0;
        char[] chArr2 = new char[4];
        for(int i =0;i<chArr.length;i++){
            chArr[i] = (char)(chArr[i] +1);
            
        }
        System.out.println(String.valueOf(chArr));//"ifmmp",char Array -> String

        //assume we have small letter only
        char[] arr12 = new char[]{'p','a','p','b','a','p'};
        //more than one loop

        char maxNumChar='j';
        int maxCount = 0;

        
        for(int i=0;i<arr12.length-1;i++){
            int count = 0;
            for(int j =0;j<arr12.length-1;j++){
                if (arr12[i]==arr12[j]) {
                    count++;
                }

                if (count>maxCount) {
                    maxCount = count;
                    maxNumChar = arr12[i];
                }
            }
                
        }
        

        System.out.println(maxNumChar);//p

        //example:
        float[] num1 = new float[4];
        num1[0] = 0.8f;
        num1[1] = 1;


    }
}
