class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];
        
        for (int num : array) {
            count[num]++;
        }
        
        int maxCount = 0;
        int mode = -1;
        boolean X = false;

        for (int i = 0; i < 1000; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mode = i;
                X = false;
            } else if (count[i] == maxCount && count[i] != 0) {
                X = true;
            }
        }
        
        return X ? -1 : mode;
    }
}