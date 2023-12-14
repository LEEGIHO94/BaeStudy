import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] cArray = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        int result = 0;
        while (cArray.length > i) {
            if (cArray[i] == '(' && cArray[i + 1] == ')') {
                result += stack.size();
                i+=1;
            } else if (cArray[i] == '(')
                stack.push(cArray[i]);
            else if (cArray[i] == ')') {
                stack.pop();
                result += 1;
            }
            i++;
        }

        System.out.println(result);
    }
}
