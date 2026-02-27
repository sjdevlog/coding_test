class Solution {
    public int solution(int n) {
        int i = 1;
        int fact = 1;

        while (fact * (i + 1) <= n) {
            i++;
            fact *= i;
        }

        return i;
    }
}