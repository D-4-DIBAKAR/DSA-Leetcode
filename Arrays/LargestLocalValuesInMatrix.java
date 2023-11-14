import java.util.Arrays;

public class LargestLocalValuesInMatrix {
     public static int[][] largestLocal(int[][] grid) {
          int m = grid.length;
          int n = grid[0].length;
          if (m < 3 || n < 3) {
               throw new IllegalArgumentException("Input matrix must be at least 3x3");
          }

          int[][] maxLocal = new int[n - 2][m - 2];
          for (int i = 0; i < m - 2; i++) {
               for (int j = 0; j < n - 2; j++) {
                    // Find the maximum value in the 3x3 submatrix centered at (i+1, j+1)
                    int maxVal = findMaxValue(grid, i + 1, j + 1);
                    maxLocal[i][j] = maxVal;
               }
          }
          return maxLocal;
     }

     private static int findMaxValue(int[][] grid, int row, int col) {
          int maxVal = Integer.MIN_VALUE;

          // Iterate through the 3x3 submatrix centered at (row, col)
          for (int i = row - 1; i <= row + 1; i++) {
               for (int j = col - 1; j <= col + 1; j++) {
                    maxVal = Math.max(maxVal, grid[i][j]);
               }
          }

          return maxVal;
     }

     public static void main(String[] args) {
          int[][] grid = { { 9, 9, 8, 1 }, { 5, 6, 2, 6 }, { 8, 2, 6, 4 }, { 6, 2, 2, 2 } };
          int[][] result = largestLocal(grid);
          printMatrix(result);
     }

     private static void printMatrix(int[][] matrix) {
          for (int[] row : matrix) {
               System.out.println(Arrays.toString(row));
          }
          System.out.println();
     }
}