import java.util.*;
import java.io.*;

public class Main {

    static int[] arr;
    static int[] memo;
    static int N;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = 1;
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        memo = new int[N+1];
        arr[0] =0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        while (st.hasMoreTokens()) {
            arr[index++] = Integer.parseInt(st.nextToken());
        }
//        memo[0] = 1;
        memo[1] = 1;
        System.out.println(dp());
    }

    public static int dp(){
        //dp를 진행할 때 for문을 이용해서 전체 탐색을 진행한다.
        int result = 0;
        for (int i = 1; i <= N; i++) {
            //내부 순환을 통해서 최대값이 기록되어 있는 것을 찾는다.
            memo[i] = 1;

            for (int j = 1; j < i; j++) {
                if (arr[i] < arr[j] && memo[i] <= memo[j] +1) {
                    memo[i] = memo[j] + 1;
                }
            }
            result = Math.max(result, memo[i]);
        }
        //System.out.println(Arrays.toString(memo));
        return result;
    }
}
