import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


class Solution {
    public static int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, Map.Entry.comparingByValue());
        System.out.println(list.toString());

        if(list.size() == 1) return list.get(0).getKey();
        if(list.get(list.size()-1).getValue() == list.get(list.size()-2).getValue()) return -1;
        else return list.get(list.size()-1).getKey();
        }



}