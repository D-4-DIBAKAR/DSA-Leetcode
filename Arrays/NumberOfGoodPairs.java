public class NumberOfGoodPairs {
     public static int numIdenticalPairs(int[] nums) {
          int goodPairsCount = 0;
          for (int i = 0; i < nums.length; i++) {
               for (int j = 0; j < nums.length; j++) {
                    if (i < j && nums[i] == nums[j]) {
                         ++goodPairsCount;
                    }
               }
          }

          return goodPairsCount;
     }

     public static void main(String[] args) {
          int nums[] = { 1, 2, 3, 1, 1, 3 };
          // int nums[] = { 1, 2, 1 };
          int arr = numIdenticalPairs(nums);
          System.out.println(arr);

     }
}
