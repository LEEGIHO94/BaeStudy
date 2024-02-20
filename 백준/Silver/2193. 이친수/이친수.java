import java.io.*;
import java.util.*;

public class Main {
    private static Long[][] memo = new Long[91][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        init();
        long sum = 0;
        for (int i = 0; i < 2; i++) {
            sum += dp(N, i);
        }
        System.out.println(sum);
    }

    private static void init() {
        memo[1][0] = 0L;
        memo[1][1] = 1L;
        memo[2][0] = 1L;
        memo[2][1] = 0L;

    }

    private static long dp(int input, int index) {
        if (memo[input][index] != null)
            return memo[input][index];

        if (index == 0) {
            return memo[input][index] = dp(input - 1,0) + dp(input - 1,1);
        }
        else
            return memo[input][index] = dp(input -1, 0);
    }
}

