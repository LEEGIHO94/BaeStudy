import java.util.*;
import java.math.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num : tangerine){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        
        keys.sort((o1,o2) -> map.get(o2) - map.get(o1));
        
        for(Integer i : keys){
            if(k <=0) break;
            
            answer++;
            k -= map.get(i);
        }
        return answer;
        
    }
}
