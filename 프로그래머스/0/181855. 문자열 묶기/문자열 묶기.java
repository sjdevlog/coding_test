class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[31];
        int max = 0;
        
        for (int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();
            count[len]++;
            
            if (count[len] > max) {
                max = count[len];
            }
        }
        
        return max;
    }
}