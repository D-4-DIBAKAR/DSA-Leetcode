public class SumOfAllOddLengthSubarrays {
     public static int sumOddLengthSubarrays(int[] arr) {
          int n = arr.length;
          int result = 0;

          for (int i = 0; i < n; i++) {
               int leftCount = i;
               int rightCount = n - i - 1;
               int total = ((leftCount + 1) * (rightCount + 1) + 1) / 2; // Adjusted for odd-length subarrays
               int sum = total * arr[i];
               result += sum;
          }

          return result;
     }

     public static void main(String[] args) {
          int arr[] = { 1, 4, 2, 5, 3 };
          System.out.println(sumOddLengthSubarrays(arr));
     }

     /*
      * Given an array of positive integers arr,return the sum of all possible
      * odd-length subarrays of arr. A subarray is a contiguous subsequence of the
      * array.
      * Example 1:
      * 
      * Input:arr=[1,4,2,5,3]Output:58 Explanation:
      * The odd-
      * length subarrays
      * of arr
      * and their
      * sums are:[1]=1[4]=4[2]=2[5]=5[3]=3[1,4,2]=7[4,2,5]=11[2,5,3]=10[1,4,2,5,3]=15
      * If we
      * add all
      * these together
      * we get 1+4+2+5+3+7+11+10+15=58 Example 2:
      * 
      * Input:arr=[1,2]Output:3 Explanation:
      * There are only 2
      * subarrays of
      * odd length,[1]and[2].
      * Their sum is 3. Example 3:
      * 
      * Input:arr=[10,11,12]Output:66
      * 
      * Constraints:
      * 
      * 1<=arr.length<=100 1<=arr[i]<=1000
      */
}