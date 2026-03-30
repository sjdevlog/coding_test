class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int num = 0;

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); // 숫자 이어붙이기
            } else {
                answer += num; // 숫자 끝났으니까 더하기
                num = 0;       // 초기화
            }
        }

        answer += num; // 마지막 숫자 처리
        return answer;
    }
}