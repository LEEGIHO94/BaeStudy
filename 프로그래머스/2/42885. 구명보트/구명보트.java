import java.util.*;
import java.math.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int first = 0;
        
        for(int i = people.length - 1 ; i >= first; i--){
            if(people[first] + people[i] <= limit){
                first++;
            }
            answer++;
        }
        
        return answer;
    }
}