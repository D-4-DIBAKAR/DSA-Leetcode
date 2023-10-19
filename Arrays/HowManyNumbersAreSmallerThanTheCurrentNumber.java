public class HowManyNumbersAreSmallerThanTheCurrentNumber {
     public static int[] smallerNumbersThanCurrent(int[] nums) {
          int output[] = new int[nums.length];
          for (int i = 0; i < nums.length; i++) {
               int count = 0;
               for (int val : nums) {
                    if (val < nums[i]) {
                         ++count;
                    }
               }
               output[i] = count;
          }
          return output;
     }

     /*
      * Beats 100% with java user
      * int[] count = new int[101]; // The values are in the range [0, 100]
      * 
      * // Count the occurrences of each value in the input array
      * for (int num : nums) {
      * count[num]++;
      * }
      * 
      * int[] prefixCount = new int[101];
      * 
      * // Calculate the prefix sum of the count array
      * for (int i = 1; i <= 100; i++) {
      * prefixCount[i] = prefixCount[i - 1] + count[i - 1];
      * }
      * 
      * int[] result = new int[nums.length];
      * 
      * // Calculate the number of elements smaller than each value
      * for (int i = 0; i < nums.length; i++) {
      * result[i] = prefixCount[nums[i]];
      * }
      * 
      * return result;
      */

     /*
      * Here's how this optimized code works:
      * 
      * We create an array count of size 101 since the values in the input array are
      * in the range [0, 100]. This array will store the count of occurrences for
      * each value.
      * 
      * We iterate through the nums array and count the occurrences of each value.
      * 
      * We create the prefixCount array to store the prefix sum of the count array.
      * This gives us the count of elements smaller than or equal to each value.
      * 
      * Finally, we populate the result array with the counts of elements smaller
      * than each value based on the prefixCount array. The value at index i in
      * result corresponds to the number of elements smaller than nums[i].
      * 
      * This optimized code has a time complexity of O(n) and a space complexity of
      * O(1), as the count and prefixCount arrays are of constant size (101), and the
      * result array is not considered in the space complexity calculation. It's
      * significantly more memory-efficient and faster for large input arrays
      * compared to the original nested loop approach.
      */
     public static void main(String[] args) {
          int nums[] = { 8, 1, 2, 2, 3 };
          nums = smallerNumbersThanCurrent(nums);
          for (int i : nums) {

               System.out.print(i + " ");
          }
     }
}

/*
 * Given the array nums, for each nums[i] find out how many numbers in the array
 * are smaller than it. That is, for each nums[i] you have to count the number
 * of valid j's such that j != i and nums[j] < nums[i].
 * 
 * Return the answer in an array.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [8,1,2,2,3]
 * Output: [4,0,1,1,3]
 * Explanation:
 * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
 * For nums[1]=1 does not exist any smaller number than it.
 * For nums[2]=2 there exist one smaller number than it (1).
 * For nums[3]=2 there exist one smaller number than it (1).
 * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 * Example 2:
 * 
 * Input: nums = [6,5,4,8]
 * Output: [2,1,0,3]
 * Example 3:
 * 
 * Input: nums = [7,7,7,7]
 * Output: [0,0,0,0]
 * 
 * 
 * Constraints:
 * 
 * 2 <= nums.length <= 500
 * 0 <= nums[i] <= 100
 */