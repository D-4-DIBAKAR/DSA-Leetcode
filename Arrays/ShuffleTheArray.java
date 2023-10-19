
public class ShuffleTheArray {
     public static int[] shuffle(int[] nums, int n) {
          int[] result = new int[2 * n];
          int index = 0;

          for (int i = 0; i < n; i++) {
               result[index] = nums[i]; // x1, x2, x3, ...
               result[index + 1] = nums[i + n]; // y1, y2, y3, ...
               index += 2; // Increment index by 2
          }

          return result;
     }

     public static void main(String[] args) {
          int nums[] = { 2, 5, 1, 3, 4, 7 };
          int n = 3;
          int ans[] = shuffle(nums, n);
          for (int i : ans) {
               System.out.print(i + " ");
          }
     }
}
