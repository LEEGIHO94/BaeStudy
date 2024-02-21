import java.io.*;
import java.util.*;

public class Main {
    private static long[] table = new long[1001];
    private static long[] memo = new long[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        //데이터 인입
        int index = 1;
        while (st.hasMoreTokens()) {
            table[index++] = Long.parseLong(st.nextToken());
        }

        //N만큼의 크기는 모두 맥스 값 할당 (최소값을 찾을 때 0이 문제가 되는 거슬 방지하기 위해)
        System.arraycopy(table, 1, memo, 1, N);

        //memo 초기화
        for (int i = 1; i < N + 1; i++) {
            for (int j = i; j > i/2 - 1; j--) {
                memo[i] = Math.min(memo[i],memo[i-j] + memo[j]);
            }
        }
        System.out.println(memo[N]);
    }


}