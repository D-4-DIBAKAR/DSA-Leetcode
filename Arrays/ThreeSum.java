import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

     public static List<List<Integer>> threeSum(int[] nums) {

          // Sorting The Array For Applying 2 Pointer Method
          Arrays.sort(nums);

          // Creating the Result List To Be Returned
          List<List<Integer>> result = new LinkedList<>();

          // Outer Loop To Traverse Through All Elements And Stopping It Before The Last 2
          // Elements
          for (int i = 0; i < nums.length - 2; i++) {

               // Condition To Avoid Duplicates In The Result Array
               if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {

                    // Taking The Start As The Next Element To The Index Of Element In The Outer
                    // Loop
                    // Taking The End As The Index Of The Last Element In The Array
                    // This Works Only Because The Array Is Sorted.
                    int start = i + 1;
                    int end = nums.length - 1;

                    // To Get The Answer As Zero, We Set The Sum As -nums[i];
                    int sum = 0 - nums[i];

                    // 2 Pointers Traversing From the Beginning And End Of The Subarray
                    while (start < end) {

                         /*
                          * nums[start] + nums[end] = 0 - nums[i]
                          * equates to
                          * nums[start] + nums[end] + nums[i] == 0
                          */
                         if (nums[start] + nums[end] == sum) {

                              // Adding Result To The Result Array
                              result.add(Arrays.asList(nums[i], nums[start], nums[end]));

                              // Skipping Duplicate Elements In A Sorted Array From The Start
                              while (start < end && nums[start] == nums[start + 1]) {
                                   start++;
                              }
                              // Skipping Duplicate Elements In A Sorted Array From The End
                              while (start < end && nums[end] == nums[end - 1]) {
                                   end--;
                              }
                              // Skipping The Last Duplicates From Both Sides
                              start++;
                              end--;

                         }
                         // Moving Pointers From Both Sides Towards Mid Of The Array
                         else if (nums[start] + nums[end] < sum) {
                              start++;
                         } else {
                              end--;
                         }
                    }
               }
          }

          // Returning The Result Array
          return result;

     }

     public static void print(List<List<Integer>> List) {
          for (List<Integer> list : List) {
               System.out.println(list);
          }
     }

     public static void main(String[] args) {
          int nums[] = { -1, 0, 1, 2, -1, -4 };
          List<List<Integer>> List = threeSum(nums);
          print(List);
     }
}
/*
 * Given an integer array nums, return all the triplets [nums[i], nums[j],
 * nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
 * nums[k] == 0.
 * 
 * Notice that the solution set must not contain duplicate triplets.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not
 * matter.
 * Example 2:
 * 
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * Example 3:
 * 
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 */