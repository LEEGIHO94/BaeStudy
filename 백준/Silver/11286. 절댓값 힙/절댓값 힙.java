import java.io.*;
import java.util.*;
import java.math.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int testCase = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>(
                (o1,o2) -> 
                {if(Math.abs(o1) > Math.abs(o2)) 
                    return Math.abs(o1) - Math.abs(o2);
                else if(Math.abs(o1) == Math.abs(o2))
                    return o1-o2;
                else
                    return -1;
                });

        while(testCase-->0){
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                sb.append(q.isEmpty() ? 0 : q.poll()).append("\n");
            }else q.add(n);
        }
        System.out.println(sb);
    }


    
}
