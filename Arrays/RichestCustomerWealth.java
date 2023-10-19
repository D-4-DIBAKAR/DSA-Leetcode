public class RichestCustomerWealth {
     public static int maximumWealth(int[][] accounts) {
          int richestCustomer = Integer.MIN_VALUE;
          for (int i = 0; i < accounts.length; i++) {
               int maximumWealth = 0;
               for (int j = 0; j < accounts[0].length; j++) {
                    maximumWealth += accounts[i][j];
               }
               if (maximumWealth > richestCustomer) {
                    richestCustomer = maximumWealth;
               }

          }
          return richestCustomer;
     }

     public static void main(String[] args) {
          int nums[][] = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
          // int nums[][] = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
          // int nums[][] = { { 1, 2, 3 }, { 3, 2, 1 } };
          int ans = maximumWealth(nums);
          System.out.println(ans);
     }
}
