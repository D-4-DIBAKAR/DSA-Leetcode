public class BuildArrayFromPermutation {
     public static int[] buildArray(int[] nums) {
          int ans[] = new int[nums.length];
          for (int i = 0; i < nums.length; i++) {
               ans[i] = nums[nums[i]];
          }

          return ans;
     }

     public static void main(String[] args) {
          int nums[] = { 0, 2, 1, 5, 3, 4 };
          // int nums[] = { 1, 2, 1 };
          int arr[] = buildArray(nums);
          for (int i : arr) {
               System.out.print(i + " ");
          }
     }
}
