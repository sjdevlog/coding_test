import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[k];
        Arrays.fill(result, -1);

        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean exists = false;

            for (int j = 0; j < idx; j++) {
                if (result[j] == arr[i]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                if (idx < k) {
                    result[idx] = arr[i];
                    idx++;
                }
            }

            if (idx == k) break;
        }

        return result;
    }
}