
import java.io.*;
import java.util.*;

public class Main {
    static int[][] l ;
    static int[][] dp;
    static int N;
    static int M;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,-1,0,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        l = new int[N][M];
        dp = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                l[i][k] = sc.nextInt();
                dp[i][k] = -1;
            }
        }
        int dfs = dfs(0, 0);
        System.out.println(dfs);
    }

    static int dfs(int x,int y) {
        if(x == N -1 && y == M - 1){
            return 1;
        }

        //계산한 적이 잇는 경우
        if(dp[x][y] != -1)
            return dp[x][y];

        dp[x][y] = 0;


        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            //
            if(checker(nx,ny,l[x][y])){
                dp[x][y] += dfs(nx,ny);
            }
        }
        return dp[x][y];
    }

    static boolean checker(int x, int y, int target){
        return x >=0 && y >=0 && x< N && y<M && l[x][y]<target;
    }
}
