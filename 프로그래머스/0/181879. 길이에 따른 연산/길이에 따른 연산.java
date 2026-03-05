class Solution {
    public int solution(int[] num_list) {
        if (num_list.length >= 11) {
            int x = 0;
            for (int i = 0; i < num_list.length; i++) {
                x += num_list[i];
            }
            return x;
        } else {
            int x = 1;
            for (int i = 0; i < num_list.length; i++) {
                x *= num_list[i];
            }
            return x;
        }
    }
}