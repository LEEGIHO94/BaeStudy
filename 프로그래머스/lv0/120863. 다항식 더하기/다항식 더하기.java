import java.util.StringTokenizer;
class Solution {
    public String solution(String polynomial) {
        int[] result = new int[2];
        StringTokenizer st = new StringTokenizer(polynomial,"+ ");
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            if (tmp.contains("x")) {
                if(tmp.length()==1)
                    result[0] ++;
                else
                    result[0] += Integer.parseInt(tmp.substring(0, tmp.length() - 1));
            } else {
                result[1] += Integer.parseInt(tmp);
            }
        }

        //분류 해라 case  HowTo  x = 1 일때 x + ~~~ x는 0 일 때 ~~~ 그외 숫자x + ~~
        switch (result[0]) {
            case 0 : return result[1] ==0 ? "" : ""+result[1];
            case 1 : return result[1] ==0 ? "x" : "x + "+result[1];
            default: return result[1] ==0 ? result[0] + "x" : result[0] + "x + "+result[1];
        }

    }
}
