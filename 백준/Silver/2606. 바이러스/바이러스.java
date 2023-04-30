import java.util.*;
import java.io.*;
/*
* 완전 탐색 문제 BFS DFS 둘중 하나 이용해서 풀면 된다.
* 1. BFS 이용해서 풀자
* */
public class Main {

    static int[][] map;
    static boolean[][] visited;
    static Map<Integer,Integer> result = new HashMap<>();


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int limit = Integer.parseInt(br.readLine());
        int from = 0;
        int to = 0;
        //초기화
        //연산을 편하게 하기 위해 각각의 배열에 한줄을 추가했다.
        map = new int[N+1][N+1];
        visited = new boolean[N+1][N+1];

        for (int i = 0; i < limit; i++) {
            String[] tmp = br.readLine().split(" ");
            from = Integer.parseInt(tmp[0]);
            to = Integer.parseInt(tmp[1]);

            map[from][to] = 1;
            map[to][from] = 1;
        }
            aux(1);

        /*
        * 수도 코드
        * 1번 PC가 바이러스가 걸렸을 때 바이러스에 걸리게 되는 컴퓨터의 수를 출력한다.
        * 순회의 시작
        * for문을 이용해서 순회를 시작한다.
        * 1번지를 먼저 뒤지고, 2번지를 뒤지는 방법으로 찾을 것이다.
        *
        * 1번이랑 연결이 되어 있지 않은 것들 중에 찾아야하는 것들이 있을 경우 문제가 생긴다. 이 점을 다시 생각해보자.
        * */

        System.out.println(result.size() -1);
    }

    //실제 동작 루프
    static void aux(int to) {
        //탈출 조건
        if (to >= map.length){
            return;
        }

        //순회
        for (int i = 1; i < map.length; i++) {
            if (!visited[to][i]) {
                visited[to][i] = true;
                visited[i][to] = true;

                if (map[to][i] == 1) {
                    result.put(to, 1);
                    result.put(i,1);
                    aux(i);
                }
            }
        }
    }

}
