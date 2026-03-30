class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int first = -1;
        int second = -1;
        int third = -1;

        for (int i = 0; i < rank.length; i++) {
            if (!attendance[i]) continue;

            if (first == -1 || rank[i] < rank[first]) {
                third = second;
                second = first;
                first = i;
            } else if (second == -1 || rank[i] < rank[second]) {
                third = second;
                second = i;
            } else if (third == -1 || rank[i] < rank[third]) {
                third = i;
            }
        }

        return 10000 * first + 100 * second + third;
    }
}