import java.util.*;
/*
각 알파벳을 일정 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호방식
Charactor를 이용해서 문제를 풀면 될 것 같다.
다만 문제에서 공백이라면 공백
소문자 대문자 알파벳으로 만들어져있다.
소문자일 경우는 소문자로만 바뀌게 된다.
n는 25 이하의 자연수 

Lookup Table을 만들면 문제를 쉽게 해결 할 수 있을 것이라고 판단
    1. Lookup Table 생성 ( 대 소문자)
    2. if Lookup table 에 해당 문자가 존재한다면 해당 문자를 테이블에서 순회 시킨다.
    공백일 경우를 가장 먼저 체크한다.
    
*/
class Solution {
        public String solution(String s, int n) {
            String answer = "";
            for(char ch : s.toCharArray()) {
                if(ch==' ') {
                    answer += ch;
                }else if(ch>='a'&& ch<='z'){
                    answer += (char)('a' + (ch+n-'a')%26);
                }else {
                    answer += (char)('A' + (ch+n-'A')%26);
                }
            }
            System.out.println(answer);
            return answer;
        }
}