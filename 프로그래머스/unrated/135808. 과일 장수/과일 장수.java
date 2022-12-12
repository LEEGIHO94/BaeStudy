import java.util.Arrays;

class Solution {
    public static int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        //오름 차순 정렬이 된다.
        int sum = 0 ;
        int index = score.length -1;

        while(true){
            if(index -m >= -1 ) {
                index = index- m + 1;
                sum = sum + score[index] * m ;
                index--;
            }
            else break;
        }
        return sum;
    }
}