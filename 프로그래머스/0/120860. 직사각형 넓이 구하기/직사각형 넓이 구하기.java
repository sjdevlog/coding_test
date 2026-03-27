class Solution {
    public int solution(int[][] dots) {
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = x1;
        int y2 = y1;

        for (int i = 1; i < 4; i++) {
            if (dots[i][0] != x1) x2 = dots[i][0];
            if (dots[i][1] != y1) y2 = dots[i][1];
        }

        return Math.abs(x1 - x2) * Math.abs(y1 - y2);
    }
}