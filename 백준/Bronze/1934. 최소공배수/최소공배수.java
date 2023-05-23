import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] str = br.readLine().split(" ");
            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);

            int gcd = gcd(A,B);
            int lcm = A*B / gcd;
            System.out.println(lcm);
        }
    }
    public static int gcd(int num1, int num2){
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1%num2);
    }
}
