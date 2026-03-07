import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>(Arrays.asList(strArr));
        
        list.removeIf(s -> s.contains("ad"));
        
        return list.toArray(new String[0]);
    }
}