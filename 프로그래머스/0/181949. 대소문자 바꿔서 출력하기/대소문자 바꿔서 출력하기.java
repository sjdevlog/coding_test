import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char arr[] = a.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char)(arr[i] - 'a' + 'A');
        } else if (arr[i] >= 'A' && arr[i] <= 'Z') {
            arr[i] = (char)(arr[i] - 'A' + 'a');
        }
        }
        a = new String(arr);
        
        
        System.out.println(arr);
    }
}