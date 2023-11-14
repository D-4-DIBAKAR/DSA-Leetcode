import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class RestoreTheArrayAdjacentPairs {
     public static int[] restoreArray(int[][] adjacentPairs) {

          Map<Integer, List<Integer>> adjacencyMap = new HashMap<>();

          // Step 1: Build the adjacency map
          for (int[] pair : adjacentPairs) {
               adjacencyMap.computeIfAbsent(pair[0], k -> new ArrayList<>()).add(pair[1]);
               adjacencyMap.computeIfAbsent(pair[1], k -> new ArrayList<>()).add(pair[0]);
          }

          // Step 2: Find the start point
          int start = 0;
          for (Map.Entry<Integer, List<Integer>> entry : adjacencyMap.entrySet()) {
               if (entry.getValue().size() == 1) {
                    start = entry.getKey();
                    break;
               }
          }

          // Step 3: Reconstruct the array using BFS
          int n = adjacentPairs.length + 1;
          int[] result = new int[n];
          Queue<Integer> queue = new LinkedList<>();
          Set<Integer> visited = new HashSet<>();

          queue.offer(start);
          visited.add(start);

          for (int i = 0; i < n; i++) {
               int current = queue.poll();
               result[i] = current;

               for (int neighbor : adjacencyMap.get(current)) {
                    if (!visited.contains(neighbor)) {
                         queue.offer(neighbor);
                         visited.add(neighbor);
                    }
               }
          }

          return result;
     }

     public static void main(String[] args) {
          int nums[][] = { { 2, 1 }, { 3, 4 }, { 3, 2 } };
          int[] restoreArray = restoreArray(nums);
          for (int i : restoreArray) {
               System.out.print(i + " ");
          }
     }
}

/*
 * There is an integer array nums that consists of n unique elements, but you
 * have forgotten it. However, you do remember every pair of adjacent elements
 * in nums.
 * 
 * You are given a 2D integer array adjacentPairs of size n - 1 where each
 * adjacentPairs[i] = [ui, vi] indicates that the elements ui and vi are
 * adjacent in nums.
 * 
 * It is guaranteed that every adjacent pair of elements nums[i] and nums[i+1]
 * will exist in adjacentPairs, either as [nums[i], nums[i+1]] or [nums[i+1],
 * nums[i]]. The pairs can appear in any order.
 * 
 * Return the original array nums. If there are multiple solutions, return any
 * of them.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: adjacentPairs = [[2,1],[3,4],[3,2]]
 * Output: [1,2,3,4]
 * Explanation: This array has all its adjacent pairs in adjacentPairs.
 * Notice that adjacentPairs[i] may not be in left-to-right order.
 * Example 2:
 * 
 * Input: adjacentPairs = [[4,-2],[1,4],[-3,1]]
 * Output: [-2,4,1,-3]
 * Explanation: There can be negative numbers.
 * Another solution is [-3,1,4,-2], which would also be accepted.
 * Example 3:
 * 
 * Input: adjacentPairs = [[100000,-100000]]
 * Output: [100000,-100000]
 * 
 * 
 * Constraints:
 * 
 * nums.length == n
 * adjacentPairs.length == n - 1
 * adjacentPairs[i].length == 2
 * 2 <= n <= 105
 * -105 <= nums[i], ui, vi <= 105
 * There exists some nums that has adjacentPairs as its pairs.
 */