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
        
        int max = 0;
        for(int i =0;i<arr5.length-1;i++){
            if (arr5[i]>arr5[i+1]&& arr5[i]>max) {
                max = arr5[i];
            }else if (arr5[i]<arr5[i+1]&& arr5[i+1]>max) {
                max = arr5[i+1];
            }
        }
        
        System.out.println("max is :"+max);//99
        //find the min value in the int array
        int min =0;
        int[] arr6 = new int []{9,-8,-99,98};
        for(int i = 0;i<arr6.length-1;i++){
            if (arr6[i]<arr6[i+1]&& arr6[i]<max) {
                min = arr6[i];
            }else if (arr6[i]>arr6[i+1]&& arr6[i+1]<max) {
                min = arr6[i+1];
            }
        }
        System.out.println("min is :"+min);//-99
    }
}
