
import java.util.*;
import java.io.*;

/*
* 입력 받은 수 들로 스택 수열을 만들 수 있는 가?
* 스택에는 1부터 n까지 순차적으로 데이터가 들어간다
* 이때 input에 나오는 값과 같은 값이 들어가면 해당 값을 pop 한다.
* 중요한 것은 어디까지 스택에 넣었는지 기록해주는 값이 필요하다는 것이다.
*
* 내가 이해하지 못했던 것
* 수열의 길이가 n개면 1~n까지의 수만 올 수 있다.
*   -> 즉 한번이라도 불필요한 pop을 하게 된다면 문제를 해결할 수가 없다.
* 이 부분의 지문을 읽지 않아 문제가 발생했었다.
*
* 수도코드
* 1. 데이터의 길이를 입력 받는다. (반복할 횟수)
*       1-1. 만약 기준 값이 입력 값보다 작을 경우 for문을 통해 데이터를 추가한다.
*       1-2. 이 후 값이 같아지면 pop을 통해 데이터를 뺀다.
*               이때 데이터를 입력받으면 StringBuilder에 +를 빼면 -를 해줘야한다.

*       1-3. 값이 기준값보다 작다면 peek를 통해 최상단 데이터가 같은지 확인
*              1-3-1. 같다면 pop
*              1-3-2. 틀리면 문제를 수행할 수 없기 때문에 바로 return
* */
public class Main {

    static int length;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        length = Integer.parseInt(br.readLine());

        String answer = aux(br);
        System.out.println(answer);
    }

    public static String aux(BufferedReader br) throws IOException {
        Stack<Integer> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        int lastInput = 1;
        while(length--> 0){
            int input = Integer.parseInt(br.readLine());
            if (lastInput <= input) {
                for (int i = lastInput; i <= input; i++) {
                    stack.add(i);
                    sb.append("+").append("\n");
                }
                lastInput = input + 1;

            }else if (stack.peek() != input) {
                return "NO";
            }
            //여기의 조건은 peek가 input이랑 같은 경우
            stack.pop();
            sb.append("-").append("\n");
        }
        return sb.toString();
    }

}
