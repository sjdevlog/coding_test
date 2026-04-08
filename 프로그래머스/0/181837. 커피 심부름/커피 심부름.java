class Solution {
    public int solution(String[] order) {
        int money = 0;
        for (int i = 0; i < order.length; i++){
            if (order[i].contains("cafelatte")) money += 5000;
            else money += 4500;
        }
        return money;
    }
}