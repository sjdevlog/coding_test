class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for (int i = 0; i < code.length() ; i++) {
            if (code.charAt(i) == '1') {
                mode = (mode == 0) ? 1 : 0;
                continue;
            }
            
            if (mode == 0) {
                if (i%2==0) {
                    answer = answer + code.charAt(i);
                }
            } else {
                if (i%2==1) {
                    answer = answer + code.charAt(i);
                }
            }
        }
        
        return answer.isEmpty() ? "EMPTY" : answer;
    }
}