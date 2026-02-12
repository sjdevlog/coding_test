class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
        int a = numer1 * denom2 + numer2 * denom1;
        int b = denom1 * denom2;
        
        int n = getGCD(a, b);
        
        return new int[]{a/n, b/n};
    }
    
    private int getGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }
}