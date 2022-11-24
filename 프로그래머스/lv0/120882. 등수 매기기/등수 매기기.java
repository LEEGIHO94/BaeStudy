import java.util. *;
import java.util.stream.DoubleStream;
class Solution {
    public int[] solution(int[][] score) {
            List<Double> ls = new ArrayList<>();


            for (int[] ints : score) ls.add(Double.sum(ints[0], ints[1]) / 2);
            System.out.println(ls.toString());
            List<Double> ls2 = new ArrayList<>(ls);
            ls2.sort(Comparator.reverseOrder());    //내림 차순 정렬
            System.out.println(ls2.toString());
            double[] result = ls.stream().mapToDouble(e->
            {for(Double num : ls2)
                if(e.equals(num)){
                   return ls2.indexOf(num) + 1;}
                return 0;
            }).toArray();
            return DoubleStream.of(result).mapToInt(d->(int) Math.ceil(d)).toArray();


    }
}