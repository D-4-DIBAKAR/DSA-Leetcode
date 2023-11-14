import java.util.ArrayList;
import java.util.List;

public class SubArrayDistinctSumSquareI {
     public static int sumCounts(List<Integer> nums) {
          final int n = nums.size();
          if (n == 1)
               return 1;
          final int[] numsArr = new int[n];
          for (int i = 0; i < n; i++)
               numsArr[i] = nums.get(i);

          final int[] prev = new int[n];
          final int[] foundAt = new int[101];
          boolean dupFound = false;
          for (int i = 0; i < n;) {
               if ((prev[i] = foundAt[numsArr[i]] - 1) >= 0)
                    dupFound = true;
               foundAt[numsArr[i]] = ++i;
          }

          if (!dupFound)
               return (((((n + 4) * n + 5) * n) + 2) * n) / 12;

          int result = 0;
          for (int start = n - 1; start >= 0; start--) {
               int distinctCount = 0;
               for (int i = start; i < n; i++) {
                    if (prev[i] < start)
                         distinctCount++;
                    result += distinctCount * distinctCount;
               }
          }
          return result;
     }

     public static void main(String[] args) {
          List<Integer> nums = new ArrayList<>();
          nums.add(1);
          nums.add(2);
          nums.add(1);
          int result = sumCounts(nums);
          System.out.println(result); // Output: 15
     }
}
