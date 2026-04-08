 class Solution {
      public String[] solution(String[] picture, int k) {
          int rows = picture.length;
          int cols = picture[0].length();
          String[] result = new String[rows * k];

          for (int i = 0; i < rows; i++) {
              StringBuilder sb = new StringBuilder();
              for (int j = 0; j < cols; j++) {
                  for (int kj = 0; kj < k; kj++) {
                      sb.append(picture[i].charAt(j));
                  }
              }
              String expandedRow = sb.toString();
              for (int ki = 0; ki < k; ki++) {
                  result[i * k + ki] = expandedRow;
              }
          }

          return result;
      }
  }