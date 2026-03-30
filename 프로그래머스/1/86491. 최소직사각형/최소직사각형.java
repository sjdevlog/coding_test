class Solution {
    public int solution(int[][] sizes) {
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] >= sizes[i][1]) continue;
            int temp = sizes[i][0];
            sizes[i][0] = sizes[i][1];
            sizes[i][1] = temp;
        }
        int a = -1;
        int b = -1;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > a) 
                a = sizes[i][0];
            if (sizes[i][1] > b) 
                b = sizes[i][1];
        }
        return a*b;
    }
}