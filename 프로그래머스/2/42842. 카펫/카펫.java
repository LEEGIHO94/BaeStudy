import java.util.*;
import java.math.*;

//DFS 활용한 문제 해결을 통한 문제 해결 가능
/*
제공되는 값 -> 갈색, 노란색
-> 가로 세로로 담아서 값을 도출하라
갈색은 노란색을 둘러싸고 있다.
가로가 세로보다 길거나 같다.
갈색은 테두리 1줄로만 이루어 져 있다.

1. y + b 는 전체 타일의 수
    -> 약수 쌍으로 가로 세로를 얻을 수 있다.
    이 후 조건을 통해 조건 충족 여부 체크 가능
수도코드
    
    loop. 
        조건 1. b + y 부터 시작 (가로 세로의 길이를 구할 때 가로의 길이가 더 커야 된다는 조건이 존재하기 때문)
        조건 2. b + y / 2 까지만 루프를 돌 수 있도록 한다.
            예외 체크 : 합이 3일 경우 ->  1 까지 체크 가능
        조건 3. i--
    
        if .
            조건 1 i가 약수가 일 때 
            
            if.
                조건 1 노란타일이 전부 들어가는지 체크 (가로 -2) *(세로 - 2)의 합이 yellow와  같을 경우 반환        
*/


class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for(int i = sum ; i >= 3 ; i--){
            //약수가 아닐 경우 or sum / i 의 값이 3보다 작을 경우 끝
            if(sum % i != 0 || sum / i < 3){
                continue;
            }
            
            int j = sum / i;
            
            
            if((i - 2) * (j - 2) == yellow){
                answer[0] = i;
                answer[1] = j;
                break;
            }
            
        }        
        
        return answer;
    }
}
