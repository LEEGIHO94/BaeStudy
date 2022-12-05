class Solution {
    public String solution(int[] numbers, String hand) {
        String answer ="";
        int leftindex = 10;
        int rightindex = 12;
        
        for(int n : numbers){
            if(n==1||n==4||n==7){
                answer+="L";
                leftindex = n;
                
            }else if(n==3||n==6||n==9){
                answer+="R";
                rightindex = n;
                
            }else{
                if(n==0){
                    n+=11;
                }
                int ld = (Math.abs(n-leftindex))/3 + (Math.abs(n-leftindex))%3;
                int rd = (Math.abs(n-rightindex))/3 + (Math.abs(n-rightindex))%3;
                if(ld==rd){
                    if(hand.equals("right")){
                        answer+="R";
                        rightindex = n;
                    }else{
                        answer+="L";
                        leftindex = n;
                    }
                }else if(ld>rd){
                    answer+="R";
                    rightindex = n;
                }else{
                    answer+="L";
                    leftindex = n;
                }
            }
        }
        return answer;
    }
}