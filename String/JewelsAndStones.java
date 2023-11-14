import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
     public static int numJewelsInStones(String jewels, String stones) {
          Set<Character> jewelSet = new HashSet<>();

          // Step 2: Populate the jewelSet
          for (char jewel : jewels.toCharArray()) {
               jewelSet.add(jewel);
          }

          int jewelCount = 0; // Step 3: Initialize the counter

          // Step 4: Loop through the stones
          for (char stone : stones.toCharArray()) {
               // Step 5: Check if the stone is a jewel
               if (jewelSet.contains(stone)) {
                    jewelCount++;
               }
          }

          // Step 6: Return the count of jewels in the stones
          return jewelCount;
     }

     /*
      * public static int numJewelsInStones(String jewels, String stones) {
      * boolean[] isJewel = new boolean[128]; // Assuming ASCII characters
      * 
      * // Step 2: Populate the isJewel array
      * for (char jewel : jewels.toCharArray()) {
      * isJewel[jewel] = true;
      * }
      * 
      * int jewelCount = 0; // Step 3: Initialize the counter
      * 
      * // Step 4: Loop through the stones
      * for (char stone : stones.toCharArray()) {
      * // Step 5: Check if the stone is a jewel
      * if (isJewel[stone]) {
      * jewelCount++;
      * }
      * }
      * 
      * // Step 6: Return the count of jewels in the stones
      * return jewelCount;
      * }
      */
     public static void main(String[] args) {
          String jewels = "aA";
          String stones = "aAAbbbb";
          System.out.println(numJewelsInStones(jewels, stones));
     }
}
/*
 * You're given strings jewels representing the types of stones that are jewels,
 * and stones representing the stones you have. Each character in stones is a
 * type of stone you have. You want to know how many of the stones you have are
 * also jewels.
 * 
 * Letters are case sensitive, so "a" is considered a different type of stone
 * from "A".
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: jewels = "aA", stones = "aAAbbbb"
 * Output: 3
 * Example 2:
 * 
 * Input: jewels = "z", stones = "ZZ"
 * Output: 0
 * 
 * 
 * Constraints:
 * 
 * 1 <= jewels.length, stones.length <= 50
 * jewels and stones consist of only English letters.
 * All the characters of jewels are unique.
 */