class Solution {
    public int solution(int num, int k) {
        String s = String.valueOf(num);
        String target = String.valueOf(k);
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target.charAt(0)) {
                return i + 1;
            }
        }
        
        return -1;
    }
}