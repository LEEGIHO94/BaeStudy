class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        //p<t
        StringBuilder sb = new StringBuilder(t);
        for (int i = 0; i < sb.length() -p.length() + 1; i++) {
            if(Long.parseLong(sb.substring(i,i+p.length())) <= Long.parseLong(p)) answer++;
        }

        
        return answer;
    }
}