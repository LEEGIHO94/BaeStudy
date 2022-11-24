import java.util.*;

class Solution {
    public int solution(String dartResult) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < dartResult.length(); i++) {
            char point = dartResult.charAt(i);
            if(point == '1' && dartResult.charAt(i+1)=='0'){
                stack.push(10);
                i++;                //i 증가 시키는 이유 : i가 0 인 상황 넘기기 위해
            }
            else
            switch (point){
                case 'S' : break;
                case 'D' : stack.push((int) Math.pow(stack.pop(),2)); break;
                case 'T' : stack.push((int) Math.pow(stack.pop(),3)); break;
                case '#' : stack.push(stack.pop() * (-1)); break;
                case '*' :
                    int num = stack.pop()*2;
                    if(stack.isEmpty()) stack.push(num);
                    else {
                        stack.push(stack.pop()*2);
                        stack.push(num);
                    }break;
                default:stack.push(Character.getNumericValue(point));
            }
        }
        return stack.stream().mapToInt(n->n).sum();
    }
}