
import java.util.*;
import java.io.*;

public class Main {
    static Integer[] memo = new Integer[12];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        memo[1] = 1;
        memo[2] = 2;
        memo[3] = 4;
        for (int i = 0; i < N; i++) {
            Integer result = dp(Integer.parseInt(br.readLine()));
            System.out.println(result);
        }
    }

    private static Integer dp(int N) {
        if (memo[N] == null) {
            if (N > 3) {
                memo[N] = dp(N - 3) + dp(N - 2) + dp(N - 1);
            } else if (N > 2) {
                memo[N] = dp(N - 2) + dp(N - 1);
            } else if (N > 1) {
                memo[N] = dp(N - 1);
            }
        }
        return memo[N];
    }
}
