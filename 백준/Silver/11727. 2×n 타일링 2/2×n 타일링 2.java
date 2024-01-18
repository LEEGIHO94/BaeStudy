import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    static int[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        memo = new int[N <=1 ? 10 : N + 1];
        memo[1] = 1;
        memo[2] = 3;
        System.out.println(dp(N));
    }

    private static int dp(int N) {
        //탈출 조건
        if (memo[N] != 0) {
            return memo[N];
        }
        //루프 조건
        //2 뺀 값이 있을 경우
        if (N - 2 > 0) {
            memo[N] =  (dp(N - 2) + dp(N - 1) + dp(N - 2)) % 10007;
        }
        //1 뺀 값이 존재할 경우
        else
            memo[N] =  dp(N - 1) % 10007;

        return memo[N];
    }
}