class Solution {
    public int solution(String A, String B) {
        int n = A.length();

          for (int i = 0; i < n; i++) {
              String rotated = A.substring(n - i) + A.substring(0, n - i);
              if (rotated.equals(B)) return i;
          }

          return -1;
    }
}