import java.util.*;
class Solution {
    public int solution(String s) {
        int sum = 0;
        String[] dummy = s.split(" ");
        List<String> dummy0 = new ArrayList<>(Arrays.asList(dummy));
        int num = dummy0.indexOf("Z");              //todo 2번지라고 하면 >>> 이게 서칭의 마지막 값이어야함
        System.out.println(num);
        while(num>0) {                          //note 초기 값이 2다 그렇다면?
            num = dummy0.indexOf("Z");      //todo 이거는 서칭을 할때 필요한 값이기 때문에
            dummy0.remove(num-1);
            dummy0.remove(num-1);     //todo 두번 사용하는 이유! num을 삭제하면 리스트가 재배열 된다. >> 한칸이 줄어든다.
            num = dummy0.indexOf("Z");
        }
        for(String e : dummy0)
            sum+= Integer.parseInt(e);

      return sum;
    }
}