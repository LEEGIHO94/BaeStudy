class Solution {
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] crying = {"aya","ye","woo","ma"};
        String[] dontCrying =  {"ayaaya","yeye","woowoo","mama"};
        //일단 dontCrying 으로 값을 변경해준다.  1
        //담은 값에서 crying 값을 변경해준다.k
        //결과를 분류 할 때 값이 전부 1인 것들만 체크

        for (String test : babbling) {
            boolean count = false;
            for (int i = 0; i < crying.length; i++) {
                test = test.replace(dontCrying[i], "k");
                test = test.replace(crying[i],"0");
            }//순서가 중요하다.

            for (int i = 0; i < test.length(); i++) {
                if(test.charAt(i)!= '0') {
                    count = true;
                    break;
                }

            }
            if(!count) answer++;




        }
        return answer;

    }
}