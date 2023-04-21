class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        // x씩 증가한다. -> x는 음수가 될 수도 있다.
        // x는 절대값으로 만들어서 체크해야된다.
        int plus = Math.abs(x);
        answer[0] = x;
        
        for(int i = 1 ; i < n ; i++){
            answer[i] = answer[i-1] + x;
        }
        
        
        
        return answer;
    }
}