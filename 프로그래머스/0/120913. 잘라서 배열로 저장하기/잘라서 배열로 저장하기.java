class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int size = (len + n - 1) / n; // 배열 크기 계산 (올림)

        String[] answer = new String[size];
        int idx = 0;

        for (int i = 0; i < len; i += n) {
            int end = Math.min(i + n, len);
            answer[idx++] = my_str.substring(i, end);
        }

        return answer;
    }
}