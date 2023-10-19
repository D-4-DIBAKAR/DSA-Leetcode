import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
     public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
          int maxCandie = 0;
          for (int candy : candies) {
               maxCandie = Math.max(maxCandie, candy);
          }
          List<Boolean> maximumCandieList = new ArrayList<>();
          for (int candy : candies) {
               maximumCandieList.add(candy + extraCandies >= maxCandie);
          }
          return maximumCandieList;
     }

     public static void main(String[] args) {
          int candies[] = { 2, 3, 5, 1, 3 };
          int extraCandies = 3;
          List<Boolean> maximumCandieList = kidsWithCandies(candies, extraCandies);
          System.out.println(maximumCandieList);
     }
}
