import java.io.*;
import java.util.*;

public class Main {
    static Integer[][] memo;
    static int DIFF = 1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        memo = new Integer[N + 1][10];
        init();
        long sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += dp(N, i);
            sum %= DIFF;
        }

        System.out.println(sum);
    }

    public static void init() {
        memo[1][0] = 0;

        for (int i = 1; i < 10; i++) {
            memo[1][i] = 1;
        }
    }

    public static int dp(int input, int index) {
        //탈출 조건
        if (input < 1) {
            return 0;
        }
        if (memo[input][index] != null) {
            return memo[input][index];
        }
        //재귀

        //전부 없을 경우
        if (index == 9)
            return memo[input][index] = dp(input - 1, index - 1) % DIFF;
        if (index == 0)
            return memo[input][index] = dp(input - 1, index + 1) % DIFF;
        else
            return memo[input][index] = (dp(input - 1, index - 1) + dp(input - 1, index + 1)) % DIFF;
    }
}