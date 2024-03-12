class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int removedZero = 0;
        
        while (!s.equals("1")) {
            // 1. 제거된 모든 0의 개수를 센다.
            int zeroCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeroCount++;
                }
            }
            // 2. 0을 제외한 나머지 1의 개수를 구한다.
            removedZero += zeroCount;
            int remain = s.length() - zeroCount;
            
            // 3. 이진 변환을 수행한다.
            s = Integer.toBinaryString(remain);
            count++;
        }
        
        answer[0] = count;
        answer[1] = removedZero;
        
        return answer;
    }
}