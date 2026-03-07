import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> l = new ArrayList<>();
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                l.add(numlist[i]);
            }
        }
        
        int[] answer = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            answer[i] = l.get(i);
        }
        
        return answer;
    }
}