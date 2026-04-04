import java.util.*;

  class Solution {
      public int[] solution(int[] arr, int[] delete_list) {
          Set<Integer> deleteSet = new HashSet<>();
          for (int d : delete_list) deleteSet.add(d);

          return Arrays.stream(arr)
                       .filter(x -> !deleteSet.contains(x))
                       .toArray();
      }
  }