class Solution {
      public int solution(int i, int j, int k) {
          int count = 0;
          String target = String.valueOf(k);
          for (int n = i; n <= j; n++) {
              for (char c : String.valueOf(n).toCharArray()) {
                  if (c == target.charAt(0)) count++;
              }
          }
          return count;
      }
  }