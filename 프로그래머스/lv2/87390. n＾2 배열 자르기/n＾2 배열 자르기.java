class Solution {
    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left + 1)];
        int num = 0;
        for (long i = left; i <= right; i++) {
            answer[num++] = (i /n) >=(i%n) ? (int)(i/n) + 1 : (int)(i%n)+1;
        }
        return answer;
    }
}