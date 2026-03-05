class Solution {
    public int solution(String myString, String pat) {
        if((myString.toUpperCase()).indexOf(pat.toUpperCase()) != -1) {
            return 1;
        } else {
            return 0;
        }
    }
}