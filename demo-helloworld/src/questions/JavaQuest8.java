package questions;

public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax=0;
    int max = 0;
    // code here ...
    int index = 0;
    for(int i=0;i<nums.length-1;i++){
      if (nums[i]>nums[i+1]&&nums[i]>max) {
        max = nums[i];
        index = i+1;
      }else if (nums[i+1]>nums[i] && nums[i+1]>max) {
        max = nums[i+1];
        index =i+1;
      }
    }
    System.out.println(max+" "+index);
    nums[index] = 0;
    for(int i=0;i<nums.length-1;i++){
      if (nums[i]>nums[i+1]&&nums[i]>secondMax) {
        secondMax = nums[i];
      }else if (nums[i+1]>nums[i] && nums[i+1]>max) {
        secondMax = nums[i+1];
      }
    }
    System.out.println(secondMax);
  }
}
