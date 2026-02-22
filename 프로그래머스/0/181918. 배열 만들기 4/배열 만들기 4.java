import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (a.size() == 0) {
                a.add(arr[i]);
                i++;
            } else if (a.get(a.size() - 1) < arr[i]) {
                a.add(arr[i]);
                i++;
            } else {
                a.remove(a.size() - 1);
            }
        }

        int[] stk = new int[a.size()];
        for (int x = 0; x < stk.length; x++) {
            stk[x] = a.get(x);
        }
        return stk;
    }
}