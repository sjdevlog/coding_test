class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] arr = new int[(num_list.length + n - 1) / n];
        int x = 0;
        for(int i = 0; i < num_list.length; i += n) {
            arr[x] = num_list[i];
            x++;
        }
        return arr;
    }
}