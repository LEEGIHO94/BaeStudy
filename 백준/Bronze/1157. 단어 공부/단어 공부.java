import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alpa = new int[30];

        for(char ch : br.readLine().toCharArray()){
                if(ch >= 'a')
                    alpa[ch - 'a']++;
                else if(ch >= 'A')
                    alpa[ch - 'A']++;
        }

        int max = -1;
        char ch = '?';
        for (int i = 0; i < alpa.length; i++) {
            if(max < alpa[i]){
                max = alpa[i];
                ch = (char) (i + 'A');
            }
            else if(max == alpa[i]){
                ch = '?';
            }
        }

        System.out.println(ch);


    }
}

//틀렸던 이유 : 대소문자의 char 순서 차이
