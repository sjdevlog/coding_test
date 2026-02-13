class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String stra = Integer.toString(a);
        String strb = Integer.toString(b);
        
        String strab = stra + strb;
        String strba = strb + stra;
        
        int ab = Integer.parseInt(strab);
        int ba = Integer.parseInt(strba);
        
        if (ba > ab) {
            answer = ba;
        } else {
            answer = ab;
        }
        
        return answer;
    }
}