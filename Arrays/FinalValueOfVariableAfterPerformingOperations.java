public class FinalValueOfVariableAfterPerformingOperations {
     public static int finalValueAfterOperations(String[] operations) {
          int X = 0;// initially X=0
          for (String operation : operations) {
               if (operation.contains("++X") || operation.contains("X++")) {
                    X++;
               } else {
                    X--;
               }
          }

          return X;
          /*
           * Beats 100%
           * public int finalValueAfterOperations(String[] operations) {
           * int x = 0;
           * for(String operation : operations)
           * x += (44 - operation.charAt(1));
           * //ASCII Value
           * //'+'= 43
           * //'-'= 45
           * //44-43=1
           * //44-45=-1
           * return x;
           * }
           */
     }

     public static void main(String[] args) {
          String operations[] = { "++X", "++X", "X++" };
          // String operations[] = { "--X", "X++", "X++" };
          int x = finalValueAfterOperations(operations);
          System.out.println(x);

     }
}
