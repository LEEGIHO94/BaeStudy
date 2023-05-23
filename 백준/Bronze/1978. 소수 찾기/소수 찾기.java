import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int count = 0;
        for (int i = 0; i < loop; i++) {
            if(isPrime(Integer.parseInt(str[i]))) count++;
        }
        System.out.println(count);
    }

    static boolean isPrime(int num) {
        if(num <2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
