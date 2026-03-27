class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) return 1;
        if (arr1.length < arr2.length) return -1;
        
        int cnt1 = 0;
        int cnt2 = 0;
        
        for(int i = 0; i < arr1.length; i++) {
            cnt1 += arr1[i];
            cnt2 += arr2[i];
        }

        if (cnt1 > cnt2) return 1;
        if (cnt1 < cnt2) return -1;
        return 0;
    }
}