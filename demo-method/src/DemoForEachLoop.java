public class DemoForEachLoop {
  public static void main(String[] args) {
    //for loop,while loop,for-each loop
    int[] arr = new int[]{3,4,5};
    for(int i=0;i<arr.length;i++){//Just get one value for each iteration
      System.out.println(arr[i]);
    }

    //3+4
    //4+5
    for(int i=0;i<arr.length-1;i++){//can get more than 1 iteration value from 1 iteration
      System.out.println(arr[i]+arr[i+1]);
    }

    //for each
    for (int integer :arr) {//Just get one value for each iteration
      System.out.println(integer);
    }

  
    char[] arr2 = new char[]{'p','t','e'};
    //for-each loop->"pte"
    String s = "";
    for (char c : arr2) {
      s = s+c;
    }
    System.out.println(s);

    String[] arr3 = new String[] {"abc","ijk","def"};
    String target = "ijk";
    //true
    for (String string : arr3) {
      if (string.equals(target)) {
        System.out.println(true);
      }
    }

    

  }
}
