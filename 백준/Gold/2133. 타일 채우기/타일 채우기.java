import java.io.*;
import java.util.*;

public class Main {
    static Integer[] d = new Integer[31];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        d[0] = 1;
        d[2] = 3;

        int N = Integer.parseInt(br.readLine());
        System.out.println(dp(N));
    }

    public static int dp(int N){
        if(N % 2 != 0)
            return 0;
        if(d[N] != null)
            return d[N];

        d[N] = dp(N-2) * d[2];
        for(int i = N - 4 ; i >= 0 ; i = i - 2){
            d[N] += dp(i) * 2;
        }
        return d[N];
    }
}