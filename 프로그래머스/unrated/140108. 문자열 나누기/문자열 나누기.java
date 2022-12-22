class Solution {
    public int solution(String s) {
        int answer =0;
        int countOfFirst = 0;
        int count = 0;
        char first = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (count == countOfFirst) {
                answer++;
                first = s.charAt(i);
                count=0;
                countOfFirst =0;
            }
            if(first == s.charAt(i)) countOfFirst++;
            else count++;
        }
        return answer;
    }
    
}