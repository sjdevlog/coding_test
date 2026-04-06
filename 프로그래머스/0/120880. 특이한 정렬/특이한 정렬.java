import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
         return Arrays.stream(numlist)
                  .boxed()
                  .sorted((a, b) -> {
                      int distA = Math.abs(a - n);
                      int distB = Math.abs(b - n);
                      if (distA != distB) return distA - distB;
                      return b - a;                              // 거리
                  })
                  .mapToInt(Integer::intValue)
                  .toArray();
    }
}