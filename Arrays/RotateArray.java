public class RotateArray {
     public static void printArray(int[] arr) {
          for (int i : arr) {
               System.out.print(i + " ");
          }
     }

     public static void reverse(int[] arr, int start, int end) {
          while (start < end) {
               int temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
               start++;
               end--;
          }
     }

     public static void rotateArray(int[] arr, int k) {
          int n = arr.length;
          k = k % n; // Handle cases where k is greater than the array length

          // Reverse the entire array
          reverse(arr, 0, n - 1);

          // Reverse the first 'k' elements
          reverse(arr, 0, k - 1);

          // Reverse the remaining elements
          reverse(arr, k, n - 1);
     }

     public static void main(String[] args) {
          int[] arr = { 1, 5, 0, 10, 6, 0, 2 };
          int k = 3;
          rotateArray(arr, k);
          printArray(arr);
     }
}
