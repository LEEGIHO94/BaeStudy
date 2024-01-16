import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int tmp = 0;

        int index = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        //여기서 10진수로 변경하는 과정
        for (int i = index - 1; i >= 0; i--) {
            tmp += (Integer.parseInt(st.nextToken())*Math.pow(A,i));
        }
        StringBuilder sb = new StringBuilder();
        //여기서 B진수로 변경
        while (tmp > 0) {
            stack.push(tmp % B);
            tmp /= B;
        }
        while (!stack.isEmpty()) {
            if (stack.size() == 1) {
                System.out.println(stack.pop());
            } else {
                System.out.print(stack.pop() + " ");
            }
        }
    }
}