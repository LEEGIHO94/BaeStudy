import java.util.*;

class Solution {
    Queue<Character> q = new LinkedList<>();
    public String solution(String s) {
        var sb = new StringBuilder();
        boolean flag = true;
        
        for(int i = 0 ; i < s.length();i++){
            q.add(s.charAt(i));
        }
        
        while(!q.isEmpty()){
            char tmp = q.poll();
            
            if(Character.isDigit(tmp)){
                flag = false;
                sb.append(tmp);
            }else if(tmp == ' '){
                sb.append(tmp);
                flag = true;
            }else if(flag == true){
                sb.append(Character.toUpperCase(tmp));
                flag = false;
            }else{
                sb.append(Character.toLowerCase(tmp));
            }
        }
        return sb.toString();
    }

}
/*
1 모든 단어의 첫 문자가 대문자
2 나머지는 알파벳인 것

단 첫문자가 알파벳이 아닐 때는 이어지는 알파벳은 소문자로 쓰면된다.
즉 띄어쓰기 이후 첫 단어가 영어일 경우 upper를 적용하라

제약 조건
1 ~ 200 
Stack 활용해 문제 해결
*/