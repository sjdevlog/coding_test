class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("up")) {
                if (y < maxY) y++;
            } 
            else if (keyinput[i].equals("down")) {
                if (y > -maxY) y--;
            } 
            else if (keyinput[i].equals("left")) {
                if (x > -maxX) x--;
            } 
            else if (keyinput[i].equals("right")) {
                if (x < maxX) x++;
            }
        }
        
        return new int[]{x, y};
    }
}