import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //init
        int l = 0 , ans = 0;
        boolean f = false;

        for (char c : br.readLine().toCharArray()) {
            if (c == '(') {
                l++;
                f = false;
            }
            else{
                l--;
                if(!f) ans+=l;
                else ans++;
                f = true;
            }
        }
        System.out.println(ans);
    }
}