import java.util.*;

class Solution {
    Integer[] memo = new Integer[2001];
    public long solution(int n) {
        memo[1] = 1;
        memo[2] = 2;
        return dp(n);
    }
    
    public int dp(int n){
        if(memo[n] != null)
            return memo[n];
        
        memo[n] = (dp(n - 1) + dp(n - 2)) % 1234567;
        return memo[n];
    }
}