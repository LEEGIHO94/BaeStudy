import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] visit;
    static char[][] l;
    static int N;
    static int count = 0;
    static int countR = 0;
    static int[] dx = {-1,0,0,1};
    static int[] dy = {0,-1,1,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        l = new char[N][N];
        visit = new boolean[N][N];

        //init
        for (int i = 0; i < N; i++) {
            char[] chars = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                l[i][j] = chars[j];
            }
        }

        //logic
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visit[i][j]){
                    dfs(i,j,l[i][j]);
                    count++;
                }
                if(l[i][j] == 'G')
                    l[i][j] ='R';
            }
        }

        visit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visit[i][j]){
                    dfs(i,j,l[i][j]);
                    countR++;
                }
            }
        }

        System.out.printf("%d %d",count,countR);
    }

    static void dfs(int x , int y,char target){
        //탈출
        if(visit[x][y])
            return;

        //같은 곳이라면 방문 체크
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(checker(nx,ny,target)){
                dfs(nx,ny,target);
            }
        }
    }
    static boolean checker(int x, int y,char target){
        return x >= 0 && x < N && y >= 0 && y < N && l[x][y] == target;
    }

}
