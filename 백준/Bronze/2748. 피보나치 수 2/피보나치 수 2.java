

import java.util.*;
import java.io.*;

public class Main {
    static long[] dp ;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        dp = new long[length+1];
        dp[0] = 0L;
        dp[1] = 1L;

        memo(length+1);
        System.out.println(dp[length]);
    }

    public static void memo(int length) {
        for (int i = 2; i < length; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
    }
}
