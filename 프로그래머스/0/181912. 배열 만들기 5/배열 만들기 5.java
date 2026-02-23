import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();

        for (String str : intStrs) {
            // s부터 길이 l만큼 (끝 인덱스는 미포함)
            int x = Integer.parseInt(str.substring(s, s + l));

            if (x > k) {
                list.add(x);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) answer[i] = list.get(i);

        return answer;
    }
}