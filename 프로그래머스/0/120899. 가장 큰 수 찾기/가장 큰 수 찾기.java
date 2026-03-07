class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        int n = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                n = i;
            }
        }
        
        return new int[] {max, n};
    }
}