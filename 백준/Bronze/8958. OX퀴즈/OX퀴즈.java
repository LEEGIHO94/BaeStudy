import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        while (i-- > 0) {
            int sum = 0;
            int n = 0;

            for (char c : br.readLine().toCharArray()) {
                if (c == 'X') n = 0;
                else n++;
                sum += n;
            }
            System.out.println(sum);
        }
    }
}
