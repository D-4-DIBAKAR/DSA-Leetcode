public class LeftAndRightSumDifference {
     public static int[] leftRightDifference(int[] nums) {
          int answer[] = new int[nums.length];
          int leftSum[] = new int[nums.length];
          int rightSum[] = new int[nums.length];
          int Lsum = 0;
          int Rsum = 0;

          // Calculate leftSum
          for (int i = 0; i < nums.length; i++) {
               if (i == 0) {
                    leftSum[i] = 0;
               } else {
                    Lsum += nums[i - 1];
                    leftSum[i] = Lsum;
               }
          }

          // Calculate rightSum
          for (int i = nums.length - 1; i >= 0; i--) {
               if (i == nums.length - 1) {
                    rightSum[i] = 0;
               } else {
                    Rsum += nums[i + 1];
                    rightSum[i] = Rsum;
               }
          }

          // Calculate absolute differences
          for (int i = 0; i < answer.length; i++) {
               answer[i] = Math.abs(leftSum[i] - rightSum[i]);
          }

          return answer;

     }

     public static void main(String[] args) {
          int nums[] = { 10, 4, 8, 3 };
          nums = leftRightDifference(nums);
          for (int i : nums) {
               System.out.print(i + " ");
          }
     }
     /*
      * 2574. Left and Right Sum Differences
      * Easy
      * Topics
      * Companies
      * Hint
      * Given a 0-indexed integer array nums, find a 0-indexed integer array answer
      * where:
      * 
      * answer.length == nums.length.
      * answer[i] = |leftSum[i] - rightSum[i]|.
      * Where:
      * 
      * leftSum[i] is the sum of elements to the left of the index i in the array
      * nums. If there is no such element, leftSum[i] = 0.
      * rightSum[i] is the sum of elements to the right of the index i in the array
      * nums. If there is no such element, rightSum[i] = 0.
      * Return the array answer.
      * 
      * 
      * 
      * Example 1:
      * 
      * Input: nums = [10,4,8,3]
      * Output: [15,1,11,22]
      * Explanation: The array leftSum is [0,10,14,22] and the array rightSum is
      * [15,11,3,0].
      * The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
      * Example 2:
      * 
      * Input: nums = [1]
      * Output: [0]
      * Explanation: The array leftSum is [0] and the array rightSum is [0].
      * The array answer is [|0 - 0|] = [0].
      * 
      * 
      * Constraints:
      * 
      * 1 <= nums.length <= 1000
      * 1 <= nums[i] <= 105
      */
}
