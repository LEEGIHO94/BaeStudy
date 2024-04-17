import java.io.*;

public class Main {
    static int[] d;
    static int count = 0;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine()) + 1;
        d = new int[N];

        dfs(1);
        System.out.println(count);
    }

    public static void dfs(int depth) {
        if(depth == N){
            count++;
            return;
        }

        for (int i = 1; i < d.length; i++) {
            d[depth] = i;

            if(checker(depth)){
                dfs(depth + 1);
            }
        }
    }

    public static boolean checker(int col) {
        for (int i = 1; i < col; i++) {
            //같은 열 일 때
            if(d[col] == d[i])
                return false;
            //대각 일 때
            else if(Math.abs(col - i) == Math.abs(d[col] - d[i]))
                return false;
        }
        return true;
    }
}
/*
* 틀린 이유
* 1. N의 값을 행 열로 사용하면서 경우의 수로 비교
*   -> 1부터 시작할 때 N 값에 1을 더해야한다.
* 
* */