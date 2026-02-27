class Solution {
    public int solution(int n) {
        int count = 0;

        for (int x = 1; x <= n; x++) {
            int divisors = 0;
            for (int d = 1; d <= x; d++) {
                if (x % d == 0) divisors++;
            }
            if (divisors >= 3) count++;
        }

        return count;
    }
}