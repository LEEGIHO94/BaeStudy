import java.util.*;
class Solution {
    public int solution(int[][] dots) {

        TreeSet<Integer> setX = new TreeSet<>();
        TreeSet<Integer> setY = new TreeSet<>();
        for(int i = 0 ; i < 4 ; i++){
            //note 여기에는 add를 하는 것이다.
            setX.add(dots[i][0]);
            setY.add(dots[i][1]);
        }
        int num  = Math.abs(setY.first() - setY.last());
        int num2 = Math.abs(setX.first() - setX.last());

        return num * num2;
    }
}