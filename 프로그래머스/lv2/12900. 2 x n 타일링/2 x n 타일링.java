import java.util.*;

class Solution {
    
    public int solution(int n) {
        int[] memo = new int[n+1];

        //1번지 2번지 추가
        memo[1] = 1;
        memo[2] = 2;

        for(int i = 3 ; i <= n ; i++){
            memo[i] = (memo[i-1] + memo[i-2])%1000000007 ;
        }
        return memo[n];
    }
    
}