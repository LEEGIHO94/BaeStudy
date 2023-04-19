import java.util.*;
import java.io.*;

/*
 * 문제 핵심 포인트
 * 입력 받은 데이터들 중 띄어쓰기를 기준으로 문자를 쪼갠다.
 * 이 때 쪼개진 문자의 길이가 1개일 때와 그 이외일 때를 나누어 생각해본다.
 * 예상 시간 복잡도 O(n2)
 * 이유 for문이 중첩되는 것이 아닌 각각 사용된다고 판단했다.
 *
 * 특이사항 : 데이터 총 갯수가 들어오지 않는다. 그저 .로 구분
 *          애초에 괄호가 없다면 yes 를 반환한다. -> 기본 값을 yes로 하면 될 것 같다.
 * */
public class Main {
    public static void main(String[] args) throws IOException {

        //데이터 입력 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //데이터가 바로 들어온다.
        while (true) {
            String target = br.readLine();

            //탈출 조건
            if (target.equals(".")) {
                break;
            }

            String result = checkData(target);
            System.out.println(result);
        }

    }

    public static String checkData(String target) {
        Stack<Character> stack = new Stack<>();
        String result = "yes";

        char[] targetChar = target.toCharArray();
        for (int i = 0; i < targetChar.length; i++) {
            switch (targetChar[i]) {
                case '(':
                case '[':
                    stack.push(targetChar[i]);
                    break;
                case ')':
                    if(stack.isEmpty() || !(stack.pop() =='(')) return "no";
                    break;
                case ']':
                    if(stack.isEmpty() || !(stack.pop() =='[')) return "no";
                    break;
            }
        }

        //스택이 비어 있지 않으면 문제가 생긴 것이다.
        if (!stack.isEmpty()) {
            result = "no";
        }
        
        return result;
    }
}
