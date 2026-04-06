 class Solution {
      public int solution(String[] babbling) {
          int count = 0;
          String[] sounds = {"aya", "ye", "woo", "ma"};

          for (String word : babbling) {
              for (String sound : sounds) {
                  word = word.replace(sound, " ");
              }
              if (word.isBlank()) count++;
          }
          return count;
      }
  }