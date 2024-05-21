import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] flag;
    static int N;
    static int M;
    static int[] xArr = {-1,1,0,0};
    static int[] yArr = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> answer = new ArrayList<>();
        M = sc.nextInt();
        N = sc.nextInt();
        map = new int[M][N];
        flag = new boolean[M][N];
        int cnt = 0;
        int T = sc.nextInt();

        //init
        while(T-- >0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int i = y1; i < y2;i++){
                for(int j = x1 ; j < x2 ; j++){
                    map[i][j] = 1;
                }
            }
        }

        for(int i = 0 ; i < M ; i++){
            for(int j = 0 ; j < N ; j++){
                if(!flag[i][j] && map[i][j] == 0){
                    cnt++;
                    answer.add(bfs(i,j));
                }
            }
        }
        Collections.sort(answer);
        StringBuilder sb = new StringBuilder();
        answer.forEach(q -> sb.append(q).append(" "));
        System.out.println(cnt);
        System.out.println(sb);
    }

    public static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        int cnt = 0;
        flag[x][y] = true;
        q.offer(new int[]{x,y});
        while(!q.isEmpty()){
            int[] poll = q.poll();
            cnt++;
            for(int i = 0 ; i < 4 ; i++){
                int nX = poll[0] + xArr[i];
                int nY = poll[1] + yArr[i];

                if(checker(nX,nY)){
                    q.offer(new int[]{nX,nY});
                    flag[nX][nY] = true;
                }
            }
        }
        return cnt;
    }
    static boolean checker(int x, int y){
        return x >=0 && y >= 0 && x < M && y<N && map[x][y] == 0 && !flag[x][y];
    }


}
