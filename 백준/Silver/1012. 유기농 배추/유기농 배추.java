import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] flag;
    static int[] xArr = {-1,1,0,0};
    static int[] yArr = {0,0,-1,1};
    static int N;
    static int M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-->0){
            aux(sc);
        }
    }
    
    public static void aux(Scanner sc){
        int cnt = 0;
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[M][N];
        flag = new boolean[M][N];

        int K = sc.nextInt();

        //init
        while(K-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            map[y][x] = 1;
        }

        for(int i = 0 ; i < M;i++){
            for(int j = 0;j < N; j++){
                if(!flag[i][j] && map[i][j] == 1){
                    bfs(i,j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    public static void bfs(int x, int y){
        Queue<int[]> e = new LinkedList<>();
        flag[x][y] = true;
        e.offer(new int[]{x,y});

        while(!e.isEmpty()){
            int[] poll = e.poll();

            for(int i = 0 ; i < 4 ; i++){
                int nX = poll[0] + xArr[i];
                int nY = poll[1] + yArr[i];

                if(checker(nX,nY)){
                    e.offer(new int[]{nX,nY});
                    flag[nX][nY] = true;
                }
            }
        }
    }

    public static boolean checker(int x, int y){
        return x >=0 && y >= 0 && x < M && y <N && !flag[x][y] && map[x][y] == 1;
    }
}
