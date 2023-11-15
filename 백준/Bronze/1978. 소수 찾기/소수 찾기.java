import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] prime = new boolean[1001];

    public static void main(String[] args) throws IOException {
        findPrime();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        for (int i = 0; i < index; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num >= 1 && num <= 1000 && !prime[num]) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void findPrime() {
        prime[1] = true;
        for (int i = 2; i <= 1000; i++) {
            if (prime[i] == false) {
                for (int j = i + i; j <= 1000; j += i) {
                    prime[j] = true;
                }
            }
        }
    }
}
