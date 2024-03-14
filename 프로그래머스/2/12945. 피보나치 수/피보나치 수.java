import java.util.*;

class Solution {
    Integer[] memo = new Integer[100001];
    
    public int solution(int n) {
        init();
        return dp(n);
    }
    
    public void init(){
        memo[0] = 0;
        memo[1] = 1;
    }
    
    public int dp(int n){
        if(n >= 0 && memo[n] != null)
            return memo[n];
        
        memo[n] =  (dp(n - 2) + dp(n - 1)) % 1234567 ;
        return memo[n];
    }
}