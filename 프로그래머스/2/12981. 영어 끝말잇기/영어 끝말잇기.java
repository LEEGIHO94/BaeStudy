import java.util.*;
import java.math.*;

/*
차례와 번호는 추후 n / %를 통해 구할 수 있다.

핵심은 주어진 배열에 있는 데이터가 중복을 가지고 있난지 여부를 체크하는 것
Set 자료구조를 활용해 중복 제거
    add 시 true, false 를 반환하기 때문

수도코드
    loop. words 루프
        set.add == false 라면
            answer[0] = index / n == 0 ? 3 : index / n
            answer[1] = index % n == 0 ? 3 : index % n
            
*/

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> s = new HashSet<>();
        char c = words[0].charAt(0);
        
        for(int i = 0 ; i < words.length ; i++){
            if(!s.add(words[i]) || words[i].charAt(0) != c){
                answer[0] = (i+1) % n == 0 ? n : (i+1) % n;
                answer[1] = (i+1) % n == 0 ? (i+1) / n : (i+1) / n + 1;
                break;
            }
            
            c = words[i].charAt(words[i].length() - 1);
        }

        return answer;
    }
}