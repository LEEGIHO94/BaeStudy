import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int cnt = 1;
        Map<String,Integer> map = new HashMap();
        
        for(int i = 0; i < clothes.length ; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],1) + 1);
        }
        
        for(int n : map.values()){
            cnt*=n;
        }
        
        //아무것도 안 입은 경우의 수 배제
        return cnt - 1;
    }  
}