import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        int king = 1; int queen = 1; int look = 2; int bishop = 2; int kinght = 2; int porn = 8;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        king -= Integer.parseInt(st.nextToken());
        queen -=  Integer.parseInt(st.nextToken());
        look -= Integer.parseInt(st.nextToken());
        bishop -= Integer.parseInt(st.nextToken());
        kinght -= Integer.parseInt(st.nextToken());
        porn -= Integer.parseInt(st.nextToken());
        System.out.println(king + " " + queen + " " + look + " " + bishop + " " + kinght + " " + porn + " ");

    }
}
