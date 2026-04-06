class Solution {
      public int[] solution(int[][] score) {
          int n = score.length;
          int[] result = new int[n];

          for (int i = 0; i < n; i++) {
              int rank = 1;
              for (int j = 0; j < n; j++) {
                  if (score[j][0] + score[j][1] > score[i][0] + score[i][1]) {
                      rank++;
                  }
              }
              result[i] = rank;
          }
          return result;
      }
  }