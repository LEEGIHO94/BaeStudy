class Solution {
    public int solution(int chicken) {
        int count = 0;
        while(chicken / 10 != 0){
            int feeChicken = chicken / 10;
            chicken = chicken%10 + feeChicken;
            count += feeChicken;
        
        }
        
        return count;
    }
}