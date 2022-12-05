class Solution {
    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int leftindex = 10;
        int rightindex = 12;
        //0을 11로 바꾸면 모든 숫자들이 3의 배수 혹은 나머지로 표현이 가능하다는 점이중요하다
        for(int n : numbers){
            if(n==1||n==4||n==7){
                answer.append("L");
                leftindex = n;

            }else if(n==3||n==6||n==9){
                answer.append("R");
                rightindex = n;

            }else{
                if(n==0){
                    n+=11;
                }
                int ld = (Math.abs(n-leftindex))/3 + (Math.abs(n-leftindex))%3;
                int rd = (Math.abs(n-rightindex))/3 + (Math.abs(n-rightindex))%3;
                if(ld==rd){
                    if(hand.equals("right")){
                        answer.append("R");
                        rightindex = n;
                    }else{
                        answer.append("L");
                        leftindex = n;
                    }
                }else if(ld>rd){
                    answer.append("R");
                    rightindex = n;
                }else{
                    answer.append("L");
                    leftindex = n;
                }
            }
        }
        return answer.toString();
    }
}


