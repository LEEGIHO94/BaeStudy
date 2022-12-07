class Solution {
    public int solution(int angle) {
        if(angle == 0) return 0;//각도가 0일 경우가 있다.
        if(angle<90)
            return 1;
        else if(angle==90)
            return 2;
        else if(angle < 180)
            return 3;
        else
            return 4;

    }
}