import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    private static int[][] memo = new int[1001][3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            memo[i][1] = Integer.parseInt(st.nextToken());
            memo[i][2] = 1;
        }
        //배열의 첫 부분 초기화

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                if (memo[i][1] > memo[j][1]) {
                    memo[i][2] = Math.max(memo[i][2],memo[j][2]+1);
                }else if(memo[i][1] == memo[j][1])
                    memo[i][2] = Math.max(memo[i][2],memo[j][2]);
            }
        }

        for (int i = 1; i <= N; i++) {
            result = Math.max(result, memo[i][2]);
        }
        System.out.println(result);
    }
}