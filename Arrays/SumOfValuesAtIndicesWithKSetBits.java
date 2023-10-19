import java.util.ArrayList;
import java.util.List;

public class SumOfValuesAtIndicesWithKSetBits {
     public static int countSetBits(int n) {
          int count = 0;
          while (n > 0) {
               count += n & 1;
               n >>= 1;
          }
          return count;
     }

     public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
          int totalSum = 0;
          for (int i = 0; i < nums.size(); i++) {
               int numSetBits = countSetBits(i);
               if (numSetBits == k) {
                    totalSum += nums.get(i);
               }
          }
          return totalSum;
     }

     public static void main(String[] args) {
          // [5,10,1,5,2]
          List<Integer> nums = new ArrayList<>();
          nums.add(4);
          nums.add(3);
          nums.add(2);
          nums.add(1);
          int k = 2;
          k = sumIndicesWithKSetBits(nums, k);
          System.out.println(k);
     }
     /*
      * You are given a 0-indexed integer array nums and an integer k.
      * 
      * Return an integer that denotes the sum of elements in nums whose
      * corresponding indices have exactly k set bits in their binary representation.
      * 
      * The set bits in an integer are the 1's present when it is written in binary.
      * 
      * For example, the binary representation of 21 is 10101, which has 3 set bits.
      * 
      * 
      * Example 1:
      * 
      * Input: nums = [5,10,1,5,2], k = 1
      * Output: 13
      * Explanation: The binary representation of the indices are:
      * 0 = 0002
      * 1 = 0012
      * 2 = 0102
      * 3 = 0112
      * 4 = 1002
      * Indices 1, 2, and 4 have k = 1 set bits in their binary representation.
      * Hence, the answer is nums[1] + nums[2] + nums[4] = 13.
      * Example 2:
      * 
      * Input: nums = [4,3,2,1], k = 2
      * Output: 1
      * Explanation: The binary representation of the indices are:
      * 0 = 002
      * 1 = 012
      * 2 = 102
      * 3 = 112
      * Only index 3 has k = 2 set bits in its binary representation.
      * Hence, the answer is nums[3] = 1.
      * 
      * 
      * Constraints:
      * 
      * 1 <= nums.length <= 1000
      * 1 <= nums[i] <= 105
      * 0 <= k <= 10
      */
}
