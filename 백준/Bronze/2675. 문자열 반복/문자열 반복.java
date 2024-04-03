import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-- >0){
            StringBuffer sb = new StringBuffer();

            StringTokenizer st = new StringTokenizer(br.readLine());

            int repeat = Integer.parseInt(st.nextToken());
            String value = st.nextToken();

            for (char ch : value.toCharArray()) {
                sb.append(String.valueOf(ch).repeat(repeat));
            }

            System.out.println(sb);
        }
    }

}
