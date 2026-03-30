import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = new int[] {1,2,3,4,5};
        int[] b = new int[] {2,1,2,3,2,4,2,5};
        int[] c = new int[] {3,3,1,1,2,2,4,4,5,5};
        
        int a_num = 0;
        int b_num = 0;
        int c_num = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i%a.length]) a_num++;
            if (answers[i] == b[i%b.length]) b_num++;
            if (answers[i] == c[i%c.length]) c_num++;
        }
        
        int max = Math.max(a_num, Math.max(b_num, c_num));
        List<Integer> list = new ArrayList<>();
        
        if (a_num == max) list.add(1);
        if (b_num == max) list.add(2);
        if (c_num == max) list.add(3);
        
        int[] x = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            x[i] = list.get(i);
        }
        
        return x;
        
    }
}