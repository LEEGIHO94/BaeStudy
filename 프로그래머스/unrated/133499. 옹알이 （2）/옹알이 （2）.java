class Solution {
    public static int solution(String[] babbling) {
        int answer = 0;

        String[] crying = {"aya","ye","woo","ma"};

        for (String test : babbling) {
            int count = 0;

            for (int i = 0 ; i < crying.length ; i++) {
                test = test.replace(crying[i],String.valueOf(i));
            }

            for (int i = 0; i < test.length(); i++) {
                if(test.charAt(i) == '0' || test.charAt(i) == '1'
                        || test.charAt(i) == '2' || test.charAt(i) == '3'){
                    if(i != 0) {
                        if (test.charAt(i) == test.charAt(i - 1)) {
                            count = 0;
                            break;
                        }
                        
                    }
                    else count = 1;

                }else {
                    count =0;
                    break;
                }
            }
            if(count ==1  )
                answer++;
        }



        return answer;
    }
}