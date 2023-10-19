public class RunningSumOfOneDimensionalArray {
     public static int[] runningSum(int[] nums) {
          int sum = 0;
          // for (int i = 0; i < nums.length; i++) {
          // sum += nums[i];
          // output[i] = sum;
          // }
          int index = 0;
          for (int i : nums) {
               sum += i;
               nums[index] = sum;
               ++index;
          }
          return nums;
     }

     public static void main(String[] args) {
          int nums[] = { 1, 2, 3, 4 };
          nums = runningSum(nums);
          for (int i : nums) {

               System.out.print(i + " ");
          }
     }
}

/*
 * Example 1:
 * 
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * 
 * Example 2:
 * 
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1,
 * 1+1+1+1+1].
 * 
 * Example 3:
 * 
 * Input: nums = [3,1,2,10,1]
 * Output: [3,4,6,16,17]
 */