import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
           map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0) + 1);
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            answer *= entry.getValue()+1;
        }

        return --answer;
    }
}