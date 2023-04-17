import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int answer = 0;
        
        String[] split = br.readLine().split("");

        for(int i = 0; i < count; i++){
            answer += Integer.parseInt(split[i]);
        }

        
        System.out.println(answer);
    }

}