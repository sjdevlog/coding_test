class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int n = 2 * a * b;
        
        String stra = String.valueOf(a);
        String strb = String.valueOf(b);
        
        String strab = stra + strb;
        
        int ab = Integer.parseInt(strab);
        
        if (ab < n) {
            answer = n;
        } else {
            answer = ab;
        }
        
        
        return answer;
    }
}