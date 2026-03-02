import java.util.*;

class Solution {
    public int solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        int ans = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                ans += c - '0';
            }
        }
        
        return ans;
    }
}