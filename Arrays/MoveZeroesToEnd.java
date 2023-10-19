import java.util.Scanner;

public class MoveZeroesToEnd {
     // Print
     public static void printArray(int[] result) {
          for (int i = 0; i < result.length; i++) {
               System.out.print(result[i] + " ");
          }
     }

     public static int[] moveZeroesToEnd(int[] arr, int n) {
          // int j = 0;// Focus on zeroth elements
          // for (int i = 0; i < n; i++) {// 3 4 0 5 0 7
          // if (arr[i] != 0 && arr[j] == 0) {// i will Focus on non-zero elements
          // int temp = arr[i];
          // arr[i] = arr[j];
          // arr[j] = temp;
          // }
          // if (arr[j] != 0) {
          // j++;
          // }
          // }

          // beats 100% LeetCode
          int i = 0;
          for (int num : arr) {
               if (num != 0) {
                    arr[i] = num;
                    i++;
               }
          }

          while (i <= arr.length - 1) {
               arr[i] = 0;
               i++;
          }
          return arr;
     }

     public static void main(String[] args) {
          int size;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Size : ");
          size = sc.nextInt();
          System.out.println("Enter Array Elements");
          int arr[] = new int[size];
          for (int i = 0; i < size; i++) {
               arr[i] = sc.nextInt();
          }
          int[] result = moveZeroesToEnd(arr, size);
          printArray(result);
          sc.close();
     }
}
