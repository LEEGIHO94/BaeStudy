import java.io.*;
import java.util.*;

public class Main {
    private static final int DIFF = 1000000009;
    private static Long[][] memo = new Long[100001][4];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        init();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        for (int input : list) {
            Long sum = (dp(input, 3) + dp(input, 2) + dp(input, 1)) % DIFF;
            System.out.println(sum);
        }

    }

    public static void init() {
        memo[1][1] = 1L;
        memo[1][2] = 0L;
        memo[1][3] = 0L;
        memo[2][1] = 0L;
        memo[2][2] = 1L;
        memo[2][3] = 0L;
        memo[3][1] = 1L;
        memo[3][2] = 1L;
        memo[3][3] = 1L;
    }

    public static Long dp(int input,int index){
        if (input < 1) {
            return 0L;
        }
        if (memo[input][index] != null) {
            return memo[input][index];
        }
        if(index == 1){
            Long num = (dp(input - 1,3) + dp(input - 1,2)) % DIFF;
            memo[input][1] = num;
            return num;
        }
        if (index == 2) {
            Long num = (dp(input - 2, 3) + dp(input - 2, 1))  % DIFF;
            memo[input][2] = num;
            return num;
        }
        if (index == 3) {
            Long num =  (dp(input - 3, 2) + dp(input - 3, 1))  % DIFF;
            memo[input][3] = num;
            return num;
        }
        return 0L;
    }
}
