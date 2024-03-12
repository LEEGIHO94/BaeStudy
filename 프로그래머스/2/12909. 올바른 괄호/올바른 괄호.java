import java.util.*;
class Solution {
    Stack<Character> s = new Stack<>();
    boolean solution(String str) {
        boolean flag = true;
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == '('){
                s.push('(');
                continue;
            }
            if(!s.isEmpty())
                s.pop();
            else{
                flag = false;
                break;
            }
        }
        if(!s.isEmpty())
            flag = false;
        return flag;

    }
}