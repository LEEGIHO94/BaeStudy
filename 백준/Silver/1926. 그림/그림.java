import java.util.*;


public class Main {

    static int[][] map;
    static boolean[][] flag;
    static int[] xArr = new int[]{1,0,0,-1};
    static int[] yArr = new int[]{0,1,-1,0};
    static int N;
    static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][M];
        flag = new boolean[N][M];

        int max = 0;
        int cnt = 0;

        //init data
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] == 1 && !flag[i][j]){
                    cnt++;
                    max = Math.max(max,bfs(i,j));
                }
            }
        }
        System.out.println(cnt);
        System.out.println(max);
    }

    public static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        int area = 0;

        q.offer(new int[]{x,y});
        flag[x][y] = true;

        while(!q.isEmpty()){
            area++;
            int[] temp = q.poll();

            for (int i = 0; i < 4; i++) {
                if(checker(temp[0] + xArr[i], temp[1] + yArr[i])){
                    q.offer(new int[]{temp[0] + xArr[i], temp[1] + yArr[i]});
                    flag[temp[0] + xArr[i]][temp[1] + yArr[i]] = true;
                }
            }
        }
        return area;
    }

    //기본 경계 값, map == 1 , flag false 인 것들만을 체크
    public static boolean checker(int x, int y){
        return x>=0 && x < N && y >= 0 && y < M  && map[x][y] == 1 && !flag[x][y];
    }

}
