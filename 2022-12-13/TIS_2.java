import java.util.*;

/*
정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

24	[1, 2, 3, 4, 6, 8, 12, 24]
*/
public class Solution {
    public int[] solution(int n) {
        List<Integer> integerList = new ArrayList<>();
        for(int i = 1 ; i<=n;i++){
            if(n%i==0){
                integerList.add(i);
            }
        }
        return  integerList.stream().mapToInt(i->i).toArray();
    }
}
