import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        // 1. spell을 문자열로 만들고 정렬
        String[] temp = spell.clone();
        Arrays.sort(temp);
        String target = String.join("", temp);

        // 2. dic 검사
        for (String word : dic) {
            if (word.length() != spell.length) continue;

            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            if (sorted.equals(target)) {
                return 1;
            }
        }

        return 2;
    }
}