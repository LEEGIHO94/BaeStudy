import java.io.*;
import java.util.Arrays;

public class Main {
    static int[][] memo = new int[1001][10];
    static int diff = 10007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        //init
        Arrays.fill(memo[1], 1);

        for (int i = 0; i < memo[N].length; i++) {
            sum += dp(N,i);
            sum %= diff;
        }
        System.out.println(sum);
    }

    public static int dp(int N, int index) {
        if(N >0 && index >= 0 && memo[N][index] != 0)
            return memo[N][index];
        //이전 배열의 값을 조회하기 위해

        for(int j = 0 ; j <= index ; j++){
            memo[N][index] += dp(N-1, j);
            memo[N][index] %= diff;
        }


        return memo[N][index] % diff;
    }
}
