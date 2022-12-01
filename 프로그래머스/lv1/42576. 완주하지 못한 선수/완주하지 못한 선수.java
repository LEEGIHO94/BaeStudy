import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> map = new HashMap<>();
        for(String partic : participant)
            map.put(partic,map.getOrDefault(partic,0)+1);
        for(String partic : completion)
            map.put(partic,map.get(partic)-1);
        
            for(String k : map.keySet()){
            if(map.get(k)!=0)
                return k;
        }

        return "";

    }
}