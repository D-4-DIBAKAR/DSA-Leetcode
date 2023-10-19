public class NumberOfEmployeesWhoMetTheTarget {
     public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
          int ans = 0;
          for (int i = 0; i < hours.length; i++) {
               if (hours[i] >= target) {
                    ++ans;

               }
          }
          return ans;
     }

     public static void main(String[] args) {
          int hours[] = { 0, 1, 2, 3, 4 };
          int target = 2;
          int ans = numberOfEmployeesWhoMetTarget(hours, target);
          System.out.println(ans);
     }
}
