import java.io.*;
import java.util.*;

public class Main {
    static int[] d;
    static int[] l;
    static int max =1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        l = new int[N+1];
        d = new int[N+1];


        //init
        for (int i = 1; i < N + 1; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.fill(d,1);

        dp();

        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n");
        for (int i = d.length - 1; i > 0; i--) {
            if(d[i] == max) {
                st.push(l[i]);
                max--;
            }
        }

        while(!st.isEmpty()){
            sb.append(st.pop()).append(" ");
        }
        System.out.println(sb);
    }

    public static void dp() {
        for (int i = 1; i < l.length; i++) {
            for (int j = 1; j < i; j++) {
                if (l[i] > l[j]) {
                    d[i] = Math.max(d[i],d[j] + 1);
                    max = Math.max(d[i],max);
                }
            }
        }
    }
}
