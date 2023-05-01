import java.util.*;
import java.io.*;

public class Main {
    static int limit , source, destination;

    static Map<Integer,Integer> table = new HashMap<>();
    static int[] visit ;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        //초기화
        limit = tmp[0] + 2;
        source = tmp[1];
        destination = tmp[2];
        table.put(0,tmp[3]);
        table.put(1,-tmp[4]);
        visit = new int[limit];
        int result = 0;
        if(source == destination){
            result = 0;
        }else{
        result = BFS(source, destination);
        }

        System.out.println(result!= -1?result : "use the stairs");
    }
/*
* 해당 목적지를 도착하는 최솟값이 필요하다.
* 배열이 필요하다. -> 배열이 1개 필요 (방문 여부 체크하는 테이블 필요)
* 갯수 측정 필요 -> count 변수 하나 필요
*   초기화 여부 체크 필요
* 배열의 길이 벗어나는지 검증하는 검증 메서드 필요
* BFS 활용 -> 큐를 이용해야한다.
* 1번지부터 로직을 실행해야한다. -> +1 해줘야한다.
* */
    private static int BFS(int source, int destination) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visit[source] = 1;
        while(!q.isEmpty()){
            int tmp = q.poll();


            for (int i = 0; i < 2; i++) {
                 int next =tmp + table.get(i);

                if (isValid(next)) {
                    q.add(next);
                    visit[next] = visit[tmp] + 1;
                }

                if (next == destination) {
                    return visit[tmp] ;
                }
            }
        }
        return -1;
    }
    private static boolean isValid(int num) {
        return num > 0 && num < limit && visit[num] == 0;
    }
}
