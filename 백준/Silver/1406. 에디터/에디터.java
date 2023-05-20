

import java.util.*;
import java.io.*;

public class Main {
    static Stack<String> left = new Stack<>();
    static Stack<String> right = new Stack<>();
    static int length;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] tmp = br.readLine().split("");
        for (String str : tmp) {
            left.push(str);
        }
        length = Integer.parseInt(br.readLine());

        for (int i = 0; i < length; i++) {
            String input = br.readLine();
            switch(input){
                case "L" :
                    if(!left.isEmpty()) right.push(left.pop()); break;
                case "D" :
                    if(!right.isEmpty()) left.push(right.pop()); break;
                case "B" :
                    if(!left.isEmpty()) left.pop(); break;
                default:
                    left.push(String.valueOf(input.charAt(2)));
            }
        }

        while (!left.isEmpty()) {
            right.push(left.pop());
        }
        while(!right.isEmpty()){
            sb.append(right.pop());
        }
        System.out.println(sb);
    }
}
