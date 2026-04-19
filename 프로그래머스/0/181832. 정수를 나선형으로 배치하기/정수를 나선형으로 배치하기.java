  class Solution {
      public int[][] solution(int n) {
          int[][] answer = new int[n][n];

          // 우, 하, 좌, 상
          int[] dr = {0, 1, 0, -1};
          int[] dc = {1, 0, -1, 0};

          int r = 0, c = 0, dir = 0;

          for (int num = 1; num <= n * n; num++) {
              answer[r][c] = num;

              int nr = r + dr[dir];
              int nc = c + dc[dir];

              // 범위 초과 or 이미 채워진 셀이면 방향 전환
              if (nr < 0 || nr >= n || nc < 0 || nc >= n || answer[nr][nc] != 0) {
                  dir = (dir + 1) % 4;
                  nr = r + dr[dir];
                  nc = c + dc[dir];
              }

              r = nr;
              c = nc;
          }

          return answer;
      }
  }