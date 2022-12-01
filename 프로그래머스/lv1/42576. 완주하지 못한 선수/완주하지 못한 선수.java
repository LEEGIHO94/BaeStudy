import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> map = new HashMap<>();
        for(String partic : participant)
            map.put(partic,map.getOrDefault(partic,0)+1);
        for(String partic : completion)
            map.put(partic,map.get(partic)-1);
        
        Iterator<Map.Entry<String,Integer>> itr = map.entrySet().iterator();
        
        while (itr.hasNext()){
            Map.Entry<String, Integer> entry = itr.next();
            if(entry.getValue()!=0)
                return entry.getKey();
        }

        return "";

    }
}