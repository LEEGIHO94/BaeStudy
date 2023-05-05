import java.util.*;
import java.io.*;

/*
 * 높이가 존재하는 테이블이 하나 존재한다.
 * 안전지역이 몇게인가 체크
 * 테이블은 정사각형
 * DFS를 이용해야한다.
 * count틑 배열을 가지고 있어야한다.
 * 강우량의 최댓값이 존재한다. 최댓값을 찾는 방법과 최댓값을 검증하는 방법 중 선택해야한다.
 * look-up 배열을 하나 만들어야한다.
 * visited 배열을 하나 만들어야한다.
 * 강우량을 1부터 모두다 조사해야한다 그렇기 때문에 초기화가 visited의 초기화가 중요할 것이라고 생각한다.
 * */

public class Main {
    /*
     * 수도코드
     * 1. map 을 채울 수 있는 초기화를 진행한다.
     * 2. loop-up 테이블(배열 2개)를 만들어서 진행할 때마다 이동할 수 있는 값을 추가한다.
     * 3. isValid() 메서드를 구현해야한다.
     * 4. 총 안전지대 수를 세야하는데 리스트 or 배열을 이용해야 될 것 같다.
     *   4-1. 최대 강우량을 알 수 있으면 배열을 이용하면 될 것 같다.
     * 5. visited 배열을 초기화 한싸이클의 루프가 끝나고 배열을 초기화 해줘야한다.
     *
     * */
    static int[][] map;
    static int[] rowArr = {0, 0, 1, -1};
    static int[] colArr = {1, -1, 0, 0};

    static boolean[][] visited;
    static int[] count;
    static int length;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        length = Integer.parseInt(br.readLine()) + 1;

        map = new int[length][length];

        max = 0;
        //map 초기화 및 최대 강우량 측정
        for (int i = 1; i < length; i++) {
            String[] tmp = br.readLine().split(" ");
            for (int j = 0; j < tmp.length; j++) {
                map[i][j + 1] = Integer.parseInt(tmp[j]);
                max = Math.max(max, Integer.parseInt(tmp[j]));
            }
        }

        count = new int[max + 1];

        for (int criterion = 1; criterion <= max; criterion++) {
            //이곳에 선언한 이유는 DFS 돌 때 마다 초기화 필요하기 때문에
            visited = new boolean[length][length];
            
            //전체 로직을 순회한다.
            for (int i = 1; i < length; i++) {
                for (int j = 1; j < length; j++) {
                    if (!visited[i][j] && isValid(i, j, criterion)) {
                        DFS(criterion, i, j);
                        count[criterion]++;
                    }
                }
            }
        }
        
        int result = Arrays.stream(count).max().orElse(1);
        if(result == 0) result++;
        System.out.println(result);
    }

    private static void DFS(int criterion, int row, int col) {
        visited[row][col] = true;
        for (int k = 0; k < 4; k++) {
            int moveRow = row + rowArr[k];
            int moveCol = col + colArr[k];
            if (isValid(moveRow, moveCol,criterion) && !visited[moveRow][moveCol]) {
                DFS(criterion,moveRow,moveCol);
            }
        }
    }


    private static boolean isValid(int row, int col, int criterion) {
        return col > 0 && col < length && row > 0 && row < length && map[row][col] > criterion;
    }
}
