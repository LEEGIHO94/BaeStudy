import java.util.*;
class Solution
{
    Stack<Character> stack = new Stack<>();
    public int solution(String s){
        int answer;
        
        //데이터 삽입
        for(int i = 0; i < s.length();i++){
            if(!stack.isEmpty() && stack.peek() == s.charAt(i))
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        
        answer = stack.isEmpty() ? 1 : 0;
        return answer;
    }
}

/*
문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾음
그 뒤 그 둘을 제거한 뒤 이어 붙인다.
전부 제거 했을 때 성공적으로 삭제가 되면 1 아니면 0 반환
    스택 이용해서 문제 해결하면 개쉬움
    
*/