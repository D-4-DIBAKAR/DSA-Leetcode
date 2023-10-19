public class ConcatenationOfArray {
     public static int[] getConcatenation(int[] nums) {
          int arr[] = new int[2 * nums.length];
          for (int i = 0; i < nums.length; i++) {
               arr[i] = nums[i];
               arr[i + nums.length] = nums[i];
          }
          return arr;
     }

     public static void main(String[] args) {
          int nums[] = { 1, 3, 2, 1 };
          // int nums[] = { 1, 2, 1 };
          int arr[] = getConcatenation(nums);
          for (int i : arr) {
               System.out.print(i + " ");
          }
     }
}
