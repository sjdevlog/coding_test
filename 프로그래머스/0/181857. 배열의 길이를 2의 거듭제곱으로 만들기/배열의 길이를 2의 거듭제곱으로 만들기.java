class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int k = 1;
        while (n > k) {
            k*= 2;
        }
        
        int[] answer = new int[k];
        for (int i = 0; i < n; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}