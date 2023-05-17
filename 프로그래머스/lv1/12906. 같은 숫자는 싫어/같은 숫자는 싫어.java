import java.util.*;
/*
원소는 0~9
연속적으로 나타나는 숫자는 하나 제외 전부 제거
남은 수 반환할 때 순서는 유지해야된다.
데이터를 for문으로 순회하자 이 때 이전에 값이 있으면 제외해라
혹은 deque사용해도 될듯?

*/
public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> q = new LinkedList<>(); 
        q.add(arr[0]);
        
        for(int i = 1 ; i < arr.length; i++){
            if(q.peekLast() != arr[i]){
                q.add(arr[i]);
            }
        }
        int[] answer = new int[q.size()];
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = q.poll();
        }

        return answer;
    }
}