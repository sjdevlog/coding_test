import java.util.*;

class Solution {
    public int solution(String s) {
        String[] tokens = s.split(" ");
        Deque<Integer> stack = new ArrayDeque<>();

        for (String t : tokens) {
            if (t.equals("Z")) {
                stack.pop(); // s는 Z로 시작하지 않고, 연속 Z도 없어서 안전
            } else {
                stack.push(Integer.parseInt(t));
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}